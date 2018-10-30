package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import bean.Fichada;
import hbt.HibernateUtil;

public class FichadaDAO {
	private static FichadaDAO instancia = null;
	private static SessionFactory sf = null;
	
	public static FichadaDAO getInstancia(){
		if (instancia == null){
			sf = HibernateUtil.getSessionFactory();
			instancia = new FichadaDAO();
		}
		return instancia;
	}
	
	public void grabarFichada(Fichada fichada) {
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		session.merge(fichada);
		session.flush();
		session.getTransaction().commit();
	}
	
	public void grabarFichadas (List<Fichada> fichadas){
		Session session = sf.openSession();
		session.beginTransaction();
		for (Fichada fichada:fichadas){
			session.merge(fichada);
		}
		session.flush();
		session.getTransaction().commit();
		session.close();
	}

	public List<Fichada> getFichadasByCliente(int idCliente){
		Session session = sf.openSession();
		@SuppressWarnings("unchecked")
			List<Fichada> list = session.createQuery("from Fichada F INNER JOIN F.Empleado E INNER JOIN Cliente C WHERE C.id =" + idCliente).list();
		session.close();
		return list;
	}
	
	public List<Fichada> getFichadasByEmpleados(String empleados){
		Session session = sf.openSession();
		@SuppressWarnings("unchecked")
			List<Fichada> list = session.createQuery("from Fichada F WHERE F.empleado in (" + empleados +")").list();
		session.close();
		return list;
	}
	
	
}

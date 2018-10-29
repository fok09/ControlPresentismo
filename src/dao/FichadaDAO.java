package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import bean.Cliente;
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
	
	public void grabarFichada (List<Fichada> fichadas){
		Session session = sf.openSession();
		session.beginTransaction();
		for (Fichada fichada:fichadas){
			session.merge(fichada);
		}
		session.flush();
		session.getTransaction().commit();
		session.close();
	}

}

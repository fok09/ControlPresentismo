package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import bean.Cliente;
import bean.Contratacion;
import hbt.HibernateUtil;

public class ContratacionDAO {
	private static ContratacionDAO instancia = null;
	private static SessionFactory sf = null;
	
	public static ContratacionDAO getInstancia(){
		if (instancia == null){
			sf = HibernateUtil.getSessionFactory();
			instancia = new ContratacionDAO();
		}
		return instancia;
	}
	
	public void grabarContratacion (List<Contratacion> contrataciones){
		Session session = sf.openSession();
		session.beginTransaction();
		for (Contratacion contratacion:contrataciones){
			session.merge(contratacion);
		}
		session.flush();
		session.getTransaction().commit();
		session.close();
	}
}

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
	
	public int grabarContratacion(Contratacion contratacion) {
		int ultimo;
		String sql = "SELECT max( C.id ) FROM Contratacion C";
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		session.merge(contratacion);
		ultimo = (Integer) session.createQuery( sql ).uniqueResult();
		session.flush();
		session.getTransaction().commit();
				
		return ultimo;
	}
	
//	public int leerUltima() {
//		int ultimo;
//		Session session = sf.getCurrentSession();
//		session.beginTransaction();
//		session.merge(contratacion);
//		session.flush();
//		
//		session.getTransaction().commit();
//		session.close();
//		
//		
//		return ultimo;
//	}
	public Contratacion getByClienteId(int idCliente) {
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		Contratacion cont = (Contratacion) session.createQuery("FROM Contratacion CO INNER JOIN Cliente C WHERE C.id = " + idCliente).uniqueResult();
		session.getTransaction().commit();
		session.close();
		return cont;
	}
	
	public List<Contratacion> getContratacionesByClienteId(int idCliente){
		Session session = sf.openSession();
		@SuppressWarnings("unchecked")
		List<Contratacion> list = session.createQuery("FROM Contratacion").list();
		session.close();
		return list;
	}
	
	public List<Contratacion> getContrataciones(){
		Session session = sf.openSession();
		@SuppressWarnings("unchecked")
		List<Contratacion> list = session.createQuery("FROM Contratacion").list();
		session.close();
		return list;
	}
	
	public Contratacion getById(int id) {
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		Contratacion result = (Contratacion) session.get(Contratacion.class, id);
		session.getTransaction().commit();
		return result;
	}
	
	
}

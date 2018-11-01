package dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import bean.Servicio;
import hbt.HibernateUtil;

public class ServicioDAO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static ServicioDAO instancia = null;
	private static SessionFactory sf = null;
	
	public static ServicioDAO getInstancia(){
		if (instancia == null){
			sf = HibernateUtil.getSessionFactory();
			instancia = new ServicioDAO();
		}
		return instancia;
	}
	
	public void grabarServicio(Servicio servicio) {
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		session.merge(servicio);
		session.flush();
		session.getTransaction().commit();
	}
	
	public Servicio getById(int id) {
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		Servicio result = (Servicio) session.get(Servicio.class, id);
		session.getTransaction().commit();
		return result;
	}
	
	public Servicio getByNombre(String nombreServicio) {
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		Servicio servicio = (Servicio) session.createQuery("FROM Servicio E WHERE E.nombre = " + nombreServicio).uniqueResult();
		session.getTransaction().commit();
		return servicio;
	}
	
	public List<Servicio> getServicios(){
		Session session = sf.openSession();
		@SuppressWarnings("unchecked")
		List<Servicio> list = session.createQuery("from Servicio").list();
		session.close();
		return list;
	}

}

package dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import bean.Cliente;
import bean.Empleado;
import hbt.HibernateUtil;

public class EmpleadoDAO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static EmpleadoDAO instancia = null;
	private static SessionFactory sf = null;

	public static EmpleadoDAO getInstancia(){
		if (instancia == null){
			sf = HibernateUtil.getSessionFactory();
			instancia = new EmpleadoDAO();
		}
		return instancia;
	}
	
	public void grabarEmpleado(Empleado empleado) {
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		session.merge(empleado);
		session.flush();
		session.getTransaction().commit();
		session.close();
	}
	
	public void grabarEmpleados (List<Empleado> empleados){
		Session session = sf.openSession();
		session.beginTransaction();
		for (Empleado empleado:empleados){
			session.merge(empleado);
		}
		session.flush();
		session.getTransaction().commit();
		session.close();
	}
	
	public Empleado getById(int id) {
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		Empleado result = (Empleado) session.get(Empleado.class, id);
		session.getTransaction().commit();
		return result;
	}
	
//	public Empleado getByDni(int dni) {
//		Session session = sf.getCurrentSession();
//		session.beginTransaction();
//		Empleado result = (Empleado) session.get(Empleado.class, dni);
//		session.getTransaction().commit();
//		System.out.println(result.getDni());
//		return result;
//	}
	
	public void eliminarEmpleado(Empleado e) {
		Session session = sf.openSession();
		session.beginTransaction();
		session.delete(e);
		session.flush();
		session.getTransaction().commit();
		session.close();	
	}
	
	public List<Empleado> getEmpleados(){
		Session session = sf.openSession();
		@SuppressWarnings("unchecked")
		List<Empleado> list = session.createQuery("from Empleado").list();
		session.close();
		return list;
	}
			
}

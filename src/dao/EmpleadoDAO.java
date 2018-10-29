package dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import bean.Empleado;
import hbt.HibernateUtil;

public class EmpleadoDAO implements Serializable{
	private static EmpleadoDAO instancia = null;
	private static SessionFactory sf = null;

	public static EmpleadoDAO getInstancia(){
		if (instancia == null){
			sf = HibernateUtil.getSessionFactory();
			instancia = new EmpleadoDAO();
		}
		return instancia;
	}
	
	public void grabarEmpleado (List<Empleado> empleados){
		Session session = sf.openSession();
		session.beginTransaction();
		for (Empleado empleado:empleados){
			session.merge(empleado);
		}
		session.flush();
		session.getTransaction().commit();
		session.close();
	}
}

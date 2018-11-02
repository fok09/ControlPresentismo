package dao;

import java.io.Serializable;

import org.hibernate.SessionFactory;

import hbt.HibernateUtil;

public class ReporteDAO implements Serializable {

	private static final long serialVersionUID = 1L;

	private static ReporteDAO instancia = null;
	private static SessionFactory sf = null;

	public static ReporteDAO getInstancia() {
		if (instancia == null) {
			sf = HibernateUtil.getSessionFactory();
			instancia = new ReporteDAO();
		}
		return instancia;
	}

}

package hbt;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import bean.Cliente;
import bean.Contratacion;
import bean.CuentaCorriente;
import bean.Empleado;
import bean.Factura;
import bean.Fichada;
import bean.PersonaFisica;
import bean.PersonaJuridica;
import bean.Servicio;


public class HibernateUtil {
	private static final SessionFactory sessionFactory;
	static {
		try {
			System.getProperty("java.security.policy");
			Configuration config = new Configuration();
			config.addAnnotatedClass(Cliente.class);
			config.addAnnotatedClass(Contratacion.class);
			config.addAnnotatedClass(CuentaCorriente.class);
			config.addAnnotatedClass(Empleado.class);
			config.addAnnotatedClass(Servicio.class);
			config.addAnnotatedClass(Factura.class);
			config.addAnnotatedClass(Fichada.class);
			config.addAnnotatedClass(PersonaFisica.class);
			config.addAnnotatedClass(PersonaJuridica.class);
			sessionFactory = config.buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}

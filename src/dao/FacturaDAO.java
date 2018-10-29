package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import bean.Cliente;
import bean.Factura;
import hbt.HibernateUtil;

public class FacturaDAO {
	private static FacturaDAO instancia = null;
	private static SessionFactory sf = null;
	
	public static FacturaDAO getInstancia(){
		if (instancia == null){
			sf = HibernateUtil.getSessionFactory();
			instancia = new FacturaDAO();
		}
		return instancia;
	}
	
	public void grabarFactura (List<Factura> facturas){
		Session session = sf.openSession();
		session.beginTransaction();
		for (Factura factura:facturas){
			session.merge(factura);
		}
		session.flush();
		session.getTransaction().commit();
		session.close();
	}

}

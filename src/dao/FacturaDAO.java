package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import bean.Cliente;
import bean.Empleado;
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
	
	public void grabarFactura(Factura factura) {
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		session.merge(factura);
		session.flush();
		session.getTransaction().commit();
	}
	
	public void grabarFacturas (List<Factura> facturas){
		Session session = sf.openSession();
		session.beginTransaction();
		for (Factura factura:facturas){
			session.merge(factura);
		}
		session.flush();
		session.getTransaction().commit();
		session.close();
	}
	
	public List<Factura> getFacturas(){
		Session session = sf.openSession();
		@SuppressWarnings("unchecked")
		List<Factura> list = session.createQuery("from Factura").list();
		session.close();
		return list;
	}
	
	public List<Factura> getFacturasByCliente(int idCliente){
		Session session = sf.openSession();
		@SuppressWarnings("unchecked")
		List<Factura> list = session.createQuery("from Factura E WHERE E.cliente =" + idCliente).list();
		session.close();
		return list;
	}
	
	public Factura getFacturaByNro(int nroFac) {
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		Factura result = (Factura) session.get(Factura.class, nroFac);
		session.getTransaction().commit();
		return result;
	}

}

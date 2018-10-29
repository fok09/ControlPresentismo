
package dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import bean.Cliente;
import hbt.HibernateUtil;

public class ClienteDAO implements Serializable{
	private static ClienteDAO instancia = null;
	private static SessionFactory sf = null;
	
	public static ClienteDAO getInstancia(){
		if (instancia == null){
			sf = HibernateUtil.getSessionFactory();
			instancia = new ClienteDAO();
		}
		return instancia;
	}
	
	public void grabarCliente (List<Cliente> clientes){
		Session session = sf.openSession();
		session.beginTransaction();
		for (Cliente cliente:clientes){
			session.merge(cliente);
		}
		session.flush();
		session.getTransaction().commit();
		session.close();
	}

}

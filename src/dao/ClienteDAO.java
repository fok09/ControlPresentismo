
package dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import bean.Cliente;
import bean.PersonaFisica;
import bean.PersonaJuridica;
import hbt.HibernateUtil;

public class ClienteDAO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static ClienteDAO instancia = null;
	private static SessionFactory sf = null;
	
	public static ClienteDAO getInstancia(){
		if (instancia == null){
			sf = HibernateUtil.getSessionFactory();
			instancia = new ClienteDAO();
		}
		return instancia;
	}
	
	public void grabarCliente(Cliente cliente) {
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		session.merge(cliente);
		session.flush();
		session.getTransaction().commit();
		session.close();
	}
	
	public void grabarClientes (List<Cliente> clientes){
		Session session = sf.openSession();
		session.beginTransaction();
		for (Cliente cliente:clientes){
			session.merge(cliente);
		}
		session.flush();
		session.getTransaction().commit();
		session.close();
	}
	
	public void grabarPersonaJuridica(PersonaJuridica personaJuridica) {
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		session.merge(personaJuridica);
		session.flush();
		session.getTransaction().commit();
		session.close();
	}
	
	public void grabarPersonaFisica(PersonaFisica personaFisica) {
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		session.merge(personaFisica);
		session.flush();
		session.getTransaction().commit();
		session.close();
	}
	
	public Cliente getById(int id) {
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		Cliente result = (Cliente) session.get(Cliente.class, id);
		session.getTransaction().commit();
		return result;
	}
	
	public Cliente getByCuit(String cuit) {
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		Cliente cliente = (Cliente) session.createQuery("FROM Cliente E WHERE E.cuit_cuil = " + cuit).uniqueResult();
		session.getTransaction().commit();
		return cliente;
	}
	
	public List<Cliente> getClientes(){
		Session session = sf.openSession();
		@SuppressWarnings("unchecked")
		List<Cliente> list = session.createQuery("from Cliente").list();
		session.close();
		return list;
	}
	
	public List<PersonaJuridica> getClientesJuridicos(){
		Session session = sf.openSession();
		@SuppressWarnings("unchecked")
		List<PersonaJuridica> list = session.createQuery("from Cliente").list();
		session.close();
		return list;
	}

	public PersonaJuridica getPersonaJuridicaByIdCliente(int idCliente) {
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		PersonaJuridica result = (PersonaJuridica) session.get(Cliente.class, idCliente);
		session.getTransaction().commit();
		return result;
	}
	
}

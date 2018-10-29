package hbt;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;

import bean.Cliente;
import bean.Empleado;

public class testHibernate {

	public static void main(String[] args) {
		SessionFactory sf = null;
		sf = HibernateUtil.getSessionFactory();

		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		Cliente cliente3 = new Cliente();
		
		List<Empleado> empleados = new ArrayList<Empleado>();
		Empleado empleado1 = new Empleado();
		Empleado empleado2 = new Empleado();
		Empleado empleado3 = new Empleado();

	}

}

package hbt;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;

import bean.Cliente;
import bean.Empleado;
import dao.ClienteDAO;

public class testHibernate {

	public static void main(String[] args) {
		SessionFactory sf = null;
		sf = HibernateUtil.getSessionFactory();
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		Cliente cliente1 = new Cliente("20353591836","Pasteur 555", "34343443","mail@mail.com",new Time(System.currentTimeMillis()),new Time(System.currentTimeMillis()+3));
		Cliente cliente2 = new Cliente("333333333","Lima 717", "4534534","test@test.com",new Time(System.currentTimeMillis()),new Time(System.currentTimeMillis()+3));
		Cliente cliente3 = new Cliente("4444444444","test 323", "6666666","mailtest@mailtest.com",new Time(System.currentTimeMillis()),new Time(System.currentTimeMillis()+3));

		
		List<Empleado> empleados = new ArrayList<Empleado>();
		Empleado empleado1 = new Empleado("Franco","Botiuk","franco@botiuk.com","35359183","444445666", new Date(19901104));
		Empleado empleado2 = new Empleado("Carla","Torino","carla@torino.com","4366564","8888888", new Date(19901104));
		
		empleados.add(empleado1);
		empleados.add(empleado2);
		
		cliente1.setEmpleados(empleados);
		
		clientes.add(cliente1);
		ClienteDAO.getInstancia().grabarCliente(clientes);
		
	}

}

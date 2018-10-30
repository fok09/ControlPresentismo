package hbt;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import bean.Cliente;
import bean.Empleado;
import bean.Fichada;
import bean.PersonaFisica;
import bean.PersonaJuridica;
import srv.ClienteSrv;
import srv.FichadaSrv;

public class testHibernate {

	public static void main(String[] args) {
		HibernateUtil.getSessionFactory();
		
		PersonaFisica PJ = new PersonaFisica("test", "domicilio", "telefono", "mail", new Time(System.currentTimeMillis()), new Time(System.currentTimeMillis()),"nombre","apel");
//		ClienteSrv.grabarCliente(PJ);
//		ClienteSrv.grabarPersonaJuridica(PJ);
		ClienteSrv.grabarPersonaFisica(PJ);
		
		
		Cliente cliente1 = new Cliente("20353591836","Pasteur 555", "34343443","mail@mail.com",new Time(System.currentTimeMillis()),new Time(System.currentTimeMillis()+3));
		Cliente cliente2 = new Cliente("333333333","Lima 717", "4534534","test@test.com",new Time(System.currentTimeMillis()),new Time(System.currentTimeMillis()+3));
//		Cliente cliente3 = new Cliente("4444444444","test 323", "6666666","mailtest@mailtest.com",new Time(System.currentTimeMillis()),new Time(System.currentTimeMillis()+3));
		ClienteSrv.grabarCliente(cliente1);
		ClienteSrv.grabarCliente(cliente2);
//		ClienteSrv.grabarCliente(cliente3);
		
		Empleado empleado1 = new Empleado("Franco","Botiuk","franco@botiuk.com","35359183","444445666", new Date(19901104),"00001");
		Empleado empleado2 = new Empleado("Carla","Torino","carla@torino.com","4366564","8888888", new Date(19901104),"00002");
		Empleado empleado3 = new Empleado("test","test","test@test.com","test","test", new Date(19901104), "00003");
		
		cliente1 = ClienteSrv.getClienteByCuit(cliente1.getCuit_cuil());
		cliente2 = ClienteSrv.getClienteByCuit(cliente2.getCuit_cuil());
		
		cliente1.getEmpleados().add(empleado1);
		cliente2.getEmpleados().add(empleado2);
		cliente2.getEmpleados().add(empleado3);
		
		ClienteSrv.grabarCliente(cliente1);
		ClienteSrv.grabarCliente(cliente2);
		cliente1 = ClienteSrv.getClienteByCuit(cliente1.getCuit_cuil());
		cliente2 = ClienteSrv.getClienteByCuit(cliente2.getCuit_cuil());
		 
		
		List<Fichada> fichadas = new ArrayList<Fichada>();
		Fichada fichi1 = new Fichada("E",cliente1.getEmpleados().get(0));
		Fichada fichi2 = new Fichada("E",cliente2.getEmpleados().get(0));
		Fichada fichi3 = new Fichada("E",cliente2.getEmpleados().get(1));
		Fichada fichi4 = new Fichada("S",cliente1.getEmpleados().get(0));
		Fichada fichi5 = new Fichada("E",cliente2.getEmpleados().get(0));
		Fichada fichi6 = new Fichada("S",cliente2.getEmpleados().get(1));
		
		FichadaSrv.grabarFichada(fichi1);
		FichadaSrv.grabarFichada(fichi2);
		FichadaSrv.grabarFichada(fichi3);
		FichadaSrv.grabarFichada(fichi4);
		FichadaSrv.grabarFichada(fichi5);
		FichadaSrv.grabarFichada(fichi6);
		
		List<Fichada> mostrarFichadas = new ArrayList<Fichada>();
		mostrarFichadas = FichadaSrv.getFichadasByCliente(ClienteSrv.getClienteByCuit(cliente2.getCuit_cuil()));
		
		for (Fichada f : mostrarFichadas) {
		    System.out.println(""+f.getId()+" - "+f.getTipo());
		}
	}

}

package hbt;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import bean.Cliente;
import bean.Empleado;
import bean.Fichada;
import bean.PersonaFisica;
import bean.Servicio;
import srv.ClienteSrv;
import srv.ServicioSrv;

public class testHibernate {

	public static void main(String[] args) {
		HibernateUtil.getSessionFactory();
		
		Servicio s1 = new Servicio ("Mensual",250, (float) 0.02);
		Servicio s2 = new Servicio ("Eventual",200, (float) 0.02);
		Servicio s3 = new Servicio ("Semanal",100, (float) 0.02);
		ServicioSrv.grabarServicio(s1);
		ServicioSrv.grabarServicio(s2);
		ServicioSrv.grabarServicio(s3);
		
//		PersonaFisica PJ = new PersonaFisica("1111", "domicilio", "cbu", "telefono", "mail", new Time(System.currentTimeMillis()), new Time(System.currentTimeMillis()),"nombre","apel");
//		ClienteSrv.grabarPersonaFisica(PJ);
//		
//		
//		Cliente cliente1 = new Cliente("2222","Pasteur 555", "12345","34343443","mail@mail.com",new Time(System.currentTimeMillis()),new Time(System.currentTimeMillis()+3));
//		Cliente cliente2 = new Cliente("3333","Lima 717","54321", "4534534","test@test.com",new Time(System.currentTimeMillis()),new Time(System.currentTimeMillis()+3));
//		ClienteSrv.grabarCliente(cliente1);
//		ClienteSrv.grabarCliente(cliente2);
//
//		
//		Empleado empleado1 = new Empleado("Franco","Botiuk","franco@botiuk.com","35359183","444445666", new Date(19901104),"0001", "Mensual", 80);
//		Empleado empleado2 = new Empleado("Carla","Torino","carla@torino.com","4366564","8888888", new Date(19901104),"0002", "Por Hora", 25);
//		Empleado empleado3 = new Empleado("test","test","test@test.com","test","test", new Date(19901104), "0003", "Mensual", 120);
//		
//		cliente1 = ClienteSrv.getClienteByCuit(cliente1.getCuit_cuil());
//		cliente2 = ClienteSrv.getClienteByCuit(cliente2.getCuit_cuil());
//		
//		cliente1.getEmpleados().add(empleado1);
//		cliente2.getEmpleados().add(empleado2);
//		cliente2.getEmpleados().add(empleado3);
//		
//		ClienteSrv.grabarCliente(cliente1);
//		ClienteSrv.grabarCliente(cliente2);
//		cliente1 = ClienteSrv.getClienteByCuit(cliente1.getCuit_cuil());
//		cliente2 = ClienteSrv.getClienteByCuit(cliente2.getCuit_cuil());
//		 
//		
//		List<Fichada> fichadas = new ArrayList<Fichada>();
//		java.util.Date fechaInicio = new GregorianCalendar(2018, 9, 1).getTime();
//		java.util.Date fechaFin = new GregorianCalendar(2018, 9, 30).getTime();
//
//		Fichada fichi1 = new Fichada("E",cliente1.getEmpleados().get(0), new Time(9, 0, 0), new Date(2018,10,28));
//		Fichada fichi2 = new Fichada("S",cliente1.getEmpleados().get(0), new Time(18, 0, 0), new Date(2018,10,28));
//		Fichada fichi3 = new Fichada("E",cliente1.getEmpleados().get(0), new Time(9, 0, 0), new Date(2018,10,29));
//		Fichada fichi4 = new Fichada("S",cliente1.getEmpleados().get(0), new Time(17, 0, 0), new Date(2018,10,29));
//		Fichada fichi5 = new Fichada("E",cliente1.getEmpleados().get(0), new Time(9, 0, 0), new Date(2018,10,30));
//		Fichada fichi6 = new Fichada("S",cliente1.getEmpleados().get(0), new Time(16, 0, 0), new Date(2018,10,30));
//		
//		FichadaSrv.grabarFichada(fichi1);
//		FichadaSrv.grabarFichada(fichi2);
//		FichadaSrv.grabarFichada(fichi3);
//		FichadaSrv.grabarFichada(fichi4);
//		FichadaSrv.grabarFichada(fichi5);
//		FichadaSrv.grabarFichada(fichi6);
//		
//		List<Fichada> mostrarFichadas = new ArrayList<Fichada>();
//		mostrarFichadas = FichadaSrv.getFichadasByCliente(ClienteSrv.getClienteByCuit(cliente2.getCuit_cuil()));
//
//		Fichada fichi1 = new Fichada("E",cliente1.getEmpleados().get(0), new Time(9, 0, 0), new Date(2018,10,28));
//		Fichada fichi2 = new Fichada("S",cliente1.getEmpleados().get(0), new Time(18, 0, 0), new Date(2018,10,28));
//		Fichada fichi3 = new Fichada("E",cliente1.getEmpleados().get(0), new Time(9, 0, 0), new Date(2018,10,29));
//		Fichada fichi4 = new Fichada("S",cliente1.getEmpleados().get(0), new Time(17, 0, 0), new Date(2018,10,29));
//		Fichada fichi5 = new Fichada("E",cliente1.getEmpleados().get(0), new Time(9, 0, 0), new Date(2018,10,30));
//		Fichada fichi6 = new Fichada("S",cliente1.getEmpleados().get(0), new Time(16, 0, 0), new Date(2018,10,30));
		
//		FichadaSrv.grabarFichada(fichi1);
//		FichadaSrv.grabarFichada(fichi2);
//		FichadaSrv.grabarFichada(fichi3);
//		FichadaSrv.grabarFichada(fichi4);
//		FichadaSrv.grabarFichada(fichi5);
//		FichadaSrv.grabarFichada(fichi6);
//		
//		List<Fichada> mostrarFichadas = new ArrayList<Fichada>();
//		mostrarFichadas = FichadaSrv.getFichadasByCliente(ClienteSrv.getClienteByCuit(cliente2.getCuit_cuil()));
//		
//		for (Fichada f : mostrarFichadas) {
//		    System.out.println(""+f.getId()+" - "+f.getTipo());
//		}
//>>>>>>> refs/remotes/origin/master
		
//		Servicio s1 = new Servicio("Mensual",1000,50);
//		Servicio s2 = new Servicio("Semanal",700,60);
//		Servicio s3 = new Servicio("Eventual",500,65);
//		

//		Servicio s1 = new Servicio ("Mensual",250, (float) 0.02);
//		Servicio s2 = new Servicio ("Eventual",200, (float) 0.02);
//		Servicio s3 = new Servicio ("Semanal",100, (float) 0.02);
//		https://github.com/fok09/ControlPresentismo_Repo.git
//		ServicioSrv.grabarServicio(s1);
//		ServicioSrv.grabarServicio(s2);
//		ServicioSrv.grabarServicio(s3);
//		
//		PersonaFisica PJ = new PersonaFisica("1111", "domicilio", "telefono", "mail", new Time(System.currentTimeMillis()), new Time(System.currentTimeMillis()),"nombre","apel");
//		ClienteSrv.grabarPersonaFisica(PJ);
//		
//		
//		Cliente cliente1 = new Cliente("2222","Pasteur 555", "34343443","mail@mail.com",new Time(System.currentTimeMillis()),new Time(System.currentTimeMillis()+3));
//		Cliente cliente2 = new Cliente("3333","Lima 717", "4534534","test@test.com",new Time(System.currentTimeMillis()),new Time(System.currentTimeMillis()+3));
//		ClienteSrv.grabarCliente(cliente1);
//		ClienteSrv.grabarCliente(cliente2);
//
//		
//		Empleado empleado1 = new Empleado("Franco","Botiuk","franco@botiuk.com","35359183","444445666", new Date(19901104),"0001", "Mensual", 80);
//		Empleado empleado2 = new Empleado("Carla","Torino","carla@torino.com","4366564","8888888", new Date(19901104),"0002", "Por Hora", 25);
//		Empleado empleado3 = new Empleado("test","test","test@test.com","test","test", new Date(19901104), "0003", "Mensual", 120);
//		
//		cliente1 = ClienteSrv.getClienteByCuit(cliente1.getCuit_cuil());
//		cliente2 = ClienteSrv.getClienteByCuit(cliente2.getCuit_cuil());
//		
//		cliente1.getEmpleados().add(empleado1);
//		cliente2.getEmpleados().add(empleado2);
//		cliente2.getEmpleados().add(empleado3);
//		
//		ClienteSrv.grabarCliente(cliente1);
//		ClienteSrv.grabarCliente(cliente2);
//		cliente1 = ClienteSrv.getClienteByCuit(cliente1.getCuit_cuil());
//		cliente2 = ClienteSrv.getClienteByCuit(cliente2.getCuit_cuil());
//		 
//		
//		List<Fichada> fichadas = new ArrayList<Fichada>();
//		java.util.Date fechaInicio = new GregorianCalendar(2018, 9, 1).getTime();
//		java.util.Date fechaFin = new GregorianCalendar(2018, 9, 30).getTime();
//
//		List<Fichada> mostrarFichadas = new ArrayList<Fichada>();
//
////		Fichada fichi1 = new Fichada("E",cliente1.getEmpleados().get(0), new Time(9, 0, 0), new Date(2018,10,28));
////		Fichada fichi2 = new Fichada("S",cliente1.getEmpleados().get(0), new Time(18, 0, 0), new Date(2018,10,28));
////		Fichada fichi3 = new Fichada("E",cliente1.getEmpleados().get(0), new Time(9, 0, 0), new Date(2018,10,29));
////		Fichada fichi4 = new Fichada("S",cliente1.getEmpleados().get(0), new Time(17, 0, 0), new Date(2018,10,29));
////		Fichada fichi5 = new Fichada("E",cliente1.getEmpleados().get(0), new Time(9, 0, 0), new Date(2018,10,30));
////		Fichada fichi6 = new Fichada("S",cliente1.getEmpleados().get(0), new Time(16, 0, 0), new Date(2018,10,30));
//		
////		FichadaSrv.grabarFichada(fichi1);
////		FichadaSrv.grabarFichada(fichi2);
////		FichadaSrv.grabarFichada(fichi3);
////		FichadaSrv.grabarFichada(fichi4);
////		FichadaSrv.grabarFichada(fichi5);
////		FichadaSrv.grabarFichada(fichi6);
////		
////		List<Fichada> mostrarFichadas = new ArrayList<Fichada>();
////		mostrarFichadas = FichadaSrv.getFichadasByCliente(ClienteSrv.getClienteByCuit(cliente2.getCuit_cuil()));
////		
////		for (Fichada f : mostrarFichadas) {
////		    System.out.println(""+f.getId()+" - "+f.getTipo());
////		}
////>>>>>>> refs/remotes/origin/master
//		
////		Servicio s1 = new Servicio("Mensual",1000,50);
////		Servicio s2 = new Servicio("Semanal",700,60);
////		Servicio s3 = new Servicio("Eventual",500,65);
////		
////>>>>>>> refs/remotes/origin/master
////		ServicioSrv.grabarServicio(s1);
////		ServicioSrv.grabarServicio(s2);
////		ServicioSrv.grabarServicio(s3);
////		
//		PersonaJuridica PJ1 = new PersonaJuridica("20365856861", "domicilio", "telefono", "mail", new Time(System.currentTimeMillis()), new Time(System.currentTimeMillis()), "Supermercado");
//		ClienteSrv.grabarPersonaJuridica(PJ1);
//		PersonaJuridica PJ2 = new PersonaJuridica("30365856861", "domicilio", "telefono", "mail", new Time(System.currentTimeMillis()), new Time(System.currentTimeMillis()), "GYM");
//		ClienteSrv.grabarPersonaJuridica(PJ2);
//		PersonaJuridica PJ3 = new PersonaJuridica("40365856861", "domicilio", "telefono", "mail", new Time(System.currentTimeMillis()), new Time(System.currentTimeMillis()), "Escuela");
//		ClienteSrv.grabarPersonaJuridica(PJ3);
//		
////		Cliente cliente1 = new Cliente("2222","Pasteur 555", "34343443","mail@mail.com",new Time(System.currentTimeMillis()),new Time(System.currentTimeMillis()+3));
////		Cliente cliente2 = new Cliente("3333","Lima 717", "4534534","test@test.com",new Time(System.currentTimeMillis()),new Time(System.currentTimeMillis()+3));
////		ClienteSrv.grabarCliente(cliente1);
////		ClienteSrv.grabarCliente(cliente2);
////
////		
////		Empleado empleado1 = new Empleado("Franco","Botiuk","franco@botiuk.com","35359183","444445666", new Date(19901104),"0001");
////		Empleado empleado2 = new Empleado("Carla","Torino","carla@torino.com","4366564","8888888", new Date(19901104),"0002");
////		Empleado empleado3 = new Empleado("test","test","test@test.com","test","test", new Date(19901104), "0003");
////		
////		cliente1 = ClienteSrv.getClienteByCuit(cliente1.getCuit_cuil());
////		cliente2 = ClienteSrv.getClienteByCuit(cliente2.getCuit_cuil());
////		
////		cliente1.getEmpleados().add(empleado1);
////		cliente2.getEmpleados().add(empleado2);
////		cliente2.getEmpleados().add(empleado3);
////		
////		ClienteSrv.grabarCliente(cliente1);
////		ClienteSrv.grabarCliente(cliente2);
////		cliente1 = ClienteSrv.getClienteByCuit(cliente1.getCuit_cuil());
////		cliente2 = ClienteSrv.getClienteByCuit(cliente2.getCuit_cuil());
////		 
////		
////		List<Fichada> fichadas = new ArrayList<Fichada>();
////		java.util.Date fechaInicio = new GregorianCalendar(2018, 9, 1).getTime();
////		java.util.Date fechaFin = new GregorianCalendar(2018, 9, 30).getTime();
//////<<<<<<< HEAD
//////		Fichada fichi1 = new Fichada("E",cliente1.getEmpleados().get(0), new Time(9, 0, 0), new Date(2018,10,28));
//////		Fichada fichi2 = new Fichada("S",cliente1.getEmpleados().get(0), new Time(18, 0, 0), new Date(2018,10,28));
//////		Fichada fichi3 = new Fichada("E",cliente1.getEmpleados().get(0), new Time(9, 0, 0), new Date(2018,10,29));
//////		Fichada fichi4 = new Fichada("S",cliente1.getEmpleados().get(0), new Time(17, 0, 0), new Date(2018,10,29));
//////		Fichada fichi5 = new Fichada("E",cliente1.getEmpleados().get(0), new Time(9, 0, 0), new Date(2018,10,30));
//////		Fichada fichi6 = new Fichada("S",cliente1.getEmpleados().get(0), new Time(16, 0, 0), new Date(2018,10,30));
//////		
//////		FichadaSrv.grabarFichada(fichi1);
//////		FichadaSrv.grabarFichada(fichi2);
//////		FichadaSrv.grabarFichada(fichi3);
//////		FichadaSrv.grabarFichada(fichi4);
//////		FichadaSrv.grabarFichada(fichi5);
//////		FichadaSrv.grabarFichada(fichi6);
//////		
////		List<Fichada> mostrarFichadas = new ArrayList<Fichada>();
//////		mostrarFichadas = FichadaSrv.getFichadasByCliente(ClienteSrv.getClienteByCuit(cliente2.getCuit_cuil()));
//////=======
//////		Fichada fichi1 = new Fichada("E",cliente1.getEmpleados().get(0), new Time(9, 0, 0), new Date(2018,10,28));
//////		Fichada fichi2 = new Fichada("S",cliente1.getEmpleados().get(0), new Time(18, 0, 0), new Date(2018,10,28));
//////		Fichada fichi3 = new Fichada("E",cliente1.getEmpleados().get(0), new Time(9, 0, 0), new Date(2018,10,29));
//////		Fichada fichi4 = new Fichada("S",cliente1.getEmpleados().get(0), new Time(17, 0, 0), new Date(2018,10,29));
//////		Fichada fichi5 = new Fichada("E",cliente1.getEmpleados().get(0), new Time(9, 0, 0), new Date(2018,10,30));
//////		Fichada fichi6 = new Fichada("S",cliente1.getEmpleados().get(0), new Time(16, 0, 0), new Date(2018,10,30));
////		
//////		FichadaSrv.grabarFichada(fichi1);
//////		FichadaSrv.grabarFichada(fichi2);
//////		FichadaSrv.grabarFichada(fichi3);
//////		FichadaSrv.grabarFichada(fichi4);
//////		FichadaSrv.grabarFichada(fichi5);
//////		FichadaSrv.grabarFichada(fichi6);
//////		
//////		List<Fichada> mostrarFichadas = new ArrayList<Fichada>();
//////		mostrarFichadas = FichadaSrv.getFichadasByCliente(ClienteSrv.getClienteByCuit(cliente2.getCuit_cuil()));
//////		
//////		for (Fichada f : mostrarFichadas) {
//////		    System.out.println(""+f.getId()+" - "+f.getTipo());
//////		}
//////>>>>>>> refs/remotes/origin/master
////		
//////		Servicio s1 = new Servicio("Mensual",1000,50);
//////		Servicio s2 = new Servicio("Semanal",700,60);
//////		Servicio s3 = new Servicio("Eventual",500,65);
//////		
//////		ServicioSrv.grabarServicio(s1);
//////		ServicioSrv.grabarServicio(s2);
//////		ServicioSrv.grabarServicio(s3);
////		
////		Date fi= new GregorianCalendar(2018,9,1).getTime();
////		Date ff= new GregorianCalendar(2018,9,31).getTime();
////		
////		s1 = ServicioSrv.getServicio(1);
////		s2 = ServicioSrv.getServicio(2);
////		s3 = ServicioSrv.getServicio(3);
////		
//////		Contratacion c1 = new Contratacion(s1,fi ,ff , 200, 50, 0,cliente1);
//////		ContratacionSrv.grabarContratacion(c1);
	}

}

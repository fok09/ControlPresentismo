package hbt;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import bean.Cliente;
import bean.Empleado;
import bean.Fichada;
import bean.PersonaFisica;
import bean.Servicio;
import srv.ClienteSrv;
import srv.FichadaSrv;
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
		
		PersonaFisica PJ = new PersonaFisica("1111", "domicilio", "telefono", "mail", new Time(System.currentTimeMillis()), new Time(System.currentTimeMillis()),"nombre","apel");
		ClienteSrv.grabarPersonaFisica(PJ);
		
		
		Cliente cliente1 = new Cliente("2222","Pasteur 555", "34343443","mail@mail.com",new Time(System.currentTimeMillis()),new Time(System.currentTimeMillis()+3));
		Cliente cliente2 = new Cliente("3333","Lima 717", "4534534","test@test.com",new Time(System.currentTimeMillis()),new Time(System.currentTimeMillis()+3));
		ClienteSrv.grabarCliente(cliente1);
		ClienteSrv.grabarCliente(cliente2);

		
		Empleado empleado1 = new Empleado("Franco","Botiuk","franco@botiuk.com","35359183","444445666", new Date(19901104),"0001");
		Empleado empleado2 = new Empleado("Carla","Torino","carla@torino.com","4366564","8888888", new Date(19901104),"0002");
		Empleado empleado3 = new Empleado("test","test","test@test.com","test","test", new Date(19901104), "0003");
		
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
		java.util.Date fechaInicio = new GregorianCalendar(2018, 9, 1).getTime();
		java.util.Date fechaFin = new GregorianCalendar(2018, 9, 30).getTime();
		Fichada fichi1 = new Fichada("E",cliente1.getEmpleados().get(0), new Time(9, 0, 0), new Date(2018,10,28));
		Fichada fichi2 = new Fichada("S",cliente1.getEmpleados().get(0), new Time(18, 0, 0), new Date(2018,10,28));
		Fichada fichi3 = new Fichada("E",cliente1.getEmpleados().get(0), new Time(9, 0, 0), new Date(2018,10,29));
		Fichada fichi4 = new Fichada("S",cliente1.getEmpleados().get(0), new Time(17, 0, 0), new Date(2018,10,29));
		Fichada fichi5 = new Fichada("E",cliente1.getEmpleados().get(0), new Time(9, 0, 0), new Date(2018,10,30));
		Fichada fichi6 = new Fichada("S",cliente1.getEmpleados().get(0), new Time(16, 0, 0), new Date(2018,10,30));
		
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

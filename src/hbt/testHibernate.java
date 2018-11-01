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
	}

}

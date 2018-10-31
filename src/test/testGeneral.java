package test;

import java.util.Date;

import bean.Cliente;
import bean.Contratacion;
import bean.Servicio;
import hbt.HibernateUtil;
import srv.ClienteSrv;
import srv.ContratacionSrv;
import srv.ServicioSrv;

public class testGeneral {

	public static void main(String[] args) {
		
		String cuit_cuil = "2222";
		Date fechaInicio = new Date(2018,10,01);
		Date fechaFin = new Date(2018,10,21);
		HibernateUtil.getSessionFactory();
		
		Servicio s = ServicioSrv.getServicio(2);
		Cliente cl = ClienteSrv.getClienteByCuit(cuit_cuil);
		
		float a = 500;
		
		Contratacion c = new Contratacion(s,cl, 100, 55, fechaInicio, fechaFin, "A", a);
		
		ContratacionSrv.grabarContratacion(c);
		
		
		
	}
	
}

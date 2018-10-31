package test;

import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import bean.Cliente;
import bean.Empleado;
import bean.Fichada;
import hbt.HibernateUtil;
import srv.ClienteSrv;
import srv.FichadaSrv;

public class testGeneral {

	public static void main(String[] args) {
		String cuit_cuil = "2222";
		Date fechaInicio = new Date(2018,10,01);
		Date fechaFin = new Date(2018,10,21);
		
		HibernateUtil.getSessionFactory();
		
		Vector<Vector<String>> vent = new Vector<Vector<String>>();
		Cliente cliente = ClienteSrv.getClienteByCuit(cuit_cuil);
		List<Fichada> fichadas = FichadaSrv.getFichadasByCliente(cliente);
		List<Empleado> empleados = cliente.getEmpleados();
		
		LocalTime contE = LocalTime.of(0, 0);
		LocalTime contS = LocalTime.of(0, 0);
		
		for (Empleado e : empleados)
		{
			Vector<String> strs = new Vector<String>();
			
			for(Fichada f: fichadas) {
				if(f.getEmpleado().getId() == e.getId()) {		
//					if ((f.getFecha().compareTo(fechaInicio)<0) && (fechaFin.compareTo(f.getFecha()) < 0) 
//							|| (fechaInicio == f.getFecha()) || (f.getFecha() == fechaFin))  
//					{
						if(f.getTipo().equals("E")) {
							
							contE.plusHours(f.getHora().getHours());
							contE.plusMinutes(f.getHora().getMinutes());
						}
						else {
							contS.plusHours(f.getHora().getHours());
							contS.plusMinutes(f.getHora().getMinutes());
						}
							
//					}
				}
			}
//			Acá tenemos en contE y contS el total de horas de entrada y de salida para el empleado buscado
				contS.minusHours(contE.getHour());
				contS.minusMinutes(contE.getMinute());
				
				strs.add(String.valueOf(e.getLegajo()));
				strs.add(String.valueOf(e.getApellido() + " " + e.getNombre()));
				strs.add(String.valueOf(contS));
		}
		
	}
	
}

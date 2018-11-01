package ReportesIntegracion;

import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import bean.Cliente;
import bean.Contratacion;
import bean.Empleado;
import bean.Fichada;
import dto.ClienteDTO;
import dto.EmpleadoDTO;
import srv.ClienteSrv;
import srv.FichadaSrv;

public class ReporteDTO {
	
	
	public Vector<Vector<String>> getHorasTrabajadasTotales(String cuit_cuil, Date fechaInicio, Date fechaFin, Contratacion c) throws RemoteException {
		Vector<Vector<String>> vectorTabla = new Vector<Vector<String>>();
		Cliente cliente = ClienteSrv.getClienteByCuit(cuit_cuil);
		List<Fichada> fichadas = FichadaSrv.getFichadasByCliente(cliente, fechaInicio, fechaFin);
		List<Empleado> empleados = cliente.getEmpleados();
		
		int horasTotalesE = 0;
		int minutosTotalesE = 0;
		int horasTotalesS = 0;
		int minutosTotalesS = 0;
		int horasResultado = 0;
		int minutosResultado = 0;
		int minutosAusentes = 0;
		int horasAusentes = 0;
		
		for (Empleado e : empleados)
		{
			Vector<String> strs = new Vector<String>();
			
			for(Fichada f: fichadas) {
				if(f.getEmpleado().getId() == e.getId()) {		

					int horas = f.getHora().getHour();
					int minutos = f.getHora().getMinute();
					
						if(f.getTipo().equals("E")) {
							
							horasTotalesE += horas;
							minutosTotalesE += minutos;
						}
						else {
							
							horasTotalesS += horas;
							minutosTotalesS += minutos;
						}
							

				}
			}
				horasResultado = horasTotalesS - horasTotalesE;
				minutosResultado = minutosTotalesS - minutosTotalesE;
				
				if (minutosResultado>=60) {
					horasResultado +=(minutosResultado/60);
					minutosResultado = (minutosResultado%60);
					
				}else if (minutosResultado<0) {
					if (minutosResultado<-60) {
						horasResultado+=(minutosResultado/60);
						minutosResultado = 60 + (minutosResultado%60);
						horasResultado = horasResultado-1;
						
					}else if (minutosResultado==-60) {
						horasResultado+=(minutosResultado/60);
						minutosResultado = (minutosResultado%60);
					}else {
						horasResultado = horasResultado-1;
						minutosResultado = 60 + minutosResultado;
						
					}
				}
				
				
				strs.add(String.valueOf(cuit_cuil));
				strs.add(String.valueOf(e.getDni()));
				strs.add(String.valueOf(e.getLegajo()));
				strs.add(String.valueOf(e.getApellido() + " " + e.getNombre()));
				strs.add(String.valueOf(horasResultado + ":" +minutosResultado));
				
				horasAusentes = c.getCantHoras() - horasResultado;
				if (minutosResultado>0) {
					minutosAusentes = 60 - minutosResultado;
					horasAusentes -=1;
				}
				
				strs.add(String.valueOf(horasAusentes + ":" +minutosAusentes));
				vectorTabla.add(strs);
		}
		
		return vectorTabla;
	}
	
	
	
	
	
	
	
	

}

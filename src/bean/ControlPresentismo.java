package bean;

import java.sql.Date;
import java.sql.Time;
import java.util.*;

public class ControlPresentismo {
	
	public Vector<Fichada> fichadas;
	public Vector<Factura> facturas;
	public Vector<Cliente> clientes;
	public Vector<Contratacion> contrataciones;
	public Vector<Servicio> servicios;

	
/*	DAR DE ALTA CLIENTE CON LISTA DE EMPLEADOS

	public void crearClienteJuridico(String cuit_cuil, String domicilio, String telefono, String mail,
			Time horaEntrada, Time horaSalida, List<Empleado> empleados, String razonSocial) {
		
		for(Cliente c : this.clientes) {
			if(!c.getCuit_cuil().equals(cuit_cuil)) {		
					Cliente cliente = new PersonaJuridica(cuit_cuil, domicilio, telefono, mail, horaEntrada, horaSalida, empleados, razonSocial);
					clientes.addElement(cliente);
			}
		}
	}
	
	public void crearClienteFisico(String cuit_cuil, String domicilio, String telefono, String mail,
			Time horaEntrada, Time horaSalida, List<Empleado> empleados, String nombre, String apellido) {
		
		for(Cliente c : this.clientes) {
			if(!c.getCuit_cuil().equals(cuit_cuil)) {		
					Cliente cliente = new PersonaFisica(cuit_cuil, domicilio, telefono, mail, horaEntrada, horaSalida, empleados, nombre, apellido);
					clientes.addElement(cliente);
			}
		}
	}*/
	
	public void crearClienteJuridico(String cuit_cuil, String domicilio, String telefono, String mail,
			Time horaEntrada, Time horaSalida, String razonSocial) {
		
		for(Cliente c : this.clientes) {
			if(!c.getCuit_cuil().equals(cuit_cuil)) {		
					Cliente cliente = new PersonaJuridica(cuit_cuil, domicilio, telefono, mail, horaEntrada, horaSalida, razonSocial);
					clientes.addElement(cliente);
			}
		}
	}
	
	public void crearClienteFisico(String cuit_cuil, String domicilio, String telefono, String mail,
			Time horaEntrada, Time horaSalida, String nombre, String apellido) {
		
		for(Cliente c : this.clientes) {
			if(!c.getCuit_cuil().equals(cuit_cuil)) {		
					Cliente cliente = new PersonaFisica(cuit_cuil, domicilio, telefono, mail, horaEntrada, horaSalida, nombre, apellido);
					clientes.addElement(cliente);
			}
		}
	}
	
	public void eliminarCliente(String cuit_cuil) {	
		
		for(Cliente c : this.clientes) {
			if(c.getCuit_cuil().equals(cuit_cuil)) {		
				clientes.remove(c);
			}
		}
	}
	
	public void modificarCliente(String cuit_cuil, String domicilio, String telefono, String mail,
			Time horaEntrada, Time horaSalida) {	
		
		Cliente cliente = null; 
		
		for(Cliente c : this.clientes) {
			if(c.getCuit_cuil().equals(cuit_cuil)) 
			{		
				cliente = c;
				cliente.setDomicilio(domicilio);
				cliente.setHoraEntrada(horaEntrada);
				cliente.setHoraSalida(horaSalida);
				cliente.setMail(mail);
				cliente.setTelefono(telefono);
			}
			
		}		
	}
	
	public void agregarEmpleado(String cuit_cuil, String nombre, String apellido, String mail, String dni, String telefono, Date fechaNac, String legajo) {
		
		for(Cliente c : this.clientes) {
			if(c.getCuit_cuil().equals(cuit_cuil)) {		
				c.agregarEmpleado(nombre, apellido, mail, dni, telefono, fechaNac, legajo);
			}
		}
		
	}
	
	public void altaFichada(String tipo, String dni, String cuit_cuil) {
	
		for (Cliente c : clientes)
			if(c.getCuit_cuil().equals(cuit_cuil))
			{
				Fichada f = new Fichada(tipo,c.obtenerEmpleado(dni));
				this.fichadas.add(f);			
			}	
	}
	
	public void crearFactura(float monto, String tipoFactura, String cuit_cuil){
		
		Cliente cliente = null;
		
		for(Cliente c : this.clientes) {
			if(c.getCuit_cuil().equals(cuit_cuil)) {		
				cliente = c;
			}
		}
	
		Factura f = new Factura(monto, tipoFactura, cliente);
		this.facturas.add(f);
	
	}	
	
	public void crearServicio(String nombreServicio, float monto,  float porcentajeEmpleado) {
		
		Servicio s = new Servicio(nombreServicio, monto, porcentajeEmpleado);
		this.servicios.add(s);
		
	}
	
	public void crearContratacion(String nombreServicio, Cliente cliente, int cantHoras,
			Date fechaInicial, Date fechaFinal, String tipoFactura) {
		
		for (Servicio s: servicios) {
			if (s.getNombre().equals(nombreServicio))
			{		
				
				float montoFinal = s.getMonto()+(cliente.getEmpleados().size()*s.getPorcentajeEmpleado());
				
				Contratacion c = new Contratacion(s, fechaInicial, fechaFinal, cantHoras, cliente.getEmpleados().size(), montoFinal, cliente);	
				contrataciones.add(c);
				
				this.crearFactura(montoFinal, tipoFactura, cliente.getCuit_cuil());
				
			}
		}
		
	}
	
		
	public void registrarPago(int nroFactura) {
	
		for(Factura f : this.facturas) {
			if(f.getNroFactura() == nroFactura) {		
				f.registrarPago();
			}
		}
		
	}
	
	public float consultarDeudaCliente(String cuit_cuil) {
		
		for(Cliente c : this.clientes) {
			if(c.getCuit_cuil().equals(cuit_cuil)) {		
				return c.consultarDeuda();
			}
		}
		
		return 0;
	}
	
// REPORTE CANTIDAD DE HORAS VER!!!!!!!!!!!!	
	public long reportarCantHorasTrabajadasEmpleado(String cuit_cuil, String dni, Date fechaInicio, Date fechaFin) {
				
		List<Fichada> fichadasE = new Vector();
		List<Fichada> fichadasS = new Vector();
		
		long contE = 0;
		long contS = 0;
		
		for(Fichada f : this.fichadas) {
			if(f.getEmpleado().getDni().equals(dni)) {		
				if ((f.getFecha().compareTo(fechaInicio)<0) && (fechaFin.compareTo(f.getFecha()) < 0) 
						&& (fechaInicio == f.getFecha()) && (f.getFecha() == fechaFin))  
				{
					if(f.getTipo().equals('E'))
						fichadasE.add(f);
					else
						fichadasS.add(f);	
				}
			}
		}
		
		for(Fichada f: fichadasE) {
			contE = contE + f.getHora();
		}
		
		for(Fichada f: fichadasS) {
			contS = contS + f.getHora();
		}
		
		return contS - contE;
	}
	
	
}

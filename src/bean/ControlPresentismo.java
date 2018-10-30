package bean;

import java.sql.Date;
import java.sql.Time;
import java.util.*;

public class ControlPresentismo {
	
	public Vector<Fichada> fichadas;
	public Vector<Factura> facturas;
	public Vector<Cliente> clientes;
	public Vector<Contratacion> contrataciones;
	
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
	
//	public void CrearContratacionMensual(Date fechaInicial, Date fechaFinal, int cantHoras,
//				String tipoFactura, String cuit_cuil) {
//		
//		Contratacion cont = new Mensual(fechaInicial, fechaFinal, cantHoras);
//		this.contrataciones.add(cont);
//		
//		this.crearFactura(cont.calcularMonto(), tipoFactura, cuit_cuil);
//		
//	}
//	
//	public void CrearContratacionSemanal(Date fechaInicial, Date fechaFinal, int cantHoras,
//			String tipoFactura, String cuit_cuil) {
//	
//		Contratacion cont = new Mensual(fechaInicial, fechaFinal, cantHoras);
//		this.contrataciones.add(cont);
//	
//		this.crearFactura(cont.calcularMonto(), tipoFactura, cuit_cuil);
//	
//	}
//	
//	public void CrearContratacionEventual(Date fechaInicial, Date fechaFinal, int cantHoras,
//			String tipoFactura, String cuit_cuil) {
//	
//		Contratacion cont = new Mensual(fechaInicial, fechaFinal, cantHoras);
//		this.contrataciones.add(cont);
//	
//		this.crearFactura(cont.calcularMonto(), tipoFactura, cuit_cuil);
//	
//	}
	
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
	
/* REPORTE CANTIDAD DE HORAS VER!!!!!!!!!!!!	
	public Time reportarCantHorasTrabajadasEmpleado(String cuit_cuil, String dni, Date fechaInicio, Date fechaFin) {
		
		for(Fichada f : this.fichadas) {
			if(f.getEmpleado().getDni().equals(dni)) {		
				
			}
		}
		
		
		return cantHoras;
	}
	*/
	
}

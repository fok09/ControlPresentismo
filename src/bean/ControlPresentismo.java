package bean;

import java.sql.Time;
import java.util.*;

public class ControlPresentismo {
	
	public Vector<Fichada> fichadas;
	public Vector<Factura> facturas;
	public Vector<Cliente> clientes;
	public Vector<Contratacion> contratacion;
	
	public void crearCliente(String cuit_cuil, String domicilio, String telefono, String mail,
			Time horaEntrada, Time horaSalida, List<Empleado> empleados) {
		
		for(Cliente c : this.clientes) {
			if(!c.getCuit_cuil().equals(cuit_cuil)) {		
		Cliente cliente = new Cliente(cuit_cuil, domicilio, telefono, mail,horaEntrada, horaSalida, empleados);
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
			Time horaEntrada, Time horaSalida, Empleado empleado) {	
		
		Cliente cliente = null; 
		
		for(Cliente c : this.clientes) {
			if(c.getCuit_cuil().equals(cuit_cuil)) 
			{		
				cliente = c;
				cliente.setDomicilio(domicilio);
				cliente.setEmpleado(empleado);
				cliente.setHoraEntrada(horaEntrada);
				cliente.setHoraSalida(horaSalida);
				cliente.setMail(mail);
				cliente.setTelefono(telefono);
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
	
	public void crearFacturaMensual(String tipoFactura, Date fechaPago, String cuit_cuil){
		
		Cliente cliente = null;
		
		for(Cliente c : this.clientes) {
			if(c.getCuit_cuil().equals(cuit_cuil)) {		
				cliente = c;
			}
		}
		
		Contratacion cont = new Mensual();
		
		Factura f = new Factura(cont.calcularMonto(), tipoFactura, fechaPago, cliente);
		this.facturas.add(f);
	
	}
	
	public void crearFacturaSemanal(String tipoFactura, Date fechaPago, String cuit_cuil){
		
		Cliente cliente = null;
		
		for(Cliente c : this.clientes) {
			if(c.getCuit_cuil().equals(cuit_cuil)) {		
				cliente = c;
			}
		}
		
		Contratacion cont = new Semanal();
		
		Factura f = new Factura(cont.calcularMonto(), tipoFactura, fechaPago, cliente);
		this.facturas.add(f);
	
	}
	
	public void crearFacturaEventual(String tipoFactura, Date fechaPago, String cuit_cuil){
		
		Cliente cliente = null;
		
		for(Cliente c : this.clientes) {
			if(c.getCuit_cuil().equals(cuit_cuil)) {		
				cliente = c;
			}
		}
		
		Contratacion cont = new Eventual();
		
		Factura f = new Factura(cont.calcularMonto(), tipoFactura, fechaPago, cliente);
		this.facturas.add(f);
	
	}

}

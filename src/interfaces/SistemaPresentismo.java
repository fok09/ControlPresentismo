package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import dto.ClienteDTO;
import dto.EmpleadoDTO;
import dto.FacturaDTO;
import dto.FichadaDTO;
import dto.PersonaFisicaDTO;
import dto.PersonaJuridicaDTO;

public interface SistemaPresentismo extends Remote {

	public void crearClienteJuridico(PersonaJuridicaDTO personaJuridicaDTO) throws RemoteException;
	
	public void crearClienteFisico(PersonaFisicaDTO personaFisicaDTO) throws RemoteException;
	
	public void eliminarCliente(String cuit_cuil) throws RemoteException;
	
	public void modificarCliente(ClienteDTO clienteDTO) throws RemoteException;
	
	public void agregarEmpleado(EmpleadoDTO empleadoDTO) throws RemoteException;
	
	public void altaFichada(FichadaDTO fichadaDTO) throws RemoteException;
	
	public void crearFacturaMensual(FacturaDTO facturaDTO) throws RemoteException;
	
	public void crearFacturaSemanal(FacturaDTO facturaDTO) throws RemoteException;
	
	public void crearFacturaEventual(FacturaDTO facturaDTO) throws RemoteException;
	
	public void registrarPago(int nroFactura) throws RemoteException;
		
	
	
//	public void crearClienteJuridico(String cuit_cuil, String domicilio, String telefono, String mail,
//			Time horaEntrada, Time horaSalida, List<Empleado> empleados, String razonSocial) throws RemoteException;
//	
//	public void crearClienteFisico(String cuit_cuil, String domicilio, String telefono, String mail,
//			Time horaEntrada, Time horaSalida, List<Empleado> empleados, String nombre, String apellido) throws RemoteException;
//	
//	public void eliminarCliente(String cuit_cuil) throws RemoteException;
//	
//	public void modificarCliente(String cuit_cuil, String domicilio, String telefono, String mail,
//			Time horaEntrada, Time horaSalida) throws RemoteException;
//	
//	public void agregarEmpleado(String cuit_cuil, String nombre, String apellido, String mail, String dni,
//			String telefono, Date fechaNac) throws RemoteException;
//	
//	public void altaFichada(String tipo, String dni, String cuit_cuil) throws RemoteException;
//	
//	public void crearFacturaMensual(String tipoFactura, Date fechaPago, String cuit_cuil) throws RemoteException;
//	
//	public void crearFacturaSemanal(String tipoFactura, Date fechaPago, String cuit_cuil) throws RemoteException;
//	
//	public void crearFacturaEventual(String tipoFactura, Date fechaPago, String cuit_cuil) throws RemoteException;
//	
//	public void registrarPago(int nroFactura) throws RemoteException;

}

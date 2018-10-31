package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Vector;

import bean.Contratacion;
import dto.ContratacionDTO;
import dto.ClienteDTO;
import dto.EmpleadoDTO;
import dto.FacturaDTO;
import dto.FichadaDTO;
import dto.PersonaFisicaDTO;
import dto.PersonaJuridicaDTO;

public interface SistemaPresentismo extends Remote {

	//metodos con DTOs
	public void crearClienteJuridico(PersonaJuridicaDTO personaJuridicaDTO) throws RemoteException;

	public void crearClienteFisico(PersonaFisicaDTO personaFisicaDTO) throws RemoteException;
	
	public void eliminarCliente(String cuit_cuil) throws RemoteException;
	
	public void modificarCliente(ClienteDTO clienteDTO) throws RemoteException;
	
	public void agregarEmpleado(EmpleadoDTO empleadoDTO, String cuit_cuil) throws RemoteException;
	
	public void altaFichada(FichadaDTO fichadaDTO) throws RemoteException;
	
	public void crearFactura(FacturaDTO facturaDTO) throws RemoteException;
	
public void crearContratacion(ContratacionDTO contratacionDTO) throws RemoteException;
	
//	public void crearFacturaSemanal(FacturaDTO facturaDTO) throws RemoteException;
//	
//	public void crearFacturaEventual(FacturaDTO facturaDTO) throws RemoteException;
	
	public void registrarPago(int nroFactura) throws RemoteException;

	public Vector<Vector<String>> getHorasTrabajadasTotales(String cuit_cuil, java.util.Date fechaInicio, java.util.Date fechaFin, Contratacion c) throws RemoteException;

	public List<Contratacion> getContratacionesCliente(String cuitEmpresa) throws RemoteException;

		
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

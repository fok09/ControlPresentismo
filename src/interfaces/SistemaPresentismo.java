package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Vector;

import bean.Contratacion;
import dto.ClienteDTO;
import dto.ContratacionDTO;
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
	
	public void agregarEmpleado(EmpleadoDTO empleadoDTO, String cuit_cuil) throws RemoteException;
	
	public void altaFichada(FichadaDTO fichadaDTO) throws RemoteException;
	
	public void crearFactura(FacturaDTO facturaDTO) throws RemoteException;
	
	public void crearContratacion(ContratacionDTO contratacionDTO) throws RemoteException;

	public void registrarPago(FacturaDTO facturaDTO) throws RemoteException;

	public Vector<Vector<String>> getHorasTrabajadasTotales(String cuit_cuil, java.util.Date fechaInicio, java.util.Date fechaFin, Contratacion c) throws RemoteException;

	public List<Contratacion> getContratacionesCliente(String cuitEmpresa) throws RemoteException;

}

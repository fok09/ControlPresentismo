package srv;

import java.util.List;

import bean.Cliente;
import bean.Contratacion;
import dao.ContratacionDAO;

public class ContratacionSrv {
private static ContratacionDAO dao;
	
	static {
		dao = ContratacionDAO.getInstancia();
	}
	
	public static int grabarContratacion(Contratacion contratacion){
		return dao.grabarContratacion(contratacion);
	}
	
	public static Contratacion getById(int c){
		return dao.getById(c);
	}
	
	public static Contratacion getContratacionByCliente(Cliente cliente){
		return dao.getByClienteId(cliente.getId());
	}
	
	public static Contratacion getContratacionByIdCliente(int idCliente){
		return dao.getByClienteId(idCliente);
	}
	
	public static Contratacion getContratacionByCuil(String cuit){
		return dao.getByClienteId(ClienteSrv.getClienteByCuit(cuit).getId());
	}
	
	public static List<Contratacion> getContratacionesByCliente(Cliente cliente){
		return dao.getContratacionesByClienteId(cliente.getId());
	}
	
	public static List<Contratacion> getContratacionesByIdCliente(int idCliente){
		return dao.getContratacionesByClienteId(idCliente);
	}
	
	public static List<Contratacion> getContratacionesByCuil(String cuit){
		return dao.getContratacionesByClienteId(ClienteSrv.getClienteByCuit(cuit).getId());
	}
	
	public static List<Contratacion> getContrataciones(){
		return dao.getContrataciones();
	}
	
}

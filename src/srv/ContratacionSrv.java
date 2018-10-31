package srv;

import bean.Cliente;
import bean.Contratacion;
import dao.ContratacionDAO;

public class ContratacionSrv {
private static ContratacionDAO dao;
	
	static {
		dao = ContratacionDAO.getInstancia();
	}
	
	public static void grabarContratacion(Contratacion contratacion){
		dao.grabarContratacion(contratacion);
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
}

package srv;

import java.util.List;

import bean.Cliente;
import dao.ClienteDAO;

public class ClienteSrv {

private static ClienteDAO dao;
	
	static {
		dao = ClienteDAO.getInstancia();
	}
	
	public static void grabarCliente(Cliente cliente){
		dao.grabarCliente(cliente);
	}
	
	public static void grabarClientes(List<Cliente> clientes){
		dao.grabarClientes(clientes);
	}
	
	public static Cliente getCliente(int idCliente){
		return dao.getById(idCliente);
	}
	
	public static Cliente getClienteByCuit(String cuit){
		return dao.getByCuit(cuit);
	}
	
	
}

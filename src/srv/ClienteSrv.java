package srv;

import java.util.List;
import java.util.Vector;

import bean.Cliente;
import bean.PersonaFisica;
import bean.PersonaJuridica;
import dao.ClienteDAO;
import dto.ClienteDTO;

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
	
	public static void grabarPersonaJuridica(PersonaJuridica personaJuridica) {
		dao.grabarPersonaJuridica(personaJuridica);
	}
	
	public static void grabarPersonaFisica(PersonaFisica personaFisica) {
		dao.grabarPersonaFisica(personaFisica);
	}
	
	public static Cliente getCliente(int idCliente){
		return dao.getById(idCliente);
	}
	
	public static Cliente getClienteByCuit(String cuit){
		return dao.getByCuit(cuit);
	}
	
	public static List<Cliente> getClientes(){
		return dao.getClientes();
	}
	
	public static List<PersonaJuridica> getClientesJuridicos(){
		return dao.getClientesJuridicos();
	}
	
	public static List<PersonaFisica> getClientesFisicos(){
		return dao.getClientesFisicos();
	}
	
	public static PersonaJuridica getPersonaJuridicaByIdCliente(int idCliente){
		return dao.getPersonaJuridicaByIdCliente(idCliente);
	}
	
	public static void eliminarCliente (Cliente cliente) {
		dao.eliminarCliente(cliente);
	}
}

package srv;

import java.util.List;

import bean.Cliente;
import bean.Empleado;
import dao.EmpleadoDAO;

public class EmpleadoSrv {

private static EmpleadoDAO dao;
	
	static {
		dao = EmpleadoDAO.getInstancia();
	}
	
	
	public static Empleado getEmpleado(int idEmpleado){
		return dao.getById(idEmpleado);
	}
	
	public static Empleado getEmpleadoByCliente(Cliente cliente){
		return dao.getByCliente(cliente.getId());
	}
	
	public static List<Empleado> getEmpleadosByCliente(Cliente cliente){
		return dao.getEmpleadosByCliente(cliente.getId());
	}
}

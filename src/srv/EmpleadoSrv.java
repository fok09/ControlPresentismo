package srv;

import java.util.Vector;

import bean.Empleado;
import dao.EmpleadoDAO;

public class EmpleadoSrv {

private static EmpleadoDAO dao;
	
	static {
		dao = EmpleadoDAO.getInstancia();
	}
	
	public static void grabarEmpleado(Empleado empleado){
		dao.grabarEmpleado(empleado);
	}
	
	public static void grabarEmpleados(Vector<Empleado> empleados){
		dao.grabarEmpleados(empleados);
	}
	
	public static Empleado getEmpleado(int idEmpleado){
		return dao.getById(idEmpleado);
	}
	
		
		
}

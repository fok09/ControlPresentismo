package srv;

import java.util.ArrayList;
import java.util.List;

import bean.Cliente;
import bean.Empleado;
import bean.Fichada;
import dao.FichadaDAO;

public class FichadaSrv {
private static FichadaDAO dao;
	
	static {
		dao = FichadaDAO.getInstancia();
	}
	
	public static void grabarFichada(Fichada fichada){
		dao.grabarFichada(fichada);
	}
	
	public static void grabarFichadas(List<Fichada> fichadas){
		dao.grabarFichadas(fichadas);
	}
	
	public static List<Fichada> getFichadasByCliente(Cliente cliente){
		List<Empleado> empleados = new ArrayList<Empleado>();
		empleados = cliente.getEmpleados();
		String arrayEmpleados = "";
		for (Empleado e : empleados) {
			if (arrayEmpleados=="")
			{
				arrayEmpleados = arrayEmpleados + e.getId();
			}else {
				arrayEmpleados = arrayEmpleados + "," + e.getId();
			}
		}
		
		return dao.getFichadasByEmpleados(arrayEmpleados);
	}
	
}

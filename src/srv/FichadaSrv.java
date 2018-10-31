package srv;

import java.util.ArrayList;
import java.util.Date;
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
	
	public static List<Fichada> getFichadasByCliente(Cliente cliente, Date fechaInicio, Date fechaFin){
		List<Empleado> empleados = new ArrayList<Empleado>();
		List<Fichada> fichadas = new ArrayList<Fichada>();
		List<Fichada> result = new ArrayList<Fichada>();
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
		fichadas = dao.getFichadasByEmpleados(arrayEmpleados);
		for (Fichada f : fichadas) {
			if(f.getFecha().compareTo(fechaInicio)>=0 && f.getFecha().compareTo(fechaFin)<=0) {
				result.add(f);
			}
		}
		
//		return dao.getFichadasByEmpleados(arrayEmpleados);
		return result;
	}
	
}

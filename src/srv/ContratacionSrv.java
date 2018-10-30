package srv;

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
}

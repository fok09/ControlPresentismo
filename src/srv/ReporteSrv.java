package srv;

import java.time.LocalDate;
import java.util.List;

import bean.Cliente;
import bean.Servicio;
import dao.ReporteDAO;
import dao.ServicioDAO;

public class ReporteSrv {
private static ReporteDAO dao;
	
	static {
		dao = (ReporteDAO) ReporteDAO.getInstancia();
	}
}

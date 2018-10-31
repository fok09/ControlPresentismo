package srv;

import java.util.List;

import bean.Cliente;
import bean.Factura;
import dao.FacturaDAO;

public class FacturaSrv {


private static FacturaDAO dao;
	
	static {
		dao = FacturaDAO.getInstancia();
	}
	
	public static void grabarFactura(Factura factura){
		dao.grabarFactura(factura);
	}
	
	public static List<Factura> getFacturasByCliente(int idCliente){
		return dao.getFacturasByCliente(idCliente);
	}
	
	public static Factura getFacturaByNro(int nroFac) {
		return dao.getFacturaByNro(nroFac);
	}
}

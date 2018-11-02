package ReportesIntegracion;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;

import bean.Cliente;
import bean.Factura;
import integracion.PostBanco;
import srv.ClienteSrv;
import srv.FacturaSrv;

public class ReporteBancoDTO {
	
	public static void EjecutarReporteBancoDTO(String Cuit_Cuil) {
		
		Cliente cliente = ClienteSrv.getClienteByCuit(Cuit_Cuil);
		
		LocalDate fechaActual = LocalDate.now();
		
		float totalACobrar = calcularMonto(cliente, fechaActual);
			
		PostBanco.postearPagoBanco(cliente.getCbu(), totalACobrar, String.valueOf(fechaActual));
		
	}
	
	public static float calcularMonto(Cliente cliente, LocalDate fechaActual) {
		
		List<Factura> facturas = FacturaSrv.getFacturasByCliente(cliente.getId());
		
		float totalFacturas = 0;
		
		int mesActual = fechaActual.getMonthValue(); //Obtengo el mes actual para comparar con las facturas del mes corriente
		
		for (Factura f : facturas) 
		{
			if (f.getFechaPago()!=null)
			{
			Instant i = f.getFechaPago().toInstant();	//Convierto la fecha de la factura en tipo LocalDate	
			ZonedDateTime z = i.atZone(ZoneId.systemDefault());
			LocalDate fechaPagoFactura = z.toLocalDate();
			
			int mesDelPago = fechaPagoFactura.getMonthValue(); // Obtengo el mes del pago de la factura
			
			if(mesActual == mesDelPago)
				totalFacturas = totalFacturas + f.getMonto();
			
			}
		}
		
		return totalFacturas;
		
	}

}

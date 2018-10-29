package bean;
import java.util.*;
public class CuentaCorriente {
	
	private float saldo;
	private Vector<Factura> facturas;
	private Cliente cliente;
	
	public float calcularSaldo(String cuit_cuil) {
			
		float saldo=0;
		for(Factura f: this.facturas) {
			if (f.getCliente().getCuit_cuil().equals(cuit_cuil)) {
				if(f.isPagado()==false)
					saldo = saldo + f.getMonto();
			}
		}
		
		return saldo;
	}
}

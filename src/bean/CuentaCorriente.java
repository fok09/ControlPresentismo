package bean;

import java.util.Vector;

public class CuentaCorriente {

	private float saldo;
	private Vector<Factura> facturas;
	private Cliente cliente;

	public CuentaCorriente() {

	}
	
	public CuentaCorriente(float saldo, Vector<Factura> facturas, Cliente cliente) {
		super();
		this.saldo = saldo;
		this.facturas = facturas;
		this.cliente = cliente;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public float calcularSaldo(String cuit_cuil) {

		float saldo = 0;
		for (Factura f : this.facturas) {
			if (f.getCliente().getCuit_cuil().equals(cuit_cuil)) {
				if (f.isPagado() == false)
					saldo = saldo + f.getMonto();
			}
		}

		return saldo;
	}
}

package bean;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@SuppressWarnings("deprecation")

@Entity
@Table(name = "factura")
public class Factura implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Factura() {}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int nroFactura;
	private float monto;
	private Date fecha;
	private String tipo;
	@Column(name="pagado",columnDefinition="TINYINT(1)")
	private boolean pagado;
	private Date fechaPago;

	@OneToOne
	@JoinColumn(name="cliente")
	private Cliente cliente;
	@OneToOne
	@JoinColumn(name="contratacion")
	private Contratacion contratacion;

	public void registrarPago() {

		this.pagado = true;
		this.fechaPago.getDate();
	}

	// constructor
//	public Factura(float monto, String tipo, Cliente cliente) {
//		this.monto = monto;
//		this.fecha.getDate();
//		this.tipo = tipo;
//		this.pagado = false; // cuando se crea la factura figura como impago
//		this.cliente = cliente;
//	}
	

	public Factura(float monto, String tipo, Cliente cliente, Contratacion contratacion) {
		this.monto = monto;
		this.fecha = Calendar.getInstance().getTime();
		this.tipo = tipo;
		this.pagado = false;
		this.cliente = cliente;
		this.contratacion = contratacion;
	}
	
	//gets and sets
	public int getNroFactura() {
		return nroFactura;
	}

	public void setNroFactura(int nroFactura) {
		this.nroFactura = nroFactura;
	}

	public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isPagado() {
		return pagado;
	}

	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}

	public Date getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Contratacion getContratacion() {
		return contratacion;
	}

	public void setContratacion(Contratacion contratacion) {
		this.contratacion = contratacion;
	}
	
	@Override
	public String toString() {
		return this.getNroFactura()+" - "+this.getFecha();
		
	}

}

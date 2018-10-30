package dto;

import java.util.Date;
import bean.Cliente;
import bean.Contratacion;

public class FacturaDTO {
	
    private static final long serialVersionUID = 304167071881426451L;
    
    private int id;
	private int nroFactura;
	private float monto;
	private Date fecha;
	private String tipo;
	private boolean pagado;
	private Date fechaPago;
	private Cliente cliente;
	private Contratacion contratacion;
	
	public FacturaDTO(int  id, int nroFactura, float monto, Date fecha, String tipo, boolean pagado, Date fechaPago,
			Cliente cliente, Contratacion contratacion) {
		this.id = id;
		this.nroFactura = nroFactura;
		this.monto = monto;
		this.fecha = fecha;
		this.tipo = tipo;
		this.pagado = pagado;
		this.fechaPago = fechaPago;
		this.cliente = cliente;
		this.contratacion = contratacion;
	}
	
	public FacturaDTO() {
	}

	public static long getSerialVersionUID() {
        return serialVersionUID;
    }

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

}

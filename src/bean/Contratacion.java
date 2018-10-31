package bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "contratacion")
public class Contratacion implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int id;
	@OneToOne
	@JoinColumn(name="idServicio")
	private Servicio servicio;
	
	@OneToOne
	@JoinColumn(name="idCliente")
	private Cliente cliente;
	
	
    private int cantHoras;
    private int cantEmpleados;
    private Date fechaInicial;
    private Date fechaFinal;
    private String tipoFactura;
	private float monto;
	
	public Contratacion() {
		
	}
	
//	public Contratacion(Date fechaInicial, Date fechaFinal, int cantHoras, float montoFinal, Cliente cliente) {
//		
//	}
//	
	
	public Contratacion(Servicio servicio, Cliente cliente, int cantHoras, int cantEmpleados,
    		Date fechaInicial, Date fechaFinal, String tipoFactura, float monto) {
		this.servicio = servicio;
    	this.cliente = cliente;
    	this.cantHoras = cantHoras;
    	this.cantEmpleados = cantEmpleados;
    	this.fechaInicial = fechaInicial;
    	this.fechaFinal = fechaFinal;
    	this.tipoFactura = tipoFactura;
    	this.monto = monto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getFechaInicial() {
		return fechaInicial;
	}

	public void setFechaInicial(Date fechaInicial) {
		this.fechaInicial = fechaInicial;
	}

	public Date getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public int getCantHoras() {
		return cantHoras;
	}

	public void setCantHoras(int cantHoras) {
		this.cantHoras = cantHoras;
	}

	public int getCantEmpleados() {
		return cantEmpleados;
	}

	public void setCantEmpleados(int cantEmpleados) {
		this.cantEmpleados = cantEmpleados;
	}

	public String getTipoFactura() {
		return tipoFactura;
	}

	public void setTipoFactura(String tipoFactura) {
		this.tipoFactura = tipoFactura;
	}

	public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}




}

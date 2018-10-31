package dto;

import java.io.Serializable;
import java.util.Date;

import bean.Cliente;
import bean.Servicio;

public class ContratacionDTO implements Serializable {

    private static final long serialVersionUID = 304767971881426451L;

    private Servicio servicio;
    private Cliente cliente;
    private int cantHoras;
    private int cantEmpleados;
    private Date fechaInicial;
    private Date fechaFinal;
    private String tipoFactura;
	private float monto;

    public ContratacionDTO(Servicio servicio, Cliente cliente, int cantHoras, int cantEmpleados,
    		Date fechaInicial, Date fechaFinal, String tipoFactura, float monto) {
    	super();
    	this.servicio = servicio;
    	this.cliente = cliente;
    	this.cantHoras = cantHoras;
    	this.cantEmpleados = cantEmpleados;
    	this.fechaInicial = fechaInicial;
    	this.fechaFinal = fechaFinal;
    	this.tipoFactura = tipoFactura;
    	this.monto = monto;
    
    }

    public ContratacionDTO() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

	public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getCantHoras() {
		return cantHoras;
	}

	public void setCantHoras(int cantHoras) {
		this.cantHoras = cantHoras;
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

	public String getTipoFactura() {
		return tipoFactura;
	}

	public void setTipoFactura(String tipoFactura) {
		this.tipoFactura = tipoFactura;
	}

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public int getCantEmpleados() {
		return cantEmpleados;
	}

	public void setCantEmpleados(int cantEmpleados) {
		this.cantEmpleados = cantEmpleados;
	}



}

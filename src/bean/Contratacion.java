package bean;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
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
	
	
	private Date fechaInicial;
	private Date fechaFinal;
	private int cantHoras;
	private int cantEmpleados;
	private float montoFinal;
	
	public Contratacion() {
		
	}
	
	public Contratacion(Date fechaInicial, Date fechaFinal, int cantHoras, float montoFinal, Cliente cliente) {
		
	}
	
	
	public Contratacion(Servicio servicio, Date fechaInicial, Date fechaFinal, int cantHoras, int cantEmpleados, float montoFinal, Cliente cliente) {
		this.servicio = servicio;
		this.fechaInicial = fechaInicial;
		this.fechaFinal = fechaFinal;
		this.cantHoras = cantHoras;
		this.cantEmpleados = cantEmpleados;
		this.montoFinal = montoFinal;
		this.cliente = cliente;
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

	public float getMontoFinal() {
		return montoFinal;
	}

	public void setMontoFinal(float montoFinal) {
		this.montoFinal = montoFinal;
	}


}

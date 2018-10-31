package bean;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "fichada")
public class Fichada {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private Time hora;
	private String tipo;
	private Date fecha;
	
	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@OneToOne
	@JoinColumn(name="empleado")
	private Empleado empleado;
	
	
	public Fichada(String tipo, Empleado empleado) {
		super();
	
		this.hora.getTime();
		this.setTipo(tipo);
		this.empleado = empleado;
		this.fecha.getDate();
	}
	
	
	public Fichada(String tipo, Empleado empleado, Time hora, Date fecha) {
		super();
	
		this.hora = hora;
		this.setTipo(tipo);
		this.empleado = empleado;
		this.fecha = fecha;
	}

	public Fichada() {
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public void setHora(Time hora) {
		this.hora = hora;
	}

	public Time getHora()
	{
		return this.hora;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}

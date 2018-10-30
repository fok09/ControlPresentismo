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

	public void getHora()
	{
		this.hora.getTime();
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}

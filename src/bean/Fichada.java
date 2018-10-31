package bean;

import java.time.LocalDateTime;
import java.util.Date;

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
	private LocalDateTime hora;
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
	
	
	@SuppressWarnings("deprecation")
	public Fichada(String tipo, Empleado empleado) {
		super();
		//this.hora.getTime();
		this.setTipo(tipo);
		//this.empleado = empleado;
		this.fecha.getDate();
	}
	
	
	public Fichada(String tipo, Empleado empleado, LocalDateTime hora, Date date) {
		//super();
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

	public void setHora(LocalDateTime hora){
		this.hora = hora;
	}

	public LocalDateTime getHora()
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

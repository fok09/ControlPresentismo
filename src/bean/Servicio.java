package bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "servicio")
public class Servicio implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int id;
	protected String nombre;
	protected float monto;
	protected float porcentajeEmpleado;
	
	public Servicio(String nombre, float monto, float porcentajeEmpleado) {
		super();
		this.nombre = nombre;
		this.monto = monto;
		this.porcentajeEmpleado = porcentajeEmpleado;
	}	
	
	public Servicio() {
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}

	public float getPorcentajeEmpleado() {
		return porcentajeEmpleado;
	}

	public void setPorcentajeEmpleado(float porcentajeEmpleado) {
		this.porcentajeEmpleado = porcentajeEmpleado;
	}
	
	
	
	

}

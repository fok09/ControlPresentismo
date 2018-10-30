package bean;

import java.io.Serializable;
import java.sql.Time;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Fisica")
public class PersonaFisica extends Cliente implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String apellido;
	
public PersonaFisica() {
		
	}

	public PersonaFisica(String cuit_cuil, String domicilio, String telefono, String mail, Time horaEntrada,
			Time horaSalida, List<Empleado> empleados, String nombre, String apellido) {
		super(cuit_cuil, domicilio, telefono, mail, horaEntrada, horaSalida, empleados);
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public PersonaFisica(String cuit_cuil, String domicilio, String telefono, String mail, Time horaEntrada,
			Time horaSalida, String nombre, String apellido) {
		super(cuit_cuil, domicilio, telefono, mail, horaEntrada, horaSalida);
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	

}

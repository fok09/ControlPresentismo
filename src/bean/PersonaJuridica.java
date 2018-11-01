package bean;

import java.io.Serializable;
import java.sql.Time;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Juridica")
public class PersonaJuridica extends Cliente implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String razonSocial;
	
	public PersonaJuridica() {
		
	}

	public PersonaJuridica(String cuit_cuil, String cbu, String domicilio, String telefono, String mail, Time horaEntrada,
			Time horaSalida, List<Empleado> empleados, String razonSocial) {
		super(cuit_cuil, cbu, domicilio, telefono, mail, horaEntrada, horaSalida, empleados);
		this.razonSocial = razonSocial;
	}
	
	public PersonaJuridica(String cuit_cuil, String cbu, String domicilio, String telefono, String mail, Time horaEntrada,
			Time horaSalida, String razonSocial) {
		super(cuit_cuil, cbu, domicilio, telefono, mail, horaEntrada, horaSalida);
		this.razonSocial = razonSocial;
	}
	
	
	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	
	
}

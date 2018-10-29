package bean;

import java.sql.Time;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Juridica")
public class PersonaJuridica extends Cliente{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String razonSocial;
	
	

	public PersonaJuridica(String cuit_cuil, String domicilio, String telefono, String mail, Time horaEntrada,
			Time horaSalida, List<Empleado> empleados, String razonSocial) {
		super(cuit_cuil, domicilio, telefono, mail, horaEntrada, horaSalida, empleados);
		this.razonSocial = razonSocial;
	}

	public PersonaJuridica() {
		
	}
	
	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	
	
}

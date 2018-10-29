package bean;

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

	public PersonaJuridica() {
		
	}
	
	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	
	
}

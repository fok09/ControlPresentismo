package bean;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Semanal")
public class Semanal extends Contratacion {
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Semanal() {
		super();
	}

	public float calcularMonto() {
		
		return this.monto;
	}
	
}

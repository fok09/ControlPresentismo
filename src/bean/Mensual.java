package bean;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Mensual")
public class Mensual extends Contratacion {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Mensual() {
		super();
	}
	
	public float calcularMonto() {
		
		return this.monto;
	}
	
}

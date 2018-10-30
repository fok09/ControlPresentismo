package bean;

import java.sql.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Mensual")
public class Mensual extends Contratacion {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	public Mensual(Date fechaInicial, Date fechaFinal, int cantHoras) {
		super(fechaInicial, fechaFinal, cantHoras);
	}



	public float calcularMonto() {
		
		return this.monto;
	}
	
}

package bean;

import java.sql.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Semanal")
public class Semanal extends Contratacion {
		
	private static final long serialVersionUID = 1L;



	public Semanal(Date fechaInicial, Date fechaFinal, int cantHoras) {
		super(fechaInicial, fechaFinal, cantHoras);
	}



	public float calcularMonto() {
		
		return this.monto;
	}
	
}

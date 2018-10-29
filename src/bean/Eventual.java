package bean;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Eventual")
public class Eventual extends Contratacion {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private float cantHoras;
	private float precioHora;
		
	//constructor
	public Eventual(float cantHoras, float precioHora) {
		super();
		this.cantHoras = cantHoras;
		this.precioHora = precioHora;
	}

	public Eventual() {
		
	}

	public float calcularMonto() {
		
		return this.cantHoras * this.precioHora;
	}

	
	//gets and sets
	public float getCantHoras() {
		return cantHoras;
	}

	public void setCantHoras(float cantHoras) {
		this.cantHoras = cantHoras;
	}

	public float getPrecioHora() {
		return precioHora;
	}

	public void setPrecioHora(float precioHora) {
		this.precioHora = precioHora;
	}
	
}

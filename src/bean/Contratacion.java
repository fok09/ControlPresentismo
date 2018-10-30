package bean;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Table(name = "contratacion")
@Inheritance (strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
		name="tipo",
		discriminatorType=DiscriminatorType.STRING
		)
public abstract class Contratacion implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int id;
	protected float monto;
	protected Date fechaInicial;
	protected Date fechaFinal;
	protected int cantHoras;
	
	public Contratacion(Date fechaInicial, Date fechaFinal, int cantHoras) {
		
	}
	
	public abstract float calcularMonto();

}

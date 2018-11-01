package bean;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.util.List;
import java.util.Vector;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
@Inheritance (strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
		name="tipo",
		discriminatorType=DiscriminatorType.STRING
		)
public class Cliente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int id;
	protected String cuit_cuil;
	protected String cbu;
	protected String domicilio;
	protected String telefono;
	protected String mail;
	protected Time horaEntrada;
	protected Time horaSalida;
	protected Vector<Factura> facturas;
	
	@OneToMany (cascade=CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="idCliente")
	private List<Empleado> empleados;
	
	public Cliente() {
		
	}
	
	// constructor Cliente con lista de empleados
	public Cliente(String cuit_cuil, String cbu, String domicilio, String telefono, String mail, Time horaEntrada, Time horaSalida,
			List<Empleado> empleados) {
		super();
		this.cuit_cuil = cuit_cuil;
		this.cbu = cbu;
		this.domicilio = domicilio;
		this.telefono = telefono;
		this.mail = mail;
		this.horaEntrada = horaEntrada;
		this.horaSalida = horaSalida;
		this.empleados = empleados;
	}

	//constructor Cliente sin lista de empleados
	public Cliente(String cuit_cuil, String cbu, String domicilio, String telefono, String mail, Time horaEntrada, Time horaSalida) {
		super();
		this.cuit_cuil = cuit_cuil;
		this.cbu = cbu;
		this.domicilio = domicilio;
		this.telefono = telefono;
		this.mail = mail;
		this.horaEntrada = horaEntrada;
		this.horaSalida = horaSalida;
	}
	
	
	public void agregarEmpleado(String nombre, String apellido, String mail, String dni, String telefono, Date fechaNac, String legajo, String tipo, int horasMensuales) {
		
		Empleado e = new Empleado(nombre, apellido, mail, dni, telefono, fechaNac, legajo, tipo, horasMensuales);
		empleados.add(e);
	
	}
	
	public float consultarDeuda() {
		
		float deuda = 0;
		
		for (Factura f: facturas)
			if (!f.isPagado())
				deuda = deuda + f.getMonto();
		return deuda;
		
	}
	
	
	//gets and sets
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getCuit_cuil() {
		return cuit_cuil;
	}

	public void setCuit_cuil(String cuit_cuil) {
		this.cuit_cuil = cuit_cuil;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Time getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(Time horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public Time getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(Time horaSalida) {
		this.horaSalida = horaSalida;
	}
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	public void setEmpleado(Empleado e) {
		this.empleados.add(e);
	}
	
	public Empleado obtenerEmpleado(String dni) {
		for(Empleado e: empleados) {
			if(e.getDni().equals(dni))
			{
				return e;
			}
		}
		
		return null;
	}
	
	public Empleado obtenerEmpleadoPorLegajo(String legajo) {
		for(Empleado e: empleados) {
			if(e.getLegajo().equals(legajo))
			{
				return e;
			}
		}
		
		return null;
	}

	public String getCbu() {
		return cbu;
	}

	public void setCbu(String cbu) {
		this.cbu = cbu;
	}
	
	
}

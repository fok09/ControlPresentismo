package dto;

import java.io.Serializable;

import bean.Empleado;

public class EmpleadoHorasDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String cuitEmpresa;
	private String dni;
	private String legajo;
	private String tipo;
	private String nombre;
	private String apellido;
	private int horasTrabajadas;
	private int horasAusentes;
	private int diasVacaciones;
	private int diasTrabajados;
	private int diasAusentes;
	
	public EmpleadoHorasDTO(String cuitEmpresa, String dni, String legajo, String tipo, int horasTrabajadas,
			int horasAusentes, int diasVacaciones) {
		super();
		this.cuitEmpresa = cuitEmpresa;
		this.dni = dni;
		this.legajo = legajo;
		this.tipo = tipo;
		this.horasTrabajadas = horasTrabajadas;
		this.horasAusentes = horasAusentes;
		this.diasVacaciones = diasVacaciones;
		this.diasAusentes = horasAusentes/8;
		this.diasTrabajados= horasTrabajadas/8;
	}
	
	public EmpleadoHorasDTO(Empleado e, String cuit) {
		super();
		this.cuitEmpresa = cuit;
		this.dni = e.getDni();
		this.legajo = e.getLegajo();
		this.tipo = e.getTipo();
		this.horasTrabajadas = 0;
		this.horasAusentes = 0;
		this.diasVacaciones = 0;
		this.diasAusentes = 0;
		this.diasTrabajados= 0;
		this.nombre = e.getNombre();
		this.apellido = e.getApellido();
	}


	public EmpleadoHorasDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getCuitEmpresa() {
		return cuitEmpresa;
	}

	public void setCuitEmpresa(String cuitEmpresa) {
		this.cuitEmpresa = cuitEmpresa;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
		this.diasTrabajados = horasTrabajadas/8;
	}

	public int getHorasAusentes() {
		return horasAusentes;
	}

	public void setHorasAusentes(int horasAusentes) {
		this.horasAusentes = horasAusentes;
		this.diasAusentes = horasAusentes/8;
	}

	public int getDiasVacaciones() {
		return diasVacaciones;
	}

	public void setDiasVacaciones(int diasVacaciones) {
		this.diasVacaciones = diasVacaciones;
	}
	
	public int getDiasTrabajados() {
		return diasTrabajados;
	}
	
	public int getDiasAusentes() {
		return diasAusentes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
}

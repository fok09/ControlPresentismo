package dto;

import java.io.Serializable;
import java.util.Date;

public class EmpleadoDTO implements Serializable {

    private static final long serialVersionUID = 304767881881426451L;

    private int id;
	private String nombre;
	private String apellido;
	private String mail;
	private String dni;
	private String telefono;
	private Date fechaNac;
	private String legajo;
	private String tipo;
	private int horasMensuales;

    public EmpleadoDTO(int id, String nombre, String apellido, String mail,	String dni, String telefono, Date fechaNac, String legajo, String tipo, int horasMensuales) {
        this.id = id;
    	this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.dni = dni;
        this.telefono = telefono;
        this.fechaNac = fechaNac;
        this.legajo = legajo;
        this.tipo = tipo;
        this.horasMensuales = horasMensuales;
    }

    public EmpleadoDTO(String nombre, String apellido, String mail,	String dni, String telefono, Date fechaNac, String legajo, String tipo, int horasMensuales) {
    	this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.dni = dni;
        this.telefono = telefono;
        this.fechaNac = fechaNac;
        this.legajo = legajo;
        this.tipo = tipo;
        this.horasMensuales = horasMensuales;
    }
    
    public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getHorasMensuales() {
		return horasMensuales;
	}

	public void setHorasMensuales(int horasMensuales) {
		this.horasMensuales = horasMensuales;
	}

	public EmpleadoDTO() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}
    
    
}

package dto;

import java.io.Serializable;
import java.sql.Date;

public class EmpleadoDTO implements Serializable {

    private static final long serialVersionUID = 304767881881426451L;

    private int id;
	private String nombre;
	private String apellido;
	private String mail;
	private String dni;
	private String telefono;
	private Date fechaNac;

    public EmpleadoDTO(int id, String nombre, String apellido, String mail,	String dni, String telefono, Date fechaNac) {
        this.id = id;
    	this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.dni = dni;
        this.telefono = telefono;
        this.fechaNac = fechaNac;
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
    
    
}

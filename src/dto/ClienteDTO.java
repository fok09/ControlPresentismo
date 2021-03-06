package dto;

import java.io.Serializable;
import java.sql.Time;
import java.util.Vector;

public class ClienteDTO implements Serializable {

    private static final long serialVersionUID = 304767771881426451L;

	protected String cuit_cuil;
	protected String cbu;
	protected String domicilio;
	protected String telefono;
	protected String mail;
	protected Time horaEntrada;
	protected Time horaSalida;
	protected Vector<EmpleadoDTO> empleados;

    
	public ClienteDTO(String cuit_cuil, String cbu, String domicilio, String telefono, String mail, Time horaEntrada, Time horaSalida, Vector<EmpleadoDTO> empleados) {
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

    public ClienteDTO() {
    }

    
	public ClienteDTO(String cuit_cuil, String cbu, String domicilio, String telefono, String mail, Time horaEntrada, Time horaSalida) {
        super();
    	this.cuit_cuil = cuit_cuil;
    	this.cbu = cbu;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.mail = mail;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.empleados = new Vector<EmpleadoDTO>();
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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

	public Vector<EmpleadoDTO> getEmpleados() {
		return empleados;
	}

	
	public void setEmpleados(Vector<EmpleadoDTO> empleados) {
		this.empleados = empleados;
	}

	public String getCbu() {
		return cbu;
	}

	public void setCbu(String cbu) {
		this.cbu = cbu;
	}


}

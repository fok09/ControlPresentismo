package dto;

import java.io.Serializable;
import java.sql.Time;
import java.util.*;

public class ClienteDTO implements Serializable {

    private static final long serialVersionUID = 304767771881426451L;

	private int id;
	protected static String cuit_cuil;
	protected static String domicilio;
	protected static String telefono;
	protected static String mail;
	protected static Time horaEntrada;
	protected static Time horaSalida;
	protected static Vector<EmpleadoDTO> empleados;

    @SuppressWarnings("static-access")
	public ClienteDTO(int id, String cuit_cuil, String domicilio, String telefono, String mail, Time horaEntrada, Time horaSalida, Vector<EmpleadoDTO> empleados) {
        super();
    	this.id = id;
    	this.cuit_cuil = cuit_cuil;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.mail = mail;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.empleados = empleados;
    }

    public ClienteDTO() {
    }

    @SuppressWarnings("static-access")
	public ClienteDTO(String cuit_cuil, String domicilio, String telefono, String mail, Time horaEntrada, Time horaSalida) {
        super();
    	this.cuit_cuil = cuit_cuil;
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

	@SuppressWarnings("static-access")
	public void setCuit_cuil(String cuit_cuil) {
		this.cuit_cuil = cuit_cuil;
	}

	public String getDomicilio() {
		return domicilio;
	}

	@SuppressWarnings("static-access")
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getTelefono() {
		return telefono;
	}

	@SuppressWarnings("static-access")
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getMail() {
		return mail;
	}

	@SuppressWarnings("static-access")
	public void setMail(String mail) {
		this.mail = mail;
	}

	public Time getHoraEntrada() {
		return horaEntrada;
	}

	@SuppressWarnings("static-access")
	public void setHoraEntrada(Time horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public Time getHoraSalida() {
		return horaSalida;
	}

	@SuppressWarnings("static-access")
	public void setHoraSalida(Time horaSalida) {
		this.horaSalida = horaSalida;
	}

	public Vector<EmpleadoDTO> getEmpleados() {
		return empleados;
	}

	@SuppressWarnings("static-access")
	public void setEmpleados(Vector<EmpleadoDTO> empleados) {
		this.empleados = empleados;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}

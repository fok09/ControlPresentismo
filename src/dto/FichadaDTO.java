package dto;

import java.io.Serializable;
import java.sql.Time;
import bean.Empleado;

public class FichadaDTO implements Serializable {

    private static final long serialVersionUID = 324767771881426451L;

    private int id;
	private Time hora;
	private String tipo;
	private Empleado empleado;

    public FichadaDTO(int id, Time hora, String tipo, Empleado empleado) {
        this.id = id;
    	this.hora = hora;
        this.tipo = tipo;
        this.empleado = empleado;
    }
    
    public FichadaDTO() {
    }

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Time getHora() {
		return hora;
	}

	public void setHora(Time hora) {
		this.hora = hora;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
}

package dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import bean.Empleado;

public class FichadaDTO implements Serializable {

    private static final long serialVersionUID = 324767771881426451L;

	private LocalDateTime hora;
	private String tipo;
	private Empleado empleado;
	private Date fecha;

    public FichadaDTO(String tipo, Empleado empleado, LocalDateTime hora, Date fecha) {
  		//super();
		this.hora = hora;
		this.tipo=tipo;
		this.empleado = empleado;
		this.setFecha(fecha);
    }
    
    public FichadaDTO() {
    }

	public LocalDateTime getHora() {
		return hora;
	}

	public void setHora(LocalDateTime hora) {
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

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
    
}

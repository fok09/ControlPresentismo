package dto;

import java.io.Serializable;

public class EventualDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private float cantHoras;
	private float precioHora;

	
	
    public EventualDTO(float cantHoras, float precioHora) {
		this.cantHoras = cantHoras;
		this.precioHora = precioHora;
	}

	public EventualDTO() {
    }

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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}

package dto;

import java.io.Serializable;

public class EventualDTO extends ContratacionDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private float cantHoras;
	private float precioHora;

	
	
    public EventualDTO(int id, float monto, float cantHoras, float precioHora) {
		super(id, monto);
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}

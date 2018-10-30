package dto;

import java.io.Serializable;

public class ContratacionDTO implements Serializable {

    private static final long serialVersionUID = 304767971881426451L;

    private int id;
	private float monto;

    public ContratacionDTO(int id, float monto) {
    	super();
        this.id = id;
    	this.monto = monto;
    }

    public ContratacionDTO() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

	public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}

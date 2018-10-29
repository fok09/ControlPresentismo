package dto;

import java.io.Serializable;

public class ContratacionDTO implements Serializable {

    private static final long serialVersionUID = 304767971881426451L;

	private float monto;

    public ContratacionDTO(float monto) {
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

}

package dto;

import java.io.Serializable;

public class MensualDTO extends ContratacionDTO implements Serializable {

    private static final long serialVersionUID = 304767771881426451L;

	private int id;
	private float monto;

    public MensualDTO(int id, float monto) {
        super(id , monto);
    }

    public MensualDTO() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}

    
}

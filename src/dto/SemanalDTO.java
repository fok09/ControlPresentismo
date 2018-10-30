package dto;

import java.io.Serializable;

public class SemanalDTO extends ContratacionDTO implements Serializable {

    private static final long serialVersionUID = 378767771881426451L;

	private int id;
	private float monto;

    public SemanalDTO(int id, float monto) {
        super(id , monto);
    }

    public SemanalDTO() {
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

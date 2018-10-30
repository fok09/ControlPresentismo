package dto;

import java.io.Serializable;

public class PersonaJuridicaDTO extends ClienteDTO implements Serializable {

    private static final long serialVersionUID = 312767771881426451L;

	private static int id;
	private String razonSocial;

	public PersonaJuridicaDTO(String razonSocial) {
		super(cuit_cuil, domicilio, telefono, mail, horaEntrada, horaSalida);
		this.razonSocial = razonSocial;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		PersonaJuridicaDTO.id = id;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

    
}

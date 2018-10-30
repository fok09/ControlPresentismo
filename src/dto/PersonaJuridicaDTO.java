package dto;

import java.io.Serializable;
import java.sql.Time;

public class PersonaJuridicaDTO extends ClienteDTO implements Serializable {

    private static final long serialVersionUID = 312767771881426451L;

	
	private String razonSocial;

//	public PersonaJuridicaDTO(String razonSocial) {
//		super(cuit_cuil, domicilio, telefono, mail, horaEntrada, horaSalida);
//		this.razonSocial = razonSocial;
//	}

	public PersonaJuridicaDTO(String razonSocial, String cuit_cuil, String domicilio, String telefono,
			String mail, Time horaEntrada, Time horaSalida) {
		super(cuit_cuil, domicilio, telefono, mail, horaEntrada, horaSalida);
		this.razonSocial = razonSocial;
	}
	
	
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		PersonaJuridicaDTO.id = id;
//	}

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

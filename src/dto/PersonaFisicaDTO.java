package dto;

import java.io.Serializable;

public class PersonaFisicaDTO extends ClienteDTO implements Serializable {

    private static final long serialVersionUID = 312767771881426451L;

	private static int id;
	private String nombre;
	private String apellido;

	public PersonaFisicaDTO(String nombre, String apellido) {
		super(cuit_cuil, domicilio, telefono, mail, horaEntrada, horaSalida);
		this.nombre = nombre;
		this.apellido = apellido;
	}

    public PersonaFisicaDTO() {
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		PersonaFisicaDTO.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}

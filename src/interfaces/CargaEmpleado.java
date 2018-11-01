package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import bean.Contratacion;
import dto.ContratacionDTO;
import dto.ClienteDTO;
import dto.EmpleadoDTO;
import dto.FacturaDTO;
import dto.FichadaDTO;
import dto.PersonaFisicaDTO;
import dto.PersonaJuridicaDTO;

public interface CargaEmpleado extends Remote {

	//metodos con DTOs
	public void cargaEmpleado(String CUITEmpresa, String legajo,String nombre, String apellido, String mail, String dni, String telefono, String tipo, int cantHorasMensual) throws RemoteException;

}

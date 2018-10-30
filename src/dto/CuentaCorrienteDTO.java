package dto;

import java.io.Serializable;
import java.util.*;
import bean.Cliente;

public class CuentaCorrienteDTO implements Serializable {

    private static final long serialVersionUID = 304767071881426451L;

    private int id;
	private float saldo;
	private Vector<FacturaDTO> facturas;
	private Cliente cliente;

	
	
    public CuentaCorrienteDTO(int id, float saldo, Vector<FacturaDTO> facturas, Cliente cliente) {
    	this.id = id;
		this.saldo = saldo;
		this.facturas = facturas;
		this.cliente = cliente;
	}

    
	public CuentaCorrienteDTO(float saldo, Cliente cliente) {
		this.saldo = saldo;
		this.cliente = cliente;
		this.facturas = new Vector<FacturaDTO>();
	}

    public CuentaCorrienteDTO() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }


	public float getSaldo() {
		return saldo;
	}


	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}


	public Vector<FacturaDTO> getFacturas() {
		return facturas;
	}


	public void setFacturas(Vector<FacturaDTO> facturas) {
		this.facturas = facturas;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


    
}

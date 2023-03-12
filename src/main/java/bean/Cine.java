package bean;

import java.util.ArrayList;
import java.util.List;

public class Cine {
	int id, Salas, idDistrito;
	String RazonSocial, Direccion, Telefonos;
	private String[] aCine;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalas() {
		return Salas;
	}

	public void setSalas(int salas) {
		Salas = salas;
	}

	public int getIdDistrito() {
		return idDistrito;
	}

	public void setIdDistrito(int idDistrito) {
		this.idDistrito = idDistrito;
	}

	public String getRazonSocial() {
		return RazonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		RazonSocial = razonSocial;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getTelefonos() {
		return Telefonos;
	}

	public void setTelefonos(String telefonos) {
		Telefonos = telefonos;
	}

	public Cine(int id, int salas, int idDistrito, String razonSocial, String direccion, String telefonos) {
		super();
		this.id = id;
		Salas = salas;
		this.idDistrito = idDistrito;
		RazonSocial = razonSocial;
		Direccion = direccion;
		Telefonos = telefonos;
	}

	public Cine() {
		super();
	}

	public Cine(String[] aRegistro) {
		if (aRegistro == null)
			return;

		id = Integer.parseInt(aRegistro[0]);
		RazonSocial = aRegistro[1];
		Salas = Integer.parseInt(aRegistro[2]);
		idDistrito = Integer.parseInt(aRegistro[3]);
		Direccion = aRegistro[4];
		Telefonos = aRegistro[5];

	}
	
	public Object [] getRegistro() {
		return new Object[] {
				id,RazonSocial,Salas,idDistrito,Direccion,Telefonos
		};
	}
	public List<Cine> getRegistros(String [][] mRegistros){
		if (mRegistros!= null) return null;
		
		List<Cine> lstCine = new ArrayList<>();
		lstCine.add(new Cine(aCine));
		return lstCine;
	}
	 

}

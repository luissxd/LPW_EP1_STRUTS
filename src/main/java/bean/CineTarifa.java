package bean;

import java.util.ArrayList;
import java.util.List;

public class CineTarifa {
	String DiasSemana, Precio;

	public String getDiasSemana() {
		return DiasSemana;
	}

	public void setDiasSemana(String diasSemana) {
		DiasSemana = diasSemana;
	}

	public String getPrecio() {
		return Precio;
	}

	public void setPrecio(String precio) {
		Precio = precio;
	}

	public CineTarifa(String diasSemana, String precio) {
		super();
		DiasSemana = diasSemana;
		Precio = precio;
	}

	public CineTarifa() {
		super();
	}

	public List<CineTarifa> getCineTarifaList(String[][] mRegistros) {

		if (mRegistros == null)
			return null;

		List<CineTarifa> lstCineTarifa = new ArrayList<>();
		for (String[] aCineTarifa : mRegistros)
			lstCineTarifa.add(new CineTarifa(aCineTarifa[0], aCineTarifa[1]));

		return lstCineTarifa;

	}

}

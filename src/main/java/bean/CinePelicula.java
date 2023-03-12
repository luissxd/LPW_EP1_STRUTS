package bean;

import java.util.ArrayList;
import java.util.List;

public class CinePelicula {
	String Sala, Horarios;

	public String getSala() {
		return Sala;
	}

	public void setSala(String sala) {
		Sala = sala;
	}

	public String getHorarios() {
		return Horarios;
	}

	public void setHorarios(String horarios) {
		Horarios = horarios;
	}

	public CinePelicula(String sala, String horarios) {
		super();
		Sala = sala;
		Horarios = horarios;
	}

	public CinePelicula() {
		super();
	}

	public List<CinePelicula> getCinePeliculaList(String[][] mRegistros) {

		if (mRegistros == null)
			return null;

		List<CinePelicula> lstCinePelicula = new ArrayList<>();
		for (String[] aCinePelicula : mRegistros)
			lstCinePelicula.add(new CinePelicula(aCinePelicula[0], aCinePelicula[1]));

		return lstCinePelicula;

	}

}

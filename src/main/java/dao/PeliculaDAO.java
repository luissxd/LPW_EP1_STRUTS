package dao;

import java.util.ArrayList;
import java.util.List;

import bean.Pelicula;

public class PeliculaDAO {
	db.Db db = new db.Db("CineStar");
	
	public Object getPeliculas(int id, boolean bLista) {
		db.Sentencia( String.format("call sp_getPeliculas(%s)",id) );
		String [][] mRegistros = db.getRegistros();
	
		if (mRegistros == null) return null;
		if (!bLista) return mRegistros;
		
		List<Pelicula> lstPeliculas = new ArrayList<>();
		for (String [] aRegistro : mRegistros)
			lstPeliculas.add(new Pelicula(aRegistro));
		
		return lstPeliculas;
		
	}
	
	 public Object getPelicula(String id, boolean bEntidad) {
		db.Sentencia(String.format("call sp_getPelicula(%s)", id));
		String [] aRegistro = db.getRegistro();
		
		if (aRegistro == null) return null;
		if (!bEntidad) return aRegistro;
		
		return new Pelicula(aRegistro);
		
	 }
 
}
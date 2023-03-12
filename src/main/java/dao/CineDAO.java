package dao;

import java.util.ArrayList;
import java.util.List;

import bean.Cine;
import bean.CinePelicula;
import bean.CineTarifa;

public class CineDAO {
	db.Db db = new db.Db("CineStar");
	
	public String [][] getVerCines (){
		db.Sentencia("call sp_getVerCines()");
		return db.getRegistros();
		
	}
	public String [] getCine (Object id){
		db.Sentencia( String.format("call sp_getVerCines(%s)",id));
		return db.getRegistro();
		
	}
	public String [][] getCineTarifas (Object id){
		db.Sentencia( String.format("call sp_getCineTarifas(%s)",id));
		return db.getRegistros();
		
	}
	public String [][] getCinePeliculas (Object id){
		db.Sentencia( String.format("call sp_getCinePeliculas(%s)",id));
		return db.getRegistros();
		
	}
	public List<Cine> getVerCinesList(){
		db.Sentencia("call sp_getVercines");
		return new Cine().getRegistros(db.getRegistros());
		
	}
	public Cine getCineList(Object id) {
		db.Sentencia( String.format("call sp_getCine(%s)",id));
		return new Cine(db.getRegistro());
		
	}
	public List<CineTarifa> getCineTarifasList(Object id) {
		db.Sentencia( String.format("call sp_getCineTarifas(%s)",id));
		return new CineTarifa().getCineTarifaList(db.getRegistros());
		
	}
	public List<CinePelicula> getCinePeliculasList(Object id) {
		db.Sentencia( String.format("call sp_getCinePeliculas(%s)",id));
		return new CinePelicula().getCinePeliculaList(db.getRegistros());
		
	}
}
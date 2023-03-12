package bean;

public class Pelicula {
	int id, idClasificacion, idEstado;
	String Titulo, FechaEstreno, Director, Generos, Duracion, Link, Reparto, Sinopsis;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdClasificacion() {
		return idClasificacion;
	}

	public void setIdClasificacion(int idClasificacion) {
		this.idClasificacion = idClasificacion;
	}

	public int getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(int idEstado) {
		this.idEstado = idEstado;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getFechaEstreno() {
		return FechaEstreno;
	}

	public void setFechaEstreno(String fechaEstreno) {
		FechaEstreno = fechaEstreno;
	}

	public String getDirector() {
		return Director;
	}

	public void setDirector(String director) {
		Director = director;
	}

	public String getGeneros() {
		return Generos;
	}

	public void setGeneros(String generos) {
		Generos = generos;
	}

	public String getDuracion() {
		return Duracion;
	}

	public void setDuracion(String duracion) {
		Duracion = duracion;
	}

	public String getLink() {
		return Link;
	}

	public void setLink(String link) {
		Link = link;
	}

	public String getReparto() {
		return Reparto;
	}

	public void setReparto(String reparto) {
		Reparto = reparto;
	}

	public String getSinopsis() {
		return Sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		Sinopsis = sinopsis;
	}

	public Pelicula() {
		super();
	}

	public Pelicula(String[] aRegistro) {
		if (aRegistro == null)
			return;

		id = Integer.parseInt(aRegistro[0]);
		Titulo = aRegistro[1];

		if (aRegistro.length == 4) {
			Sinopsis = aRegistro[2];
			Link = aRegistro[3];
			return;
		}

		FechaEstreno = aRegistro[2];
		Director = aRegistro[3];
		Generos = aRegistro[4];
		idClasificacion = Integer.parseInt(aRegistro[5]);
		idEstado = Integer.parseInt(aRegistro[6]);
		Duracion = aRegistro[7];
		Link = aRegistro[8];
		Reparto = aRegistro[9];
		Sinopsis = aRegistro[10];
	}

}

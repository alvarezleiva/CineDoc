package CinePK;

public class Cine {
	protected int aforo;
	protected int butacasOcupadas;
	protected String tituloPelicula;
	protected double precioEntrada;

	public Cine() {
		super();
	}

	public Cine(int aforo) {
		super();
		this.aforo = aforo;
	}

	public Cine(int aforo, String tituloPelicula, double precioEntrada) {
		super();
		this.aforo = aforo;
		this.tituloPelicula = tituloPelicula;
		this.precioEntrada = precioEntrada;
	}

	public int getAforo() {
		return aforo;
	}

	public void setAforo(int aforo) {
		this.aforo = aforo;
	}

	public int getButacasOcupadas() {
		return butacasOcupadas;
	}

	public void setButacasOcupadas(int butacasOcupadas) {
		this.butacasOcupadas = butacasOcupadas;
	}

	public String getTituloPelicula() {
		return tituloPelicula;
	}

	public void setTituloPelicula(String tituloPelicula) {
		this.tituloPelicula = tituloPelicula;
	}

	public double getPrecioEntrada() {
		return precioEntrada;
	}

	public void setPrecioEntrada(double precioEntrada) {
		this.precioEntrada = precioEntrada;
	}

}

package CinePK;

public class Cine {
	protected int aforo;
	protected int butacasOcupadas;
	protected String tituloPelicula;
	protected int precioEntrada;

	public Cine() {
		this.aforo = 100;
		this.butacasOcupadas = 0;
		this.precioEntrada = 5;
		this.tituloPelicula = "Sin determinar";
	}

	public Cine(int aforo) {
		super();
		this.aforo = aforo;
	}

	public Cine(int aforo, String tituloPelicula, int precioEntrada) {
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

	public void setPrecioEntrada(int precioEntrada) {
		this.precioEntrada = precioEntrada;
	}

	// creamos metodos

	public int butacasLibres() {

		return aforo - butacasOcupadas;
	}

	public double porcentajeOcupacion() {

		return (butacasOcupadas * 100) / aforo;
	}

	public int ingresosSala() {
		return precioEntrada * butacasOcupadas;
	}

	public void vaciarSala() {
		butacasOcupadas = 0;
	}
	
	public void venderEntrada(){
		butacasOcupadas = butacasOcupadas+1;
		
	}
	public void devolverEntrada(){
		butacasOcupadas = butacasOcupadas-1;
		}
}

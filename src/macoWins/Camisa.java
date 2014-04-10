package macoWins;

public class Camisa extends Prenda {
	
	public Camisa(Marca marca, boolean importada, int precioBase){ 
		this.marca = marca;
		this.importada = importada;
		this.precioBase = precioBase;
	}
	
	public int adicionales(){
		return 0;
		}
}

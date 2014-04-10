package macoWins;

public class Zapatos extends Prenda {
	
	public int talle;
	public int valorTalle;
	
	public Zapatos(Marca marca, boolean importada, int precioBase, int talle, int valorTalle){
		this.marca = marca;
		this.importada = importada;
		this.precioBase = precioBase;
		this.talle = talle;
		this.valorTalle = valorTalle;
		}
	
	public int adicionales(){
		return talle * valorTalle;
	}
}

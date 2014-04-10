package macoWins;

public class Sombrero extends Prenda {
	
	public int coefMetro;
	public int valorCoef;
	
	public Sombrero(Marca marca, boolean importada, int precioBase, int coefMetro, int valorCoef){
		this.marca = marca;
		this.importada = importada;
		this.precioBase = precioBase;
		this.coefMetro = coefMetro;
		this.valorCoef = valorCoef;
		}
	
	public int adicionales(){
		return coefMetro * valorCoef;
		}
}

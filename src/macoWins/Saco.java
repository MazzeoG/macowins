package macoWins;

public class Saco extends Prenda {

	public int botones;
	public int valorBoton;
	
	public Saco(Marca marca, boolean importada, int precioBase, int botones, int valorBoton){
		this.marca = marca;
		this.importada = importada;
		this.precioBase = precioBase;
		this.botones = botones;
		this.valorBoton = valorBoton;
		}
	
	public int adicionales(){
		return botones * valorBoton;
		}
}

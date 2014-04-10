package macoWins;


public class Pantalon extends Prenda {

	public int cmDeTela;
	public int valorCm;
	
	public Pantalon(Marca marca, boolean importada, int precioBase, int cmDeTela, int valorCm){
		this.marca = marca;
		this.importada = importada;
		this.precioBase = precioBase;
		this.cmDeTela = cmDeTela;
		this.valorCm = valorCm;
		
	}
	
	public int adicionales(){
		return cmDeTela * valorCm;
		}
}

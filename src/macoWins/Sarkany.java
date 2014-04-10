package macoWins;

class Sarkany implements Marca {

	public double precioLimite;
public double porcentajeMayor;
public double porcentajeMenor;


	Sarkany(){
		this.precioLimite = 500;
		this.porcentajeMayor = 1.35;
		this.porcentajeMenor = 1.10;
}

	public double ajustarValorPrenda(double valor){
		if( valor > this.precioLimite ){
			return valor * this.porcentajeMayor;
		}else{
			return valor * this.porcentajeMenor;
		}
	}

}

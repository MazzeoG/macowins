package macoWins;

class Armani implements Marca {

	public double porcAumen;

	Armani(){
		this.porcAumen = 1.65;
}

	public double ajustarValorPrenda(double valor){
		return valor * this.porcAumen;
	}

}

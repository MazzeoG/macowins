package macoWins;

abstract class Prenda {

    	public boolean importada;
    	public Marca marca;
    	public int precioBase;

    	public double precioFinal(){
    		double valor = this.precioIntermedio()  + this.adicImportacion();
    		return marca.ajustarValorPrenda( valor );
    	}
    	
    	public double adicImportacion(){
    		if (this.importada == true){
    			double valor = this.precioIntermedio() * MacoWins.tasaDeImportacion;
    			return valor;
    		}
    		else{
    			return 0;
    			}
    	}

    	public  double precioIntermedio(){
		double precioIntermedio = this.precioBase + this.adicionales() + MacoWins.valorFijoTienda;
		return precioIntermedio;
    	}
	
    	public int adicionales(){
		return 0;
    	}

}
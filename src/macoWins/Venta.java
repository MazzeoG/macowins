package macoWins;

import java.time.LocalTime;

class Venta {

	//public Date fecha;
	public Prenda prenda;
	public MacoWins tienda;
	public int cantidad;
	LocalTime fecha;

	Venta(MacoWins tienda, Prenda prenda, int cantidad, LocalTime fecha){
		this.tienda		= tienda;
		this.prenda		= prenda;
		this.cantidad		= cantidad;
		this.fecha		= fecha;
	}

	public LocalTime getFecha(){
		return this.fecha;
	}

	public double calcularValorTotal(){
		return this.cantidad * this.prenda.precioFinal ();
	}

}

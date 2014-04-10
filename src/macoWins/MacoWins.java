package macoWins;

import java.util.*;
import java.time.LocalTime;

class MacoWins {

	public int valorFijo;
	List<Venta> ventas;
	public static double tasaDeImportacion;
	public static int valorFijoTienda;

	MacoWins(int valorFijo){
		this.valorFijo = valorFijo;
		this.ventas = new ArrayList<Venta>();
	}

	public int getValorFijo(){
		return this.valorFijo;
	}
	
	public double tasaDeImportacion(){
		return this.tasaDeImportacion;
	}
	
	public int valorFijoTienda(){
		return this.valorFijoTienda;
	}

	public void vender(Prenda prenda, int cantidad, LocalTime fecha){
		this.ventas.add( new Venta(this, prenda, cantidad, fecha) );
	}


	public double ventasTotales(){
		return this.ventasTotales(this.ventas);
	}

	public double ventasTotales(List<Venta> ventas){
		double sum = 0;
		for(Venta venta : ventas ){
			sum += venta.calcularValorTotal();
		}
		return sum;
	}


	//Solo funciona si la fecha es exactamente igual
	public double ventasDeFecha(LocalTime fecha){
		return this.ventasTotales((List<Venta>) this.ventas.stream().filter( venta -> venta.getFecha() == fecha ) );
	}

}
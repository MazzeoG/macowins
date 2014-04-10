package macoWins;

import java.time.LocalTime; 

public class Main {

	public static void main(String[] args) {
		
		Sarkany	sarkany     = new Sarkany();
		Armani	armani      = new Armani();

		Zapatos talle44     = new Zapatos(sarkany, true, 400, 44, 5);
		Sombrero sombrero   = new Sombrero(sarkany, true, 150, 15, 1);
		Camisa camisita     = new Camisa(armani, false, 200);
		Saco saquito		= new Saco(armani, false, 300, 5, 10 );
		Pantalon pantalon	= new Pantalon(sarkany, true, 250, 100, 1);

		MacoWins macoWins	= new MacoWins(100);
		
		macoWins.vender( talle44, 3,	LocalTime.now() );
		macoWins.vender( sombrero, 4,	LocalTime.now() );
		macoWins.vender( camisita, 1,	LocalTime.now() );
		macoWins.vender( saquito, 2,	LocalTime.now() );
		macoWins.vender( pantalon, 5,	LocalTime.now() );

		System.out.println("El total vendido por la tienda es de: " + macoWins.ventasTotales() );

	}

}
		





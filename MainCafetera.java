public class MainCafetera{
	public static void main(String args[]){
	/*Establecimiento del inventario de la mañana: 
	El orden es:
	- Café negro <- Todo va en gramos
	- Café descafeinado
	- Café Capuccino
	- Azúcar
	- Leche <- Sólo la leche tiene que estar instanciado en mltrs.
	*/
	EStoy intentando ver que se ve esta madre en Github Desktop
	Cafetera inventario = new Cafetera (350,350,350,100,450);

	inventario.obtenTotalCafeNegro();
	inventario.obtenTotalCafeDecaf();
	inventario.obtenTotalCapuccino();
	inventario.obtenTotalLeche();
	inventario.obtenTotalAzucar();
	inventario.obtenPrecioCafeNegro();
	inventario.obtenPrecioCafeDecaf();
	inventario.obtenPrecioCapuccino();

	System.out.println("Inventario antes de crear el primer pedido de Capuccino:");
	System.out.println(inventario.obtenTotalLeche());
	System.out.println(inventario.obtenTotalAzucar());
	System.out.println(inventario.obtenTotalCapuccino());
	
	Cafetera pedido1 = new Cafetera(3, 2);
	pedido1.hacerCapuccino();
	System.out.println(inventario.obtenTotalLeche());
	System.out.println(inventario.obtenTotalAzucar());
	System.out.println(inventario.obtenTotalCapuccino());

	}
}
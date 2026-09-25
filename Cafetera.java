public class Cafetera{

/*Voy a probar poniendo con static las variables, quiero ir modificándolas a medida que se vayan tomando órdenes
el café debe irse agotando, por lo que cuando llegue a un valor menor al admisible para hacer una taza (de acuerdo con gemini
son 18g xd) entonces debe mandar un mensaje de error que inidique que la bebida no es posible de hacer.*/

	private static int cafeNegro; //Para saber con cuánto café queda en la máquina.
	private static int cafeDecaf; //Gramos de cafe descafeinado;
	private static int capuccino;
	private static int leche; //Obviamente la leche será en ml
	private static int azucar;
	private static final int precioCafeNegro = 230;
	private static final int precioCafeDecaf = 140;
	private static final int precioCapuccino = 300;
	
	public Cafetera(int negro, int decaf, int cafeCapuccino, int Cantazucar, int Cantleche){
		asignaTotalCafeNegro(negro);
		asignaTotalCafeDecaf(decaf);
		asignaTotalCapuccino(cafeCapuccino);
		asignaTotalAzucar(Cantazucar);
		asignaTotalLeche(Cantleche);
	}	

	public Cafetera(int elegirCafe, int cAzucar){
		switch (elegirCafe) {
			case 1:
				hacerCafNeg(cAzucar);
				obtenPrecioCafeNegro();
				break;
			case 2: 
				hacerCafDecaf(cAzucar);
				obtenPrecioCafeDecaf();
				break;
			case 3:
				hacerCapuccino(cAzucar);
				obtenPrecioCapuccino();
				break;
			default:
				System.out.println("Opción no válida.\nIntente de nuevo.");
				break;
		}
	}

	public void asignaTotalCafeNegro(int inventarioN){
		cafeNegro = inventarioN;
	}
	
	public void asignaTotalCafeDecaf(int inventarioD){
		cafeDecaf = inventarioD;
	} 
	
	public void asignaTotalCapuccino(int inventarioC){
		capuccino = inventarioC;
	}
	
	public void asignaTotalAzucar(int inventarioA){
		azucar = inventarioA;
	}

	public void asignaTotalLeche(int inventarioL){
		leche = inventarioL;
	}
	
	public String hacerCafNeg(int udsAzucar){     //Suponiendo que una porción de azúcar = 5grs.
		if(cafeNegro < 18 || azucar < (udsAzucar*5)){
			System.err.println("Error: Producto agotado.");
			return;
		}
		cafeNegro -=18;
		azucar -= (udsAzucar*5);
		return "Producto realizado exitosamente";
	}
	
	public String hacerCafDecaf(int udsAzucar){
		if(cafeDecaf < 18 || azucar < (udsAzucar*5)){
			System.err.println("Error: Producto agotado.");
			return;
		}
		cafeDecaf -= 18;
		azucar -= (udsAzucar*5);
		return "Producto realizado exitosamente";
	}
	
	public String hacerCapuccino(int udsAzucar){
		if(capuccino < 18 || leche < 60 || azucar < (udsAzucar*5)){
			System.err.println("Error: Producto agotado.");
			return;
		}

		leche -= 60;
		capuccino -= 18;
		azucar -= (udsAzucar*5);
		return "Producto realizado exitosamente";
	}
	
	public static int obtenTotalCafeNegro(){	
		return cafeNegro;
	}

	public static int obtenTotalCafeDecaf(){
		return cafeDecaf;
	}

	public static int obtenTotalCapuccino(){	
		return capuccino;
	}

	public static int obtenTotalAzucar(){
		return azucar;
	}
	
	public static int obtenTotalLeche(){
		return leche;
	}

	public int obtenPrecioCafeNegro(){
		return precioCafeNegro;
	}
	
	public int obtenPrecioCafeDecaf(){
		return precioCafeDecaf;
	}
	
	public int obtenPrecioCapuccino(){
		return precioCapuccino;
	}
}
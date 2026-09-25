public class Cambio{
	private int cambio50;
	private int cambio20;
	private int cambio10;
	private int dineroRecibido;

	public Cambio(Cafetera pago){
		cambio50 = 0;
		cambio20 = 0;
		cambio10 = 0;
		calcularBilletes(pago);
	}
	
	public int calcularBilletes(int dineroRecibido, Cafetera pagoTotal){
		int tot = pagoTotal.obtenPrecioCafeNegro();
		if(dineroRecibido >= 50){
		
		}
		if(dineroRecibido >= 20){}
		if(dineroRecibido >= 10){}
	}
	
}
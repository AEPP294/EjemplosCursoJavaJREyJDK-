
public class EjemploCiclos2 {

	public static void main(String[] args) {

		int contador = 0;
		int total = 0;

		while (contador <= 10) { // mientras que condicion sera verdadero ejecuta esto

			total = total + contador;
			System.out.println(contador);
			// contador = contador + 1; //incrementa de uno en uno
			contador += 1; // incrementa de uno en uno
			// contador += 3; //incrementa de tres en tres
			// contador ++; //incrementa en 1 el contador

		}
		System.out.println("Total=" + total);
	}

}

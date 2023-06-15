
public class EjemploCondicionales4 {
	public static void main(String[] args) {
		System.out.println("Hello wordl");

		int edad = 15;
		int cantidadPersonas = 2;

		boolean esPareja = cantidadPersonas > 1;
		boolean puedeEntrar = edad >= 18 && esPareja;

		if (puedeEntrar) { // ambas condiciones deben cumplirse
			System.out.println("Usted puede entrar");
		} else {
			System.out.println("Usted no puede entrar");
		}
	}

}

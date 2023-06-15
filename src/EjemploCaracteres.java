
public class EjemploCaracteres {
	public static void main(String[] args) {
		char caracter = 'a';
		System.out.println(caracter); //Soporta un solo caracter
		
		caracter = 65;
		System.out.println(caracter);
		
		caracter = 65 + 1;
		System.out.println(caracter);
		
		char segundoCaracter = (char) (caracter+1);
		System.out.println(segundoCaracter);
		
		String palabra = "Alura Cursos online";
		System.out.println(palabra);
		
		palabra = palabra + " 2020";
		System.out.println(palabra);
	}

}

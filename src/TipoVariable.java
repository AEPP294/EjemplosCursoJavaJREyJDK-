
public class TipoVariable {

	public static void main(String[] args) {
		
		System.out.println("Hola Mundo!!!!!"); //imprime caracteres
		int edad = 28;                         //define la variable como entera
		System.out.println(edad);
		edad = 47; 
		System.out.println(edad);
		edad = 46+8;
		System.out.println("Mi edad es " + edad);
		
		double salario = 1250.50;          //define la variable de tipo double    
		System.out.println("Salario= " + salario);
		
		double salarioMitad = salario / 2;
		System.out.println("Salario= " + salarioMitad);
		
		double variable1 = 230.89;            //cast  
		int variable1Entero = (int)variable1; //convierte de double a entero
		System.out.println(variable1Entero);
				
		long prueba = 122222222222222222L;     //con int no se puede asignar un valor mayor a 2^31
		//se debe colocar L al final para especificarle al compilador el tipo de numero
		
		short numeroPequeno = 13555;
		
		byte numeroAunMasPequeno = 15;
		
		float numeroDecimalPequeno = 2.5F;
		//se agrega F al final para espcificar al compilador que un tipo float
		
		
		
		
	}

}

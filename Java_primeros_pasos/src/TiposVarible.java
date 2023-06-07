
public class TiposVarible {
	public static void main(String[] args) {
		// This variable is type INT
		int edad = 20;
		
		System.out.println("Usted tiene " + edad + " años");
		
		// sum of variables
		int a = 10;
		int b = 10;
		
		int c = a + b;
		
		
		System.out.println("La suma: "+a +" + "+ b +" = "+c);
		
		
		// This variables is type double
		double salary = 1000000.00; // create variable double type. name salary = 1000000.00
		System.out.println("Tu salario es de: " + salary);
		
		// multiplication of variables
		// sum of variables
		double a_mul = 500.50;
		double b_mul = 10;
				
		double c_mul = a_mul * b_mul;
		System.out.println("Tu salario es de: " + c_mul);
		
		//convert data type
		double variable1 = 50.50;
		int convertVarible = (int) variable1; // we specify the data type that we want convert
		System.out.println("\nvariable was convert "+convertVarible);
	}
}


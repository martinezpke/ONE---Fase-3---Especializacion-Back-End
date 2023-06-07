
public class puntos {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			
			for(int j = 0; j <= 10; j++) {
				if (i < j) {
					break;
				}
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
		
		 for (int i = 1; i < 100; i++ ){
	            if (i % 3 == 0)    {
	                System.out.println(i);
	            }
	        }
		 
		 int factorial = 1;
	        for (int i = 1; i < 11; i++) {
	            factorial *= i;
	            System.out.println("Factorial de " + i + " = " + factorial);
	        }
	}
}

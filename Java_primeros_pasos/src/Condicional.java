
public class Condicional {
	public static void main(String[] args) {
		int a = 15;
		if (a > 10) {
			System.out.println("si es mayor");
		}else {
			System.out.println("no es mayor");
		}
		
		
		// ---------------------------------------------------------------------------------------------------------------------
		
		
		System.out.println("probando condicionales");

        int edad = 20;
        int cantidadPersonas = 3;
		
		
		if (edad >= 18) {
            System.out.println("Tienes más de 18 años");
            System.out.println("Bienvenido ");
        } else {
            if (cantidadPersonas >= 2) {
                System.out.println("No tienes 18 años, pero puedes ingresar, porque estás acompañado");
            } else {
                System.out.println("Lamentablemente no puedes ingresar");
            }
        }
	}
}


public class Flujo {

  public static void main(String[] args) {
    System.out.println("Inicio do main");
    try {
		metodo1();
	} catch (Exception e) {
		e.printStackTrace();
	}
    System.out.println("Fin de main");
  }
  
  public static void metodo1() throws MiExcepcion{
    System.out.println("Inicio do metodo1");
    metodo2();
    System.out.println("Fin de metodo1");
  }
  public static void metodo2() throws MiExcepcion{
    System.out.println("Inicio de metodo2");
    throw new MiExcepcion("Mi excepcion fue lanzada");
  }
}

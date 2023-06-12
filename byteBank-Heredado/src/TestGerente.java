
public class TestGerente {
	 public static void main(String[] args) {
		Gerente kevin = new Gerente();
		kevin.setName("Kevin");
		kevin.setCC("1234567890");
		kevin.setSalario(1000);
		
		System.out.println(kevin.getName());
		System.out.println(kevin.getBonificacion());
	}
}

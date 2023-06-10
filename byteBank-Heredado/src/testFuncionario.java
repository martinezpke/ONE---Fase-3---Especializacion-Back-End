
public class testFuncionario {
	public static void main(String[] args) {
		Funcionario kevin = new Funcionario();
		kevin.setName("Kevin");
		kevin.setCC("1234567890");
		kevin.setSalario(1000);
		
		System.out.println(kevin.getName());
		System.out.println(kevin.Bonificacion());
	}
}
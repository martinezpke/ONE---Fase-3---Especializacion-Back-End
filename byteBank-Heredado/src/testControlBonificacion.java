
public class testControlBonificacion {
	public static void main(String[] args) {
		Funcionario kevin = new Contador();
		kevin.setName("Kevin");
		kevin.setSalario(1000);
		
		Gerente maria = new Gerente();
		maria.setName("maria");
		maria.setSalario(10000);
		 
		Contador carlos = new Contador();
		carlos.setName("carlos");
		carlos.setSalario(5000);
		
		 ControlBonificacion controlBonificacion = new ControlBonificacion();
		 
		 controlBonificacion.registrarSalario(kevin);
		 controlBonificacion.registrarSalario(maria);
		 controlBonificacion.registrarSalario(carlos);
	}
}

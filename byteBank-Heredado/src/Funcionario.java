
public class Funcionario {
	private String name; 
	private String CC;
	private double salario;
	
	public Funcionario() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCC() {
		return CC;
	}
	public void setCC(String cC) {
		CC = cC;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	public double Bonificacion() {
		return this.salario*0.1;
	}
	
}

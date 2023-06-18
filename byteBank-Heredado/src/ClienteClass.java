
public class ClienteClass implements Autenticar{
	String name;
	String tel;
	String CC;
	String genero;
	private String contrasena;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getCC() {
		return CC;
	}
	public void setCC(String cC) {
		CC = cC;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	@Override
	public void setContraseña(String contrasena) {
		this.contrasena = contrasena;
		
	}

	@Override
	public boolean autenticar(String contrasena) {
		if (this.contrasena == contrasena) {
            return true;
        } else {
            return false;
        }
	}
	
	
}

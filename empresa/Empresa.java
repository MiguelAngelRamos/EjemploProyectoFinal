package empresa;

import java.util.List;

public class Empresa {
	private String nombre;
	private String giro;

	List<Departamento>departamento;
	
	public Empresa(String nombre, String giro) {
		this.nombre = nombre;
		this.giro = giro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGiro() {
		return giro;
	}

	public void setGiro(String giro) {
		this.giro = giro;
	}

	public List<Departamento> getDepartamento() {
		return departamento;
	}

	public void setDepartamento(List<Departamento> departamento) {
		this.departamento = departamento;
	}


}

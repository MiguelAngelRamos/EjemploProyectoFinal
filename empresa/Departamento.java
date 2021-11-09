package empresa;

import java.util.List;

public class Departamento {
	
	private String nombre;
	private List<String> cargos;
	
	public Departamento(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<String> getCargos() {
		return cargos;
	}

	public void setCargos(List<String> cargos) {
		this.cargos = cargos;
	}

	@Override
	public String toString() {
		return "Departamento [nombre=" + nombre + ", cargos=" + cargos + "]";
	}
	
	

}

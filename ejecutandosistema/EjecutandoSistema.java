package ejecutandosistema;

import java.util.ArrayList;
import java.util.List;

import empresa.Departamento;
import empresa.Empresa;

public class EjecutandoSistema {
	
	public static void main(String[] args) {
		
		Empresa empresa1 = new Empresa("ManzaApp", "Agropecuario");
		Empresa empresa2 = new Empresa("SolutionNet", "Manufacturero");
		
		Departamento dFinanzas = new Departamento("Finanzas");
		Departamento dMarketing = new Departamento("Marketing digital");
		
		// Creando cargos de finanzas
		List<String> cFinanzas = new ArrayList<String>();
		cFinanzas.add("Jefe de finanzas");
		cFinanzas.add("Ejecutivo de Caja");
		cFinanzas.add("Ejecutivo de Presupuesto");
		cFinanzas.add("Analista Financiero");
		
		List<String> cMarketing = new ArrayList<String>();
		cMarketing.add("Community Manager");
		cMarketing.add("Content Manager");
		cMarketing.add("Analista Web");
		cMarketing.add("Diseñador");
		cMarketing.add("Programador Web");
		
		// añadiendo cargos al deparamento Finanzas
		dFinanzas.setCargos(cFinanzas);
		
		// añadiendo cargos al departameto de Marketing
		dMarketing.setCargos(cMarketing);
		
		// Asignando departamento a la empresa
		
		List<Departamento> d = new ArrayList<>();
		d.add(dMarketing);
		d.add(dFinanzas);
		empresa1.setDepartamento(d);
		empresa2.setDepartamento(d);
		
		imprimir(empresa1);
		imprimir(empresa2);
		
	}
	
	public static void imprimir(Empresa e) {
		System.out.println("Nombre de la empresa: " + e.getNombre() + " Giro: " + e.getGiro()+ ", " + e.getDepartamento());
	}

}

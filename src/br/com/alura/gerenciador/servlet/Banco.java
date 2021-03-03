package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Empresa> empresas = new ArrayList<>();
	
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("Alura");
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Caelum");
		
		empresas.add(empresa);
		empresas.add(empresa2);
	}
	
	public void adicionar(Empresa empresa) {
		empresas.add(empresa);
	}

	public List<Empresa> getEmpresas(){
		return empresas;
	}
}

package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Empresa> empresas = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	static {
		Empresa empresa = new Empresa();
		empresa.setId(chaveSequencial++);
		empresa.setNome("Alura");
		Empresa empresa2 = new Empresa();
		empresa2.setId(chaveSequencial++);
		empresa2.setNome("Caelum");
		
		empresas.add(empresa);
		empresas.add(empresa2);
	}
	
	public void adicionarEmpresa(Empresa empresa) {
		empresa.setId(chaveSequencial++);
		empresas.add(empresa);
	}
	
	public void removerEmpresa(Integer id) {
		Empresa resultado = consultarEmpresa(id);
		if (resultado != null) {
			empresas.remove(resultado);
		}
	}

	public void alterarEmpresa(Integer id, Empresa empresa) {
		Empresa resultado = consultarEmpresa(id);
		if (resultado != null) {
			resultado.setDataAbertura(empresa.getDataAbertura());
			resultado.setNome(empresa.getNome());
		}
	}
	
	public List<Empresa> getEmpresas(){
		return empresas;
	}
	
	public Empresa consultarEmpresa(Integer id) {
		Empresa resultado = null;
		for (Empresa empresa: empresas) {
			if(empresa.getId().equals(id))
				resultado = empresa;
		}
		return resultado;
	}
}

package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

@WebServlet("/editaEmpresa")
public class EditaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paramId = request.getParameter("id");
		Integer id = Integer.parseInt(paramId);
		String nomeEmpresa = request.getParameter("nome");
		String dataEmpresa = request.getParameter("data");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dataAberturaEmpresa = null;
		
		try {
			dataAberturaEmpresa = sdf.parse(dataEmpresa);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(dataAberturaEmpresa);
		
		Banco banco = new Banco();
		banco.alterarEmpresa(id, empresa);
		
		response.sendRedirect("listaEmpresas");
	}

}

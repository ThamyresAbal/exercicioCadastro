package controle;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.Usuario;
public class AcessoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private List<Usuario>lista;
	
    public AcessoController() {
    	//instancia da lista
    	lista = new ArrayList<Usuario>();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		out.print(
				"<html>" + 
				"<head>" + 
				"<meta charset=\"ISO-8859-1\">" + 
				"<title>Relatório</title>" + 
				"</head>" + 
				"<body>" + 
				"	<form action='acesso.html'>" + 
				"		<input type='submit' value='Voltar'>" + 
				"		<hr>");
		
		for (Usuario usuario : lista) {
			out.println("<h3>"+usuario.toString()+"</h3>");
		}
		
		out.print(
				"	</form>" + 
				"</body>" + 
				"</html>"
			);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		Usuario usuario =  new Usuario(
			request.getParameter("nome"),
			request.getParameter("email"),
			request.getParameter("senha")
			);
		out.println(usuario.toString());
		
		
		lista.add(usuario);
		
		//chama a proxima tela
		request.getRequestDispatcher("finaliza.html").forward(request, response);
	}

}

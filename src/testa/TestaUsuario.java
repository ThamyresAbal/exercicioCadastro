package testa;

import negocio.Usuario;

public class TestaUsuario {

	public static void main(String[] args) {

		Usuario usuario =  new Usuario("joao","suihaushua@jjsduayydg.com","7673512465");
		//não precisa chamar os atributos pq eles sao preenchidos como parâmetros da instancia
		System.out.println(usuario.toString());
	}

}

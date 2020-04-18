package negocio;

public class Usuario {
	private String nome;
	private String email;
	private String senha;
	private String nomeDaMae;
	private String nomeDoPai;
	private String dataNascimento;
	private String nacionalidade;
	private String naturalidade;
	private String sexo;
	private String estadoCivil;
	
	public Usuario(String nome, String email, String senha) {
		this.setNome(nome);
		this.setEmail(email);
		this.setSenha(senha);
	}


	@Override
	public String toString() {
		return String.format(
				"%s"
				+ " %s"
				+ " %s", 
				this.getNome(),
				this.getEmail(),
				this.getSenha()
				);
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getNomeDaMae() {
		return nomeDaMae;
	}


	public void setNomeDaMae(String nomeDaMae) {
		this.nomeDaMae = nomeDaMae;
	}


	public String getNomeDoPai() {
		return nomeDoPai;
	}


	public void setNomeDoPai(String nomeDoPai) {
		this.nomeDoPai= nomeDoPai;
	}


	public String getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public String getNacionalidade() {
		return nacionalidade;
	}


	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}


	public String getNaturalidade() {
		return naturalidade;
	}


	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public String getEstadoCivil() {
		return estadoCivil;
	}


	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	

}

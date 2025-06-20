package testes;

public class Usuario extends TipoUsuario {

	private String nome;
	private String cpf;
	private String numCel;
	private String endereco;
	private String login;
	private int senha;
	
	public Usuario(Veiculo veiculo, Vaga vagaDisponivel) {
		super(veiculo, vagaDisponivel);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNumCel() {
		return numCel;
	}

	public void setNumCel(String numCel) {
		this.numCel = numCel;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", cpf=" + cpf + ", numCel=" + numCel + ", endereco=" + endereco + ", login="
				+ login + ", senha=" + senha + "]";
	}
		
	
	
	
}
package entities;

public class Pessoa {
	
	private String nome;
	private int idade;
	private String email;
	
	public Pessoa(String nome, int idade, String email) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setEmail(email);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome.equals(null)) {
			throw new IllegalArgumentException("Usuário precisa de um nome!");
		}
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if(idade < 18) {
			throw new IllegalArgumentException("Usuário precisa ser maior que 18 anos!");
		}
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if(email.equals(null)) {
			throw new IllegalArgumentException("É necessário ter um email!");
		}
		this.email = email;
	}
	
	public String toString() {
		return getNome() + " - " + getIdade() + " anos - " + getEmail() + "\n";
	}

}

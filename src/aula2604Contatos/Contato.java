package aula2604Contatos;

public class Contato {
	
	private String nome; //ISSO É UM ATRIVUTO
	private String telefone; //pq usamos o private
	
	//criou o contato, e tem que passar  obrigatoriamente o nome e o telefone
	
	public Contato(String nome, String telefone){ //constrtutor PARAMERIZADO
		
		this.nome = nome;
		this.telefone = telefone;
		
	}

	public String getNome() {
		return nome;
	}
	

	public void setNome(String nome) { //getters and setters
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}



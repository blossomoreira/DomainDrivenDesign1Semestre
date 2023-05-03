package listaExercicios1_1;

public class Exer2Aleuno {
	
	private String nome;
	private char periodo;
	
	public Exer2Aleuno(String nome, char periodo) {
		super();
		this.nome = nome;
		this.periodo = periodo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getPeriodo() {
		return periodo;
	}

	public void setPeriodo(char periodo) {
		this.periodo = periodo;
	}
	
	public char naopode() {
		if (periodo == 'M') {
			System.out.println("voce nao pode");
		}
		return periodo;
	}
	
	
}	

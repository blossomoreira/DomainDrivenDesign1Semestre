package aula2604Contatos;

public class TesteAgenda {

	public static void main(String[] args) {
		GerenciadordeContatos gc = new GerenciadordeContatos(3);
		
		Contato[] contatos = gc.adicionar();
		gc.mostrarContatos();	
		
	}
}
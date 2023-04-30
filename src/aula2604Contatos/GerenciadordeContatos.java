package aula2604Contatos;

import java.util.Scanner;

public class GerenciadordeContatos {
	
	//declaramos o array 
	
	// um array de contatos
	
		private Contato[] agenda; //declaramos a agenda //aqui dentro temos vários obejtos do tipo contato
		
		public GerenciadordeContatos(int tamanho){ //construtor é responsavel por criar/instaciar essa lista/vetor
			System.out.println("A lista for criada com " + tamanho + "elementos");
			System.out.println("===================");
			//array list é uma lista dinamica
			//precisamos estipular um tamanaho antes da criação da agenda
			
			agenda = new Contato [tamanho]; //aqui estamos alocando a memoria dentro do construtor
			
		}
		public Contato criarContato() { //vai pedir o numero e telefone, ai colocamos no objetos e assim colocamos na lista // isso aqui é um método.
			System.out.println("Criando um contato *--*");
			System.out.println("===================");
			Scanner input = new Scanner(System.in);
			
			//Entrada usuário
			
			System.out.println("nome: ");
			String nome = input.next();
			System.out.println("telefone: ");
			String telefone = input.next();
			
			Contato contato = new Contato(nome, telefone);
			return contato;
		
			
	
		}
	}



package aula12ArraysExercicios;

import java.util.Scanner;

public class Exer4 {
	
	public int TamanhoVetor() {
		System.out.println("TAMANHO DO VETOR");
		Scanner scan = new Scanner(System.in);
		int tamanho = scan.nextInt();
		return tamanho; //não esquecer de retornar a var já que vamos usar elas em outros lugares  
	}
	
	public int [] CriaVetor(int tamanho) {
		int [] vetor = new int [tamanho]; // criamos o vetor e falamos que ele recebe o int ( não entendi mt bem também
		return vetor; //retornamos para poder usar na hora d epopualr
		}
	public int [] PopulandoVetor(int [] vetor) {
		Scanner scan = new Scanner(System.in);
		for (int i=0; i<vetor.length; i++) {
			vetor[i] = scan.nextInt();
			
		}
		return vetor; // pq tiramos do parametro?????????
	}
		
	public int SomandoTudo(int [] vetor) {
		int soma = 0;
		for (int i=0; i<vetor.length; i++) {
			soma = soma + vetor[i];
			System.out.println(soma);	
		}
		System.out.println(soma);
		return soma;
	}
	
	public int MaiorMenor(int [] vetor) {
		
		int menor = vetor[0];//colocar o 0 pq e o indice
		int maior = vetor[0];
		
		for (int ii=0; ii<vetor.length; ii++) {
			if (vetor[ii]<menor) {
				System.out.println("MENOR");
				menor = vetor[ii];
			}
			if (vetor[ii]> maior) {
				System.out.println("MAIOR");
				maior = vetor[ii];
			}
			System.out.println(maior + menor);
		}
		return menor;
	}
	

}

package aula12ArraysExercicios;

import java.util.Scanner;

public class Exer2 {
	

	public int TamanhoDoVetor() {
		Scanner scan = new Scanner(System.in);
		System.out.println("*--* CRIANDO O VETOR *--*");
		System.out.println("Qual tamanho do vetor? ");
		int tamanho = scan.nextInt();
		return tamanho;
	}
	
	public int [] CriaVetor(int TamanhoDoVetor) { //colocamos o [] na hr de criar o método
		int vetor [] = new int [TamanhoDoVetor];
		return vetor;
	}
	
	public int [] PopulandoVetor(int [] vetor) {
		Scanner scan = new Scanner(System.in);
		for (int i=0; i<vetor.length; i++) {
			vetor[i] = scan.nextInt();
			
		}
		return vetor;
		
	}
}

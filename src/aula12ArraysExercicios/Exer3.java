package aula12ArraysExercicios;

import java.util.Scanner;

public class Exer3 {

	public int TamanhoVetor() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual tamanho do vetor? ");
		int tamanho = scan.nextInt();
		return tamanho;
	}
	public int [] CriandoVetor(int TamanhoVetor) {
		int [] vetor = new int [TamanhoVetor]; //falomos que recebe a var tamanho
		return vetor;
	}
	
	public int [] PopulandoVetor (int [] vetor) {
		Scanner scan = new Scanner(System.in);
		for (int i=0; i<vetor.length; i++) {
			System.out.println("Quais os elementos do vetor? ");
			vetor[i] = scan.nextInt(); //não esquecer o [i]
		}
		return vetor;
		
	}
	
	public int [] CriandoTerceiro (int [] vetorTerceiro) {
		for (int i=0; i<tamanhoprincipal; i++) {
			int [] vetor33 = vetor33 + vetor2[i];
		
	}
	
}

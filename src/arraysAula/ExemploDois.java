package arraysAula;

import java.util.Scanner;

public class ExemploDois {

	public class vetor2 {

		public int tamanhoVetor(){
			Scanner input = new Scanner(System.in);
			System.out.println("*-* TAMANHO DO VETOR *-*");
			System.out.println("Tamanho: ");
			int t = input.nextInt();
			return t;
		}
		
		public int[] criaVetor(int t){ //criando um vetor
			int[] vetor = new int[t];
			return vetor;
		}
		
		public int[] populaVetor(int[] v){
			System.out.println("*-* popula vetor");
			Scanner input = new Scanner (System.in);
			for (int i=0; i < v.length ; i++){
				System.out.printf("Vetor [%d]: \n", i);
				v[i] = input.nextInt();
				
			}
			return v;
	}
	
	
	
	


}	
	
	
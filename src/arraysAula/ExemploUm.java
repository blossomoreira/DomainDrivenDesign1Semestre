package arraysAula;
2
import java.util.Scanner;

public class ExemploUm {
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		//O array em java é homogenio. Ele é limitado. Um array só pode ter tido um tipo de dado.
		// Ele é estático
		//String já é um array de objetos.
		//i = linha
		//j = coluna
			// array (geral) array list
		
		int[] vetor = new int [5]; // já define que é estrutura de daods
		
		for(int i = 0; i< 5; i++){	
			System.out.printf("Vetor[%d]: \n ", i);
			vetor[i] = input.nextInt();
			
		}
		
		for(int i=0; i<5;i++){
			System.out.println(vetor[i]);
		}
		
		System.out.println(vetor[1]);
		
		
		

	}

}


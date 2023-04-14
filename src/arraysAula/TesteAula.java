package arraysAula;

import java.util.Scanner;

public class TesteAula {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);  //aqui criamos um Scanner
		
		
		
		
		
		
		
		
		int[] listaNumeros = new int [5];  //aqui criamos o array e atribuimos o valor de 5 a ele
		
		for(int i = 0; i< 5; i++){  //falamos que o i vai rodar até ser menor que 5 e irá ir adicionando 1
			System.out.printf("A minha lista de numeros [%d] vai receber", i); 
			listaNumeros[i] = input.nextInt(); //aqui colocamos os números dentro das listas
			
		}
			
			
			
		for (int i = 0; i<5; i++) {
			System.out.println(listaNumeros[i]);
				
		}
			
		System.out.println(listaNumeros[1]);
			
		
		
		
		
		
	}

}

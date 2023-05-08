package aula12ArraysExercicios;

import java.util.Scanner;

public class Exer1 {
	
    public int TamanhoVetor(){
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Qual o tamanho do vetor? ");
    	int tamanho = scan.nextInt();
    	return tamanho;
    }
    
    
    public int [] CriarVetor(int TamanhoVetor){
        int [] vetor = new int [TamanhoVetor];
        return vetor;
    }
    
    
    public int [] PopularVetor(int[] vetor) {
    	Scanner scan = new Scanner(System.in);
    	for(int i=0; i<vetor.length; i++){
    		System.out.printf("Qual os valores do vetor");
    			vetor[i] = scan.nextInt();
    		}
    	System.out.println(vetor.length);
    	return vetor;
    }
	}    


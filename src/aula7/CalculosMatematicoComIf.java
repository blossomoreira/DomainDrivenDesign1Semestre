package aula7;

import java.util.Scanner;

public class CalculosMatematicoComIf {

	public static void main(String[] args) {


		int mediaPassar = 9;
		int nota1 = 9;
		int nota2 = 6;
		int nota3 = 9;
		int media = (nota1+nota2+nota3)/3;
		
		
		System.out.println(media);
		
		if(media <= mediaPassar){
			System.out.println("Reprovado");
			
		}else {
			System.out.println("Aprovado");
		}
		
		
		

	}

}

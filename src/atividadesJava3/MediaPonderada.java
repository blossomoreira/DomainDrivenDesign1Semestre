package atividadesJava3;

import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float Nota1, Nota2, MediaPonderada;
		
		System.out.println("Digite a nota 1");
		Nota1 = input.nextFloat();
		
		System.out.println("Digite a nota 2");
		Nota2 = input.nextFloat();
		
		
		MediaPonderada =  ((Nota1*6)+(Nota2*4)) /2;
		
		System.out.println(MediaPonderada);

	}

}

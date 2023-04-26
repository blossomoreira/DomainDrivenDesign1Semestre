package atividadesJava3;

import java.util.Scanner;

public class Dobronumero {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int Numero;
		int Dobro;
		
		System.out.println("Dobro do numero: ");
		Numero = input.nextInt();
		
		Dobro = Numero * 2;
		
		System.out.println(Dobro);

	}

}

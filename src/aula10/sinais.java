package aula10;

import java.util.Scanner;

public class sinais {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int num = input.nextInt();
		int num2 = input.nextInt();
		
		if(num > num2) {
			int soma = (num+num2);
			System.out.println(soma);
			
		} else {
			int sub = (num-num2);
			System.out.println(sub);
		}
		

	}

}

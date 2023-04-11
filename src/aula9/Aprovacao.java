package aula9;

public class Aprovacao {
	public static void main(String[] args) {
		
		double nota1 = 1.6; 
		double nota2 = 5.9;
		double nota3 = 9.9;
		double media = 6;
		
		double mediaAluno = (nota1 + nota2 + nota3)/3;
		
		if(mediaAluno < media) {
			
			System.out.println("Reprovado com média: " + media);
			
		}else {
			System.out.println("Aprovado com média: " + media);
		}
		
	}

}

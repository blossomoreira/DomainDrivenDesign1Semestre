package vetorAula;

public class Exemplo {

	public static void main(String[] args) {
		
		int[] vetor = new int[5];
		
		for (int i = 0; i<5; i++) { //usamos length quando não sabemos o tamanho do vetor
			vetor[i] = i+1;
			
		}
		
		for (int i=0; i<5; i++) {
			System.out.printf("vetor [%d]: %d", i, vetor[i]);
		}
		
		
	}

}

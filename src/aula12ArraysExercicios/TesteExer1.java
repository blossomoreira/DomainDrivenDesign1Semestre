package aula12ArraysExercicios;

public class TesteExer1 {

	public static void main(String[] args) {
		
		Exer1 Testes =  new Exer1();
		
		int tamanho = Testes.TamanhoVetor();
		int [] vetor = Testes.CriarVetor(tamanho);
		vetor = Testes.PopularVetor(vetor);
        System.out.println("Vetor");
        
        for (int i = 0; i < vetor.length; i++) {
        System.out.print(vetor[i] + " ");
		
        }
	
		

	}
}

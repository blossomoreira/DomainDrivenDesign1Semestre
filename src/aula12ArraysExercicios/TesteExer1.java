package aula12ArraysExercicios;

public class TesteExer1 {

	public static void main(String[] args) {
		Exer1 Testes =  new Exer1(); //criando vetor
		
		int tamanho = Testes.TamanhoVetor(); //criando var para receber o método
		int [] vetor = Testes.CriarVetor(tamanho); //criando vetor para receber tamanho
		vetor = Testes.PopularVetor(vetor); //populando vetor 
		
		
        System.out.println("Vetor");
        for (int i = 0; i < vetor.length; i++) {
        System.out.print(vetor[i] + " ");
        }
	}
}

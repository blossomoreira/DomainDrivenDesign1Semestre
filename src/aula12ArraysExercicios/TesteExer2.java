package aula12ArraysExercicios;

public class TesteExer2 {

	public static void main(String[] args) {
		Exer2 vetor11 = new Exer2();
		
		int tamanho1 = vetor11.TamanhoDoVetor();
		int [] vetor1 = vetor11.CriaVetor(tamanho1); //recebe a var com método
		vetor1 = vetor11.PopulandoVetor(vetor1);
		
		Exer2 vetor22 = new Exer2();
		int tamanho2 = vetor22.TamanhoDoVetor();
		int [] vetor2 = vetor22.CriaVetor(tamanho2);
		vetor2 = vetor22.PopulandoVetor(vetor2);

		Exer2 vetor3 = new Exer2();
		int tamanho3 = vetor3.TamanhoDoVetor();
		int [] vetor33 = vetor3.CriaVetor(tamanho3);
		for (int i=0; i<vetor2.length; i++) {
			System.out.println(vetor33[i]);
		}
		
		

	}

}

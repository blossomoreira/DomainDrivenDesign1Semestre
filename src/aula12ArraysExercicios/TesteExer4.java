package aula12ArraysExercicios;

public class TesteExer4 {

	public static void main(String[] args) {
		 Exer4 vetor1 = new Exer4();
		  int tamanho1 = vetor1.TamanhoVetor();
		  int [] vetor11 = vetor1.CriaVetor(tamanho1);
		  vetor11 = vetor1.PopulandoVetor(vetor11);
		  for (int i=0; i<vetor11.length; i++) {
			  System.out.println(vetor11[i]);
			  int Somaveyr = vetor1.SomandoTudo(vetor11);
		  }
		  int maiormenoz = vetor1.MaiorMenor(vetor11);
		  System.out.println(vetor1);
		  

	}

}

package listaExercicios1_1;

public class Exer_1pessoa_teste {

	public static void main(String[] args) {
		
		Exer1pessoa fernando = new Exer1pessoa("Diogo", 21, "NB");
		
		System.out.println(fernando.getNome() + fernando.getSexo() + fernando.getIdade());
	}

}

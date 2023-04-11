package aula8;

public class Pipe {

	public static void main(String[] args) {
		
		int idadeDele = 1;
		boolean emancipado = true;
		int idadePermitida = 18;
		
		
		if(idadeDele >= idadePermitida || emancipado) {
			System.out.println("Pode tirar carta");  
			
		} else{
			System.out.println("Não pode tirar carta");
		}
		
	}

}
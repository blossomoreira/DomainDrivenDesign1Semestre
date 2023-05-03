package bytebank;

public class CriarCliente {
	
	

	public static void main(String[] args) {

		Cliente danilo = new Cliente();
		Conta ContadeDanilo = new Conta();
		
		danilo.setNome("Danilo");
		danilo.setCpf("5555");
		ContadeDanilo.setTitular(danilo);
		
		System.out.println(ContadeDanilo.getTitular().getNome());
		
		
		
	}

}

package bytebank;

public class Conta {
	
	
	
	
	private double saldo; //atributos
	private int agencia;
	private int numero;
	private Cliente titular;
	

	public Conta() {
		
		if (numero <= 0) {
			System.out.println("NAO PODE");
		}else
			System.out.println("Pode");
	}	

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	
	
	public void depositar(double valor) {
		saldo+=valor;
	}
	
	public boolean saca(double valor) {
		
		if (this.saldo >= valor) { //se o valor da conta que estamos colocando
			this.saldo-=valor;
			return true;
		} else {
			return false;
		}
	}
	 public boolean transfere(double valor, Conta destino) {
		 if (this.saldo >= valor) {
			 this.saldo-=valor;
			 destino.depositar(valor);
			 return true;
			 
		 }
			 return false;
		 }

	 }


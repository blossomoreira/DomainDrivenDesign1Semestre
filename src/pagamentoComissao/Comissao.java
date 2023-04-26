package pagamentoComissao;

import java.util.Scanner;

public class Comissao {
	
	public static void main(String[] args) {
	
	
	Scanner input = new Scanner (System.in);
	
	float PrecoUnidade;
	int CodigoPeca, IdentificadorPeca, QuantidadeVendida, IdentificadorVendedor;
	double Comissao;
	
	System.out.println("Qual preço da unidade? ");
	PrecoUnidade = input.nextFloat();
	System.out.println("Qual o código da peça? ");
	CodigoPeca = input.nextInt();
	System.out.println("Quantas peças foram vendidas? ");
	QuantidadeVendida = input.nextInt();
	System.out.println("Qual código do vendedor? ");
	IdentificadorVendedor = input.nextInt();	
	
	Comissao = (PrecoUnidade * QuantidadeVendida + (100/5));
	
	
	System.out.println(Comissao);
	
	
	
	
	
	
	}
}

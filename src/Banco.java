import java.util.Scanner;

public class Banco {

		
	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente("30527107883","Edson Fernandes",123,12345,6,0.0);
		Scanner teclado = new Scanner(System.in);
		int opcao;
		double valor;
		
		do {
			System.out.println("Seja bem vindo");
			System.out.println("1 = Depositar / 2 = Sacar / 3 = Extrato / -1 = Sair");
			opcao = teclado.nextInt();
			switch (opcao) {
			
			case 1: //Depositar
				valor = teclado.nextDouble();
				conta.depositar(valor);
				break;
			case 2: //Sacar
				valor = teclado.nextDouble();
				conta.sacar(valor);
				break;
			case 3: //Extrato
				System.out.println("------------");
				System.out.println("--EXTRATO--");
				System.out.println("------------");
				System.out.println("Ag = " + conta.getAgencia());
				System.out.println("Conta = " + conta.getConta());
				System.out.println("Cliente = " + conta.getNome());
				System.out.println("Saldo = " + conta.getSaldo());
				break;
			case -1: //Sair
				System.out.println("**** Obrigado pela preferencia");
				break;
			default:
				System.out.println("opcao invalida");
				break;
			}
			
		}while (opcao != -1);
		
	}
	
}

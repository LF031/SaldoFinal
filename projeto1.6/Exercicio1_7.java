import java.util.*;
public class Exercicio1_7 {

	public static void main(String[] args) {
		//1 - variaveis
		float vlrDepositado;
		float vlrCheque1;
		float vlrCheque2;
		float saldoFinal;
		Scanner leia = new Scanner(System.in);
		
		// 2- entrada de dados
		System.out.println("Digite o valor depositado: ");
		vlrDepositado = leia.nextFloat();
		
		System.out.println("Digite o valor do primeiro cheque: ");
		vlrCheque1 = leia.nextFloat();
		
		System.out.println("Digite o valor do segundo cheque: ");
		vlrCheque2 = leia.nextFloat();
		
		// 3 - calculo
		saldoFinal = vlrDepositado - vlrCheque1 - vlrCheque2 - (0.02f / 100 * vlrCheque1) -
				((float)0.02 / 100 * vlrCheque2);
		
		// 4 - saida de dados
		System.out.println("Saldo final: " + saldoFinal);
		
		
	}

}

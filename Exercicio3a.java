import java.util.Scanner;

public class Exercicio3a {

	public static void main(String[] args) {
		// declaração das variáveis
		Scanner keyBoard = new Scanner(System.in);
		double a, b, c, x;
		
		// entrada de dados
		System.out.println("Informe o valor de a -->");
		a = keyBoard.nextDouble();
		System.out.print("Informe o valor de b -->");
		b = keyBoard.nextDouble();
		System.out.print("Informe o valor de C -->");
		c = keyBoard.nextDouble();
		
		// processamento de dados --> montagem da expressão
		x= (-b - b * b * b - 4 * a * c + 2 * a * a) / (2 * a / ((b+1) * (b+1)));
		
		//saída de dados
		System.out.println("x = " + x);
		
	}

}

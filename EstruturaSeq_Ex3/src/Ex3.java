import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		double num1, num2, soma;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Por favor digite o primeiro numero ");
		num1 = teclado.nextDouble();
		System.out.println("Por favor digite o segundo numero ");
		num2 = teclado.nextDouble();
		
		soma = num1 + num2;
		
		System.out.println("A soma dos dois números eh: " + soma);
		teclado.close();
	}

}

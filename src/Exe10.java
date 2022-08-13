// Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
// a. o produto do dobro do primeiro com metade do segundo .
// b. a soma do triplo do primeiro com o terceiro.
// c. o terceiro elevado ao cubo.
import java.util.Scanner;

public class Exe10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um número inteiro: ");
		int numInteiro1 = entrada.nextInt();
		
		System.out.print("Informe um número inteiro: ");
		int numInteiro2 = entrada.nextInt();
		
		System.out.print("Informe um número real: ");
		double numReal= entrada.nextDouble();
		
		System.out.println("Produto do dobro do primeiro com metade do segundo: " + (2 * numInteiro1) * (numInteiro2 / 2f));
		
		System.out.println("Soma do tripo do primeiro com o terceiro: " + (3 * numInteiro1 + numReal));
		
		System.out.println("Terceiro elevado ao cubo: " + Math.pow(numReal, 3));
		
		entrada.close();
	}

}

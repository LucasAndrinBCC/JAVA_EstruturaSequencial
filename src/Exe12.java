// Tendo como dado de entrada a altura, construa um algoritmo que calcule seu peso ideal,
// utilizando as seguintes fórmulas:
// Para homens: (72.7*h) - 58
// Para mulheres: (62.1*h) - 44.7 (h = altura)
import java.util.Scanner;

public class Exe12 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe sua altura: ");
		double altura = entrada.nextFloat();
		
		System.out.print("Informe seu sexo (M/F): ");
		entrada.nextLine();
		char sexo = entrada.nextLine().charAt(0);
		
		double pesoIdeal;
		
		if (sexo == "M".charAt(0)) {
			pesoIdeal = (72.7 * altura) - 58;
		} else {
			pesoIdeal = (62.1 * altura) - 44.7;
		}
		
		System.out.println("Peso Ideal: " + pesoIdeal);
		
		entrada.close();
	}
}

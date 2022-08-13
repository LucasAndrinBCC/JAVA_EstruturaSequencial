// Faça um Programa que peça a temperatura em graus Farenheit, transforme e mostre a
// temperatura em graus Celsius.
// C = (5 * (F-32) / 9) / C = (F – 32) / 1,8
import java.util.Scanner;

public class Exe9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a temperatura Farenheit: ");
		double f = entrada.nextDouble();
		
		double c = 5 * (f-32) / 9;
		
		System.out.println("Temperatura em Cº: " + c);
		
		entrada.close();
	}
	
}

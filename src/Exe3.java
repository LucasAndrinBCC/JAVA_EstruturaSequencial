// Faça um Programa que peça dois números e imprima a soma.
import java.util.Scanner;

public class Exe3 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um número inteiro: ");
		int num1 = entrada.nextInt();
		
		System.out.print("Informe um número inteiro: ");
		int num2 = entrada.nextInt();
		
		System.out.println("Soma: " + (num1 + num2));
		
		entrada.close();
	}
	
}

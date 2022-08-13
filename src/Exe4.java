// Faça um Programa que peça as 4 notas bimestrais e mostre a média.
import java.util.Scanner;

public class Exe4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe nota1: ");
		float nota1 = entrada.nextFloat();
		
		System.out.print("Informe nota2: ");
		float nota2 = entrada.nextFloat();
		
		System.out.print("Informe nota3: ");
		float nota3 = entrada.nextFloat();
		
		System.out.print("Informe nota4: ");
		float nota4 = entrada.nextFloat();
		
		System.out.println("Média final: " + (nota1 + nota2 + nota3 + nota4)/4);
		
		entrada.close();
	}
	
}

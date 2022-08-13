//Faça um Programa que converta metros para centímetros.
import java.util.Scanner;

public class Exe5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe metros: ");		
		float metros = entrada.nextFloat();
		
		float centimetros = metros * 100;
		
		System.out.println("Centímetros: " + centimetros);
		
		entrada.close();
	}
	
}

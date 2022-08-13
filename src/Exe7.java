//Faça um Programa que calcule e mostre a área de um quadrado.
import java.util.Scanner;

public class Exe7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o lado do quadrado: ");
		double lado = entrada.nextDouble();
		
		double area = lado * lado;
		
		System.out.println("Área do Quadrado: " + area);
		
		entrada.close();
	}

}

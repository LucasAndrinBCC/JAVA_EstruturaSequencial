// Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
import java.util.Scanner;

public class Exe6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o raio da circunferência: ");
		double raio = entrada.nextFloat();
		
		double area = Math.PI * (raio * raio);
		
		System.out.println("Área: " + area);
		
		entrada.close();
	}

}

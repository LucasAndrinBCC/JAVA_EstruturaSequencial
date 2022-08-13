//Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que
//calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) – 58.
import java.util.Scanner;

public class Exe11 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe sua altura: ");
		double altura = entrada.nextDouble();
		
		double pesoIdeal = (72.7 * altura) - 58;
		
		System.out.println("Peso ideal: " + pesoIdeal);
		
		entrada.close();
	}
}

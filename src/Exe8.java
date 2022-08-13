//Faça um Programa que pergunte quanto você ganha por hora e o número de horas
//trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
import java.util.Scanner;

public class Exe8 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe quando você ganha por hora: ");
		float sal = entrada.nextFloat();
		
		System.out.print("Informe quantas horas você trabalhou neste mês: ");
		float horasTrabalhadas = entrada.nextFloat();
		
		System.out.println("Salário: " + sal * horasTrabalhadas);
		
		entrada.close();
	}
	
}

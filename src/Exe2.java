// Faça um Programa que peça um número e então mostre a mensagem O número
// informado foi [número].
import java.util.Scanner;

public class Exe2 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um número inteiro: ");
		
		int num = entrada.nextInt();
		
		System.out.println("O número informado foi: " + num);
		
		entrada.close();
	}
	
}

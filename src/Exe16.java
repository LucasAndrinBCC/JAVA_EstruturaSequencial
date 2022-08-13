//Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em
//metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro
//para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam
//R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
//o Informe ao usuário as quantidades de tinta a serem compradas e os respectivos
//preços em 2 situações:
//o comprar apenas latas de 18 litros;
//o comprar apenas galões de 3,6 litros;

import java.util.Scanner;

public class Exe16 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe os metros quadrados a serem pintados: ");
		double area = entrada.nextDouble();
		
		int qtdLatas = (int) Math.ceil(area / 108);
		int qtdGaloes = (int) Math.ceil(area / 21.6);
		
		System.out.println(qtdLatas + " Latas: R$" + qtdLatas * 80f);
		System.out.println("OU");
		System.out.println(qtdGaloes + " Galões: R$" + qtdGaloes * 25f);
		
		
		entrada.close();
	}
	
}

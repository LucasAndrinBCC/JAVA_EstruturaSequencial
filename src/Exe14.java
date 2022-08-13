//Faça um Programa que pergunte quanto você ganha por hora e o número de horas
//trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se
//que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o
//sindicato, faça um programa que nos dê:
//a. salário bruto.
//b. quanto pagou ao INSS.
//c. quanto pagou ao sindicato.
//d. o salário líquido.
//e. calcule os descontos e o salário líquido, conforme a tabela abaixo:
//f. + Salário Bruto : R$
//g. - IR (11%) : R$
//h. - INSS (8%) : R$
//i. - Sindicato ( 5%) : R$
//j. = Salário Liquido : R$
//Obs.: Salário Bruto - Descontos = Salário Líquido.
import java.util.Scanner;

public class Exe14 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o seu salário por hora: ");
		double salHora = entrada.nextDouble();
		System.out.print("Informe o número de horas trabalhadas no mês: ");
		double horas = entrada.nextDouble();
		
		double salarioBruto = salHora * horas;
		double inss = salarioBruto * 0.08;
		double sindicato = salarioBruto * 0.05;
		double impostoRenda = salarioBruto * 0.11;
		
		System.out.println("Salário bruto: " + salarioBruto);
		System.out.println("INSS: " + inss);
		System.out.println("Sindicato: " + sindicato);
		System.out.println("Imposto de renda: " + impostoRenda);
		System.out.println("Salário líquido: " + (salarioBruto - inss - sindicato - impostoRenda));
		
		entrada.close();
	}
}

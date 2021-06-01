/*
Faça um algoritmo para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo. O último dado, que não entrará nos cálculos, contém o valor de idade negativa. Calcular e imprimir a idade média deste grupo de indivíduos.

Entrada
A entrada contém um número indeterminado de inteiros. A entrada será encerrada quando um valor negativo for lido.

Saída
A saída contém um valor correspondente à média de idade dos indivíduos.

A média deve ser impressa com dois dígitos após o ponto decimal.
 
*/
import java.io.IOException;
import java.util.Scanner;

public class  Desafio {
	
    public static void main(String[] args) throws IOException {
		int age;
		int totalNum = 0,totalAge = 0;
		float ageAverage;
		Scanner input =new Scanner(System.in);
		int i =1;
		while (((age = input.nextInt()) >= 0)) {
			totalAge += age;
			totalNum += i;
		}
		ageAverage = (float)((float)totalAge / (totalNum));
		System.out.printf("%.2f\n",ageAverage);
    }
	
}
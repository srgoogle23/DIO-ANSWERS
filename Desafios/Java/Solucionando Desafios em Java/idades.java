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
        Scanner ent = new Scanner(System.in);
        
        double num, soma = 0;
        int cont = 0;
        
        do{
            num = ent.nextDouble(); // usuario digita um número
            
            if(num >= 0){
                soma = num + soma; 
                cont++; 
            }
        } while(num >= 0);
        
        double media = soma / cont;
        
        System.out.println(String.format("%.2f", media));
    }
	
}
/*
Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara.
Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”,
caso haja uma divisão por 0 ou raiz de numero negativo.

Entrada
Leia três valores de ponto flutuante (double) A, B e C.

Saída
Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular".
Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo.
Imprima sempre o final de linha após cada mensagem.

R1 = -0.29788
R2 = -1.71212
 */

package uri;

import java.util.Scanner;

public class Ini1036 {

    public static void bhaskara(){

        //Aguarda uma nova informação no console
        Scanner i = new Scanner(System.in);

        //Lê a entrada do console e salva nas variáveis
        double A = i.nextDouble();
        double B = i.nextDouble();
        double C = i.nextDouble();

        //Executa o cálculo do valor de delta
        //Math.pow executa a potência quadrada de B
        double delta = Math.pow(B, 2) - (4 * A * C);

        if((A == 0) | (delta <= 0)){
            System.out.println("Impossivel calcular");
        }else{
            //Executa a lógica de bhaskara
            //Math.sqrt executa a raiz quadrada de delta
            double R1 = (- B + Math.sqrt(delta)) / (2 * A);
            double R2 = (- B - Math.sqrt(delta)) / (2 * A);

            //Imprime em tela o valor de R1 e R2 com 5 casas decimais
            System.out.printf("R1 = %.5f%n", R1);
            System.out.printf("R2 = %.5f%n", R2);
        }
    }
}

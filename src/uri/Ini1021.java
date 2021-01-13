/*
Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário.
A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto.
As notas consideradas são de 100, 50, 20, 10, 5, 2.
As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01.
A seguir mostre a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial,
conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal.
 */

package uri;

import java.util.Scanner;

public class Ini1021 {

    public static void notesCoins(){
        //Console aguarde alguma informação
        Scanner i = new Scanner(System.in);

        //Lê a próxima entrada informada no console
        double x = i.nextFloat();

        // % significa módulo, módulo é o resto da divisão de x por determinado valor
        System.out.println("NOTAS:");
        System.out.println((Math.abs(x) / 100) + " nota(s) de R$ 100,00");
        x = (Math.abs(x) % 100);
        System.out.println(x / 50 + " nota(s) de R$ 50,00");
        x = x % 50;
        System.out.println(x / 20 + " nota(s) de R$ 20,00");
        x = x % 20;
        System.out.println(x / 10 + " nota(s) de R$ 10,00");
        x = x % 10;
        System.out.println(x / 5 + " nota(s) de R$ 5,00");
        x = x % 5;
        System.out.println(x / 2 + " nota(s) de R$ 2,00");
        x = x % 2;
        System.out.println("MOEDAS:");
        System.out.println(x / 1 + " moeda(s) de R$ 1,00");
        x = x % 0.50;
        System.out.println(x / 0.50 + " moeda(s) de R$ 0,50");
        x = x % 0.25;
        System.out.println(x / 0.25 + " moeda(s) de R$ 0,20");
        x = x % 0.10;
        System.out.println(x / 0.10 + " moeda(s) de R$ 0,10");
        x = x % 0.05;
        System.out.println(x / 0.05 + " moeda(s) de R$ 0,05");
        x = x % 0.01;
        System.out.println(x / 0.01 + " moeda(s) de R$ 0,01");


    }
}



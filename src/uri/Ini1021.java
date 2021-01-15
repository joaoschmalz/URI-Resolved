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
        double value = i.nextDouble();
        int valueAux = 0;

        // % significa módulo, módulo é o resto da divisão de VALUE por determinado valor
        System.out.println("NOTAS:");
        valueAux = (int) value / 100;
        System.out.printf("%d nota(s) de R$ 100.00%n", valueAux);
        value = value % 100.0;

        valueAux = (int) value / 50;
        System.out.printf("%d nota(s) de R$ 50.00%n", valueAux);
        value = value % 50.0;

        valueAux = (int) value / 20;
        System.out.printf("%d nota(s) de R$ 20.00%n", valueAux);
        value = value % 20.0;

        valueAux = (int) value / 10;
        System.out.printf("%d nota(s) de R$ 10.00%n", valueAux);
        value = value % 10.0;

        valueAux = (int) value / 5;
        System.out.printf("%d nota(s) de R$ 5.00%n", valueAux);
        value = value % 5.0;

        valueAux = (int) value / 2;
        System.out.printf("%d nota(s) de R$ 2.00%n", valueAux);
        value = value % 2.0;

        //x100 para tratar internamente a moeda como nota e seguir com a mesma lógica anterior
        value = value * 100.0;

        System.out.println("MOEDAS:");
        valueAux = (int) value / 100;
        System.out.printf("%d moeda(s) de R$ 1.00%n", valueAux);
        value = value % 100.0;

        valueAux = (int) value / 50;
        System.out.printf("%d moeda(s) de R$ 0.50%n", valueAux);
        value = value % 50.0;

        valueAux = (int) value / 25;
        System.out.printf("%d moeda(s) de R$ 0.25%n", valueAux);
        value = value % 25.0;

        valueAux = (int) value / 10;
        System.out.printf("%d moeda(s) de R$ 0.10%n", valueAux);
        value = value % 10.0;

        valueAux = (int) value / 5;
        System.out.printf("%d moeda(s) de R$ 0.05%n", valueAux);
        value = value % 5.0;

        valueAux = (int) value;
        System.out.printf("%d moeda(s) de R$ 0.01%n", valueAux);
    }
}



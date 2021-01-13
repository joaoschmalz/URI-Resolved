/*
Faça um programa que leia três valores e apresente o maior dos três valores lidos
seguido da mensagem “eh o maior”. Utilize a fórmula:

MaiorAB= (a+b+abs(a-b))/2

Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b).
Um segundo passo, portanto é necessário para chegar no resultado esperado.

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
 */

package uri;

import java.util.Scanner;

public class Ini1013 {

    public static void bigger() {

        //Console aguarde alguma informação
        Scanner i = new Scanner(System.in);

        //Lê a próxima entrada informada no console
        int a = i.nextInt();
        int b = i.nextInt();
        int c = i.nextInt();

        int bigger = (a + b + Math.abs(a - b)) / 2;

        //Executa a lógica do maior
        bigger = (c + bigger + Math.abs(c - bigger)) / 2;

        System.out.println(bigger + " eh o maior");
    }

}

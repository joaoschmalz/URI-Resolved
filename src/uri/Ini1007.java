/*
Leia quatro valores inteiros A, B, C e D. A seguir,
calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

Entrada
O arquivo de entrada contém 4 valores inteiros.

Saída
Imprima a mensagem DIFERENCA com todas as letras maiúsculas,
conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade.
 */

package uri;

import java.util.Scanner;

public class Ini1007 {

    public static void dif() {

        //Console aguarde alguma informação
        Scanner i = new Scanner(System.in);

        //Lê a próxima entrada int informada no console
        int A = i.nextInt();
        int B = i.nextInt();
        int C = i.nextInt();
        int D = i.nextInt();

        //Executa a lógica da diferença
        int result = (A * B) - (C * D);

        System.out.println("DIFERENCA = " + result);
    }
}

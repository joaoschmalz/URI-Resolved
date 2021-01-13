/*
Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica,
e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.
 */

package uri;

import java.util.Scanner;

public class Ini1019 {

    public static void convert(){

        //Console aguarde alguma informação
        Scanner i = new Scanner(System.in);

        //Lê a próxima entrada informada no console
        int x = i.nextInt();

        int h, m,s;

        //H é igual ao resultado da divisão de X pela quantidade de segundos em 1 hora
        //M é igual ao resto da divisão de H dividido pela quantidade de segundos em 1 minuto
        //S é igual ao resto das duas divisões
        h = x / 3600;
        m = (x % 3600) / 60;
        s = (x % 3600) % 60;

        System.out.println(h+":"+m+":"+s);
    }
}

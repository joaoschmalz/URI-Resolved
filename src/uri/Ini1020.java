/*
Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

Obs.: apenas para facilitar o cálculo, considere o ano com 365 dias e o mês com 30 dias.
Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364.
Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

Entrada
O arquivo de entrada contém um valor inteiro.

Saída
Imprima a saída conforme exemplo fornecido.
 */

package uri;

import java.util.Scanner;

public class Ini1020 {

    public static void ageInDays(){

        //Console aguarde alguma informação
        Scanner i = new Scanner(System.in);

        //Lê a próxima entrada informada no console
        int x = i.nextInt();

        int y, m,d;

        //Y é igual ao resultado da divisão de X pela quantidade de dias no ano
        //M é igual ao resto da divisão de Y dividido pela quantidade de dias no mês
        //D é iagual ao resto das duas divisões
        y = x / 365;
        m = (x % 365) / 30;
        d = (x % 365) % 30;

        System.out.println(y + " ano(s)");
        System.out.println(m + " mes(es)");
        System.out.println(d + " dia(s)");

    }

}

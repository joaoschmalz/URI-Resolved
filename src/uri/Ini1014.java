/*
Calcule o consumo médio de um automóvel sendo fornecidos a distância
total percorrida (em Km) e o total de combustível gasto (em litros).

Entrada
O arquivo de entrada contém dois valores: um valor inteiro X representando a distância total percorrida (em Km),
e um valor real Y representando o total de combustível gasto, com um dígito após o ponto decimal.

Saída
Apresente o valor que representa o consumo médio do automóvel com 3 casas após a vírgula, seguido da mensagem "km/l".
 */

package uri;

import java.util.Scanner;

public class Ini1014 {

    public static void consumption() {

        //Console aguarde alguma informação
        Scanner i = new Scanner(System.in);

        //Lê a próxima entrada informada no console
        int X = i.nextInt();
        double Y = i.nextDouble();

        double average = X / Y;

        System.out.printf("%.3f km/l\n", average);
    }

}

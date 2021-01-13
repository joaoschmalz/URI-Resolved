/*
Faça um programa que calcule e mostre o volume de uma esfera sendo fornecido o valor de seu raio (R).
A fórmula para calcular o volume é: (4/3) * pi * R3. Considere (atribua) para pi o valor 3.14159.

Dica: Ao utilizar a fórmula, procure usar (4/3.0) ou (4.0/3), pois algumas linguagens (dentre elas o C++),
assumem que o resultado da divisão entre dois inteiros é outro inteiro.

Entrada
O arquivo de entrada contém um valor de ponto flutuante (dupla precisão), correspondente ao raio da esfera.

Saída
A saída deverá ser uma mensagem "VOLUME" conforme o exemplo fornecido abaixo,
com um espaço antes e um espaço depois da igualdade. O valor deverá ser apresentado com 3 casas após o ponto.
 */

package uri;

import java.util.Scanner;

public class Ini1011 {

    public static void sphere() {

        //Console aguarde alguma informação
        Scanner i = new Scanner(System.in);

        //Lê a próxima entrada informada no console
        double R = i.nextDouble();

        //Executa a lógica do volume -> Math.pow(R,3), = R³
        double volume = (4 / 3.0) * 3.14159 * Math.pow(R, 3);

        //Imprime em tela com 3 o resultado com 3 casas decimais
        System.out.printf("VOLUME = %.3f\n", volume);
    }

}

/*
Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano,
p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula, segundo a fórmula:

Distancia = Raiz de (x2 - x1)^2 + (y2 - y1)^2

Obs ^ significa potência.

Entrada
O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores de ponto flutuante:
x1 y1 e a segunda linha contém dois valores de ponto flutuante x2 y2.

Saída
Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas após o ponto decimal.
 */

package uri;

import java.util.Scanner;

public class Ini1015 {

    public static void dist() {

        //Console aguarde alguma informação
        Scanner i = new Scanner(System.in);

        int x = 4;

        //Lê a próxima entrada informada no console
        double x1 = i.nextDouble();
        double y1 = i.nextDouble();
        double x2 = i.nextDouble();
        double y2 = i.nextDouble();

        //Executa a lógica da distância
        double result = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));

        //Tira a raiz quadrada
        result = Math.sqrt(result);

        //Imprime com 4 casas decimais
        System.out.printf("%.4f\n", result);
    }

}

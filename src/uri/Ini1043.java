/*
Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo.
Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:

Perimetro = XX.X

Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem

Area = XX.X

Entrada
A entrada contém três valores reais.

Saída
O resultado deve ser apresentado com uma casa decimal.
 */

package uri;

import java.util.Scanner;

public class Ini1043 {

    public static void triangle(){

        //Console aguarda alguma informação
        Scanner i = new Scanner(System.in);

        //Lê a próxima entrada e guarda nas variáveis
        double A = i.nextDouble();
        double B = i.nextDouble();
        double C = i.nextDouble();

        //Verifica se os valores informados satisfazem a condição de existência de um triângulo
        //A condição é que a soma de 2 lados quaisquer seja maior que o lado que sobra
        if(A + B > C && B + C > A && A + C > B){
            double perimeter = A + B + C;
            System.out.printf("Perimetro = %.1f%n", perimeter);
        }else{
            double area = ((A + B)* C)/2;
            System.out.printf("Area = %.1f%n", area);
        }
    }
}

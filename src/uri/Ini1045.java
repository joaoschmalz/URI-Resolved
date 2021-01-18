/*
Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente,
de modo que o lado A representa o maior dos 3 lados.
A seguir, determine o tipo de triângulo que estes três lados formam,
com base nos seguintes casos, sempre escrevendo uma mensagem adequada:

se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
se A^2 = B^2 + C^2, apresente a mensagem: TRIANGULO RETANGULO
se A^2 > B^2 + C^2, apresente a mensagem: TRIANGULO OBTUSANGULO
se A^2 < B^2 + C^2, apresente a mensagem: TRIANGULO ACUTANGULO
se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES

Entrada
A entrada contem três valores de ponto flutuante de dupla precisão A (0 < A) , B (0 < B) e C (0 < C).

Saída
Imprima todas as classificações do triângulo especificado na entrada.
 */

package uri;

import java.util.Scanner;

public class Ini1045 {

    public static void triangleTypes(){

        //Console aguarda informção
        Scanner i = new Scanner(System.in);

        //Lê a informação e armazena em variável
        double A = i.nextDouble();
        double B = i.nextDouble();
        double C = i.nextDouble();
        double aux;

        //Coloca o maior valor na variável A
        if(B > A && B > C){
            aux = A;
            A = B;
            B = aux;
        }else if(C > A){
            aux = A;
            A = C;
            C = aux;
        }

        //Valida se forma triângulo
        //Se formar valida qual o tipo de triângulo formado
        if(A >= (B + C)){
            System.out.println("NAO FORMA TRIANGULO");
        }else{
            if(Math.pow(A,2) == Math.pow(B,2) + Math.pow(C,2)){
                System.out.println("TRIANGULO RETANGULO");
            }
            if(Math.pow(A,2) > Math.pow(B,2) + Math.pow(C,2)){
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if(Math.pow(A,2) < Math.pow(B,2) + Math.pow(C,2)){
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if(A == B && A == C){
                System.out.println("TRIANGULO EQUILATERO");
            }
            if((A == B && A != C) || (A == C && A != B) || (B == C && B != A)){
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}

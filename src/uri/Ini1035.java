/*
Leia 4 valores inteiros A, B, C e D.
A seguir, se B for maior do que C e se D for maior do que A,
e a soma de C com D for maior que a soma de A e B e se C e D, ambos, forem positivos
e se a variável A for par escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".

Entrada
Quatro números inteiros A, B, C e D.

Saída
Mostre a respectiva mensagem após a validação dos valores.
 */

package uri;

import java.util.Scanner;

public class Ini1035 {

    public static void selectionTest(){

        //Console aguarde alguma informação
        Scanner i = new Scanner(System.in);

        //Lê a próxima entrada informada no console
        int A = i.nextInt();
        int B = i.nextInt();
        int C = i.nextInt();
        int D = i.nextInt();

        //Valida se B maior que C e se ao mesmo tempo D maior que A
        if(B > C && D > A){
            //Valida se a soma de C e D maior que a soma de A e B
            if((C + D) > (A + B)){
                //Valida se C e D são valores positivos
                if(C > 0 && D > 0){
                    //Valida se A é um valor positivo
                    if(A % 2 == 0){
                        System.out.println("Valores aceitos");
                    }else{
                        System.out.println("Valores nao aceitos");
                    }
                }else{
                    System.out.println("Valores nao aceitos");
                }
            }else{
                System.out.println("Valores nao aceitos");
            }
        }else{
            System.out.println("Valores nao aceitos");
        }
    }

}

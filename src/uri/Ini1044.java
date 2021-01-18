/*
Leia 2 valores inteiros (A e B).
Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos",
indicando se os valores lidos são múltiplos entre si.

Entrada
A entrada contém valores inteiros.

Saída
A saída deve conter uma das mensagens conforme descrito acima.
 */

package uri;

import java.util.Scanner;

public class Ini1044 {

    public static void multiple(){

        //Console aguarda uma entrada
        Scanner i = new Scanner(System.in);

        //Lê a entrada e armazena nas variáveis
        int A = i.nextInt();
        int B = i.nextInt();

        //Verifica se o resto da divisão é 0 para um dos casos
        if(A % B == 0 | B % A == 0){
            System.out.println("Sao Multiplos");
        }else{
            System.out.println("Nao sao Multiplos");
        }
    }
}

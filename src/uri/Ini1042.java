/*
Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os valores em ordem crescente,
uma linha em branco e em seguida, os valores na sequência como foram lidos.

Entrada
A entrada contem três números inteiros.

Saída
Imprima a saída conforme foi especificado.
 */

package uri;

import java.util.Scanner;

public class Ini1042 {

    public static void sort(){

        //Console aguarda entrada de informações
        Scanner i = new Scanner(System.in);
        int N1 = i.nextInt();
        int N2 = i.nextInt();
        int N3 = i.nextInt();
        int smaller = 0;
        int middler = 0;
        int bigger = 0;

        //Verifica qual a ordem dos números
        if(N1 > N2 && N1 > N3) {
            bigger = N1;
            if (N2 > N3) {
                middler = N2;
                smaller = N3;
            } else {
                middler = N3;
                smaller = N2;
            }
        }
        if(N2 > N1 && N2 > N3){
            bigger = N2;
            if(N1 > N3){
                middler = N1;
                smaller = N3;
            }else{
                middler = N3;
                smaller = N1;
            }
        }
        if(N3 > N1 && N3 > N2){
            bigger = N3;
            if(N1 > N2){
                middler = N1;
                smaller = N2;
            }else {
                middler = N2;
                smaller = N1;
            }
        }

        System.out.println(smaller);
        System.out.println(middler);
        System.out.println(bigger + "\n");
        System.out.println(N1);
        System.out.println(N2);
        System.out.println(N3);
    }
}

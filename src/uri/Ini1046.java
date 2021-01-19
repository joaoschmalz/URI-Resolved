/*
Leia a hora inicial e a hora final de um jogo.
A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro,
tendo uma duração mínima de 1 hora e máxima de 24 horas.

Entrada
A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.

Saída
Apresente a duração do jogo conforme exemplo abaixo.
 */

package uri;

import java.util.Scanner;

public class Ini1046 {

    public static void gameTime(){

        //Console aguarda entrade de informação
        Scanner i = new Scanner(System.in);

        //Lê a entrada do console e armazena na variável
        int ini = i.nextInt();
        int end = i.nextInt();
        int time;

        //Excuta a validação do tempo de jogo
        if(ini > end){
            time = (24 - ini) + end;
            System.out.println("O JOGO DUROU "+ time +" HORA(S)");
        }else if(ini == end){
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }else if(end > ini){
            time = end - ini;
            System.out.println("O JOGO DUROU "+ time +" HORA(S)");
        }
    }
}

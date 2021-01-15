/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item.
A seguir, calcule e mostre o valor da conta a pagar.

COD | ESPECIFICAÇÃO   | PREÇO
 1  | Cachorro Quente | R$ 4.00
 2  | X-Salada        | R$ 4.50
 3  | X-Bacon         | R$ 5.00
 4  | Torrada Simples | R$ 2.00
 5  | Refrigerante    | R$ 1.50

Entrada
O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.

Saída
O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.
 */

package uri;

import java.util.Scanner;

public class Ini1038 {

    public static void snack(){

        //Console aguarda a entrada de informação
        Scanner i = new Scanner(System.in);

        //Lê a entrada do console e armazena na variável
        int cod = i.nextInt();
        int quant = i.nextInt();
        double price = 0;

        //Executa validação do código de produto informado e multiplica a quantidade pelo preço
        if(cod == 1){
            price = quant * 4;
        }else if(cod == 2){
            price = quant * 4.50;
        }else if(cod == 3){
            price = quant * 5;
        }else if(cod == 4){
            price = quant * 2;
        }else if(cod == 5){
            price = quant * 1.5;
        }

        //Imprime o resultado em tela com 2 casas decimais
        System.out.printf("Total: R$ %.2f%n", price);
    }
}

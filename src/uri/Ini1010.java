/*
Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

Entrada
O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores,
respectivamente dois inteiros e um valor com 2 casas decimais.

Saída
A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo,
lembrando de deixar um espaço após os dois pontos e um espaço após o "R$".
O valor deverá ser apresentado com 2 casas após o ponto.
 */
package uri;

import java.util.Scanner;

public class Ini1010 {

    public static void price() {

        //Console aguarde alguma informação
        Scanner i = new Scanner(System.in);

        //Lê a próxima entrada informada no console para o produto 1
        int cod = i.nextInt();
        int unit = i.nextInt();
        double price = i.nextDouble();

        //Executa a lógica do preço
        double total = (unit * price);

        //Lê a próxima entrada informada no console para o produto 2
        cod = i.nextInt();
        unit = i.nextInt();
        price = i.nextDouble();

        //Executa a lógica do preço e soma com o úlimo resultado do preço
        total += +(unit * price);

        //Imprime em tela o resultado com apenas 2 casas decimais
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
    }

}

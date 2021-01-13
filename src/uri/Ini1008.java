/*
Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora
e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

Entrada
O arquivo de entrada contém 2 números inteiros e 1 número com duas casas decimais, representando o número, quantidade
de horas trabalhadas e o valor que o funcionário recebe por hora trabalhada, respectivamente.

Saída
Imprima o número e o salário do funcionário, conforme exemplo fornecido, com um espaço em branco antes e depois da igualdade.
No caso do salário, também deve haver um espaço em branco após o $.
 */

package uri;

import java.util.Scanner;

public class Ini1008 {

    public static void salary() {

        //Console aguarde alguma informação
        Scanner i = new Scanner(System.in);

        //Lê a próxima entrada informada no console
        int employeeId = i.nextInt();
        int hours = i.nextInt();
        float workedHours = i.nextFloat();

        //Executa lógica do salário
        float salary = hours * workedHours;

        System.out.printf("NUMBER = %d\n", employeeId);
        System.out.printf("SALARY = U$ %.2f\n", salary);
    }
}

package uri;

import java.util.Scanner;

public class Teste {

    public static void teste(){

        Scanner i = new Scanner(System.in);

        //Lê a próxima entrada informada no console
        double value = i.nextDouble();
        int valueAux = 0;

        // % significa módulo, módulo é o resto da divisão de VALUE por determinado valor
        System.out.println("NOTAS:");
        valueAux = (int) value / 100;
        System.out.println(Math.abs(value) + " nota(s) de R$ 100,00%n");
        value = value % 100.0;
    }
}

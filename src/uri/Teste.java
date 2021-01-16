package uri;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Teste {

    public static void teste(){

        Scanner i = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        double N1 = i.nextDouble();
        double N2 = i.nextDouble();
        double N3 = i.nextDouble();
        double N4 = i.nextDouble();

        double average = ((N1*2) + (N2*3) + (N3*4) + (N4*1)) / 10;
        System.out.println("Media: " + df.format(average));

        if (average >= 7) {
            System.out.println("Aluno aprovado.");
        } else if (average < 7 && average >= 5) {
            System.out.println("Aluno em exame.");
            double NE = i.nextDouble();
            System.out.println("Nota do exame: " + df.format(NE));
            average = (average + NE) / 2;
            if (average >= 5) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.println("Media final: " + df.format(average));
        } else {
            System.out.println("Aluno reprovado.");
        }
    }
}

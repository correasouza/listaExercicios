package probAlunos;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String name = input.nextLine();
        System.out.println("Digite suas notas: ");
        double notaUm = input.nextDouble();
        double notaDois = input.nextDouble();
        double notaTres = input.nextDouble();

        student s = new student();
        s.name = name;
        s.notaUm = notaUm;
        s.notaDois = notaDois;
        s.notaTres = notaTres;

        System.out.printf("NOTA FINAL = %.2f %n", s.notaFinal());

        if (s.notaFinal() >= 60.00) {
            System.out.print("PASS");
        } else {
            System.out.printf("FAILED %n");
            System.out.printf("FALTARAM %.2f PONTOS", 60.00 - s.notaFinal());
        }

        input.close();
    }
}
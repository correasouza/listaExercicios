package probFuncionarios;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Nome: ");
        String name = input.nextLine();
        System.out.print("Salario bruto: ");
        double grossSalary = input.nextDouble();
        System.out.print("Imposto: ");
        double tax = input.nextDouble();

        employee e = new employee();
        e.name = name;
        e.grossSalary = grossSalary;
        e.tax = tax;

        System.out.println(e);

        System.out.print("Qual a porcentagem para aumentar o salario? ");
        double percentage = input.nextDouble();
        e.increaseSalary(percentage);

        System.out.println(e);



        input.close( );
    }
}
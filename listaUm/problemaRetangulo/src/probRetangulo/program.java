package probRetangulo;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Entre com a largura e altura do retângulo: ");
        double width = input.nextDouble();
        double height = input.nextDouble();

        valores v = new valores();
        v.height = height;
        v.width = width;

        System.out.printf("AREA = %.2f %n", v.area());
        System.out.printf("PERIMETRO = %.2f %n", v.perimeter());
        System.out.printf("DIAGONAL = %.2f", v.diagonal());


        input.close();
    }
}

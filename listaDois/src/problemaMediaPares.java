import java.util.Locale;
import java.util.Scanner;

public class problemaMediaPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int number = input.nextInt();

        int[] numbers = new int[number];

        double sum = 0.0;

        for (int i = 0; i < number; i++) {
            System.out.print("Digite um numero: ");
            numbers[i] = input.nextInt();
        }

        input.close();

        int cont = 0;

        for (int i = 0; i < number; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i]; cont++;
            }
        }

        double mean = sum / cont;

        if (sum > 0) {
            System.out.printf("MEDIA DOS PARES = %.1f", mean);
        } else
            System.out.print("NENHUM NUMERO PAR");


    }
}

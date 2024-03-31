import java.util.Locale;
import java.util.Scanner;

public class problemaAbaixoDaMedia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int number = input.nextInt();

        double[] numbers = new double[number];

        double sum = 0.0;

        for (int i = 0; i < number; i++) {
            System.out.print("Digite um numero: ");
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }

        double mean = sum / number;

        System.out.printf("MEDIA DO VETOR = %.3f %n", mean);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");

        for (int i = 0; i < number; i++) {
            if (numbers[i] < mean) {
                System.out.printf("%.1f %n", numbers[i]);
            }
        }


        input.close();
    }
}

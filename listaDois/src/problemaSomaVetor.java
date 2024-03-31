import java.util.Scanner;

public class problemaSomaVetor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int number = input.nextInt();

        int[] numbers = new int[number];

        int soma = 0;

        for (int i = 0; i < number; i++) {
            System.out.print("Digite um número: ");
            numbers[i] = input.nextInt();
            soma += numbers[i];
        }

        System.out.print("VALORES = ");
        for (int i = 0; i < number; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        System.out.println("SOMA = " + soma);
        System.out.print("MEDIA = " + soma / number);

        input.close();
    }
}
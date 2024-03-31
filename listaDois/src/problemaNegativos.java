import java.util.Scanner;

public class problemaNegativos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int number = input.nextInt();

        int[] numbers = new int[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Digite um número: ");
            numbers[i] = input.nextInt();
        }


        System.out.println("NÚMEROS NEGATIVOS: ");
        for (int i = 0; i < number; i++) {
            if (numbers[i] < 0) {
                System.out.println(numbers[i]);
            }
        }

        input.close();
    }
}
package probCambio;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Qual o valor do dólar? ");
        double cotacaoDolar = input.nextDouble();
        System.out.print("Quantos dólares serão comprados? ");
        double dolaresComprados = input.nextDouble();

        cambio c = new cambio();
        c.cotacaoDolar = cotacaoDolar;
        c.dolaresComprados = dolaresComprados;

        System.out.printf("Valor a ser pago em reais = %.2f", c.currencyConverter());

        input.close();
    }
}

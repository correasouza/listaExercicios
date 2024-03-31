package DadosBancarios;

import DadosBancarios.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Account a1 = new Account();
            System.out.print("Number: ");
            a1.setNumber(input.nextInt());
            System.out.print("Holder: ");
            a1.setHolder(input.nextLine());
            input.nextLine();
            System.out.print("Initial balance: ");
            a1.setBalance(input.nextDouble());
            System.out.print("Withdraw limit: ");
            a1.setWithdrawLimit(input.nextDouble());
            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            a1.setWithdrawAmount(input.nextDouble());
            input.close();

        a1.withdraw();
    }
}
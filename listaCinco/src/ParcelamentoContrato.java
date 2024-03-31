import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

class Contrato {
    private int numero;
    private Date data;
    private double valorTotal;

    public Contrato(int numero, Date data, double valorTotal) {
        this.numero = numero;
        this.data = data;
        this.valorTotal = valorTotal;
    }

    public int getNumero() {
        return numero;
    }

    public Date getData() {
        return data;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}

class Parcela {
    private Date data;
    private double valor;

    public Parcela(Date data, double valor) {
        this.data = data;
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public double getValor() {
        return valor;
    }
}

public class ParcelamentoContrato {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato:");
        System.out.print("Número: ");
        int numero = scanner.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        Date data = null;
        try {
            data = sdf.parse(scanner.next());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.print("Valor do contrato: ");
        double valorTotal = scanner.nextDouble();

        System.out.print("Entre com o número de parcelas: ");
        int numeroParcelas = scanner.nextInt();

        Contrato contrato = new Contrato(numero, data, valorTotal);
        Parcela[] parcelas = calcularParcelas(contrato, numeroParcelas);

        System.out.println("Parcelas:");
        for (Parcela parcela : parcelas) {
            System.out.println(sdf.format(parcela.getData()) + " - " + parcela.getValor());
        }
    }

    public static Parcela[] calcularParcelas(Contrato contrato, int numeroParcelas) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        double valorParcela = contrato.getValorTotal() / numeroParcelas;

        Parcela[] parcelas = new Parcela[numeroParcelas];
        Date dataParcela = contrato.getData();

        for (int i = 0; i < numeroParcelas; i++) {
            double juros = valorParcela * 0.01 * (i + 1);
            double valorComJuros = valorParcela + juros + (valorParcela * 0.02);
            parcelas[i] = new Parcela(dataParcela, valorComJuros);

            dataParcela = adicionarMes(dataParcela);
        }

        return parcelas;
    }

    public static Date adicionarMes(Date data) {
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.setTime(data);
        cal.add(java.util.Calendar.MONTH, 1);
        return cal.getTime();
    }
}

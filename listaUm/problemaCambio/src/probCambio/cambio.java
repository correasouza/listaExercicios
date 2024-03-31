package probCambio;

public class cambio {
    static double cotacaoDolar;
    static double dolaresComprados;

    public static double currencyConverter() {
        return (cotacaoDolar * dolaresComprados) * 1.06;
    }
}
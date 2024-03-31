package probFuncionarios;
public class employee {
    String name;
    double grossSalary;
    double tax;


    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        grossSalary = grossSalary * (1 + (percentage / 100));
    }

    @Override
    public String toString() {
        return String.format("Funcionário: %s, $ %.2f", name, netSalary());
    }










}

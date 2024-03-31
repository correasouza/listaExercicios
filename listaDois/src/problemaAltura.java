import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

class Person {
    private String name;
    private Integer age;
    private Double height;

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getHeight() {
        return height;
    }

    public void setHight(Double height) {
        this.height = height;
    }
}

public class problemaAltura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int number = input.nextInt();

        ArrayList<Person>people = new ArrayList<Person>();

        for (int i = 0; i < number; i++) {
            System.out.print("Nome: ");
            String name = input.nextLine(); input.nextLine();

            System.out.print("Idade: " + name);
            int age = input.nextInt();

            System.out.print("Altura: " + name);
            double height = input.nextDouble();

            people.add(new Person(name, age, height));
        }

        input.close();

        double sumHeights = 0.0;
        ArrayList <Person> peopleLessSixteen = new ArrayList<>();

        for (Person person : people) {
            sumHeights += person.getHeight();
            if (person.getAge() < 16)
                peopleLessSixteen.add(person);
        }

        double averageHeight = sumHeights / people.size();

        System.out.printf("Altura média: %.2f %n" + averageHeight);
        System.out.printf("Pessoas com menos de 16 anos: %.2f" + (double)peopleLessSixteen.size() / people.size() * 100);

        for (Person person : peopleLessSixteen) {
            System.out.println(person.getName());
            }
        }

    }

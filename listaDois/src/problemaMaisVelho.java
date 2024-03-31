import java.util.Locale;
import java.util.Scanner;

class People {
    String name;
    Integer age;

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

    public People(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}


public class problemaMaisVelho {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int number = input.nextInt();

        for (int i = 0; i < number; i++) {
            
        }

    }
}

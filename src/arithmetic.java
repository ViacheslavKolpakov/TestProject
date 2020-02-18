import java.util.Scanner;

public class arithmetic {
    public static void main(String[] args) {
        Scanner concole = new Scanner(System.in);
        System.out.println("Введите значение x = ");
        double x = concole.nextDouble();
        System.out.println("Введите значение y = ");
        double y = concole.nextDouble();
        System.out.println("Введите значение z = ");
        double z = concole.nextDouble();

        double average = (x + y + z) / 3;
        System.out.println(average);
        int integer = (int) average / 2;
        if (integer > 3)
        {
            System.out.println("Программа выполнена корректно");
        }
    }
}
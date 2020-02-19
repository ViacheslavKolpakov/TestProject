import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        System.out.println("Введите значение для переменной");
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        int x = 2;
        int y = 4;
        int z = 6;

        if(number == x || number == y || number == z ) {
            System.out.println("Данное значение имеется в константах");
        }
        else {
            System.out.println("Такой константы нет!");
        }
    }
}


import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        System.out.println(Integer.toString(a) + " x 1 = " + Integer.toString(a * 1)+"\n" +
                Integer.toString(a) + " x 2 = " + Integer.toString(a * 2)+"\n" +
                Integer.toString(a) + " x 3 = " + Integer.toString(a * 3)+"\n" +
                Integer.toString(a) + " x 4 = " + Integer.toString(a * 4)+"\n" +
                Integer.toString(a) + " x 5 = " + Integer.toString(a * 5)+"\n" +
                Integer.toString(a) + " x 6 = " + Integer.toString(a * 6)+"\n" +
                Integer.toString(a) + " x 7 = " + Integer.toString(a * 7)+"\n" +
                Integer.toString(a) + " x 8 = " +  Integer.toString(a * 8)+"\n" +
                Integer.toString(a) + " x 9 = " +  Integer.toString(a * 9)+"\n" +
                Integer.toString(a) + " x 10 = " +  Integer.toString(a * 10)+"\n");

    }
}
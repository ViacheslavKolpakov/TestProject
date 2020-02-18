import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int multiplier = console.nextInt();
        System.out.println(Integer.toString(multiplier) + " x 1 = " + Integer.toString(multiplier * 1) + "\n" +
                Integer.toString(multiplier) + " x 2 = " + Integer.toString(multiplier * 2) + "\n" +
                Integer.toString(multiplier) + " x 3 = " + Integer.toString(multiplier * 3) + "\n" +
                Integer.toString(multiplier) + " x 5 = " + Integer.toString(multiplier * 5) + "\n" +
                Integer.toString(multiplier) + " x 6 = " + Integer.toString(multiplier * 6) + "\n" +
                Integer.toString(multiplier) + " x 7 = " + Integer.toString(multiplier * 7) + "\n" +
                Integer.toString(multiplier) + " x 8 = " +  Integer.toString(multiplier * 8) + "\n" +
                Integer.toString(multiplier) + " x 9 = " +  Integer.toString(multiplier * 9) + "\n" +
                Integer.toString(multiplier) + " x 10 = " +  Integer.toString(multiplier * 10) + "\n");

    }
}
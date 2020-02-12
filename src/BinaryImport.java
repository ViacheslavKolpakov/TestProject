import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class BinaryImport {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        String a = console.nextLine();
        System.out.println(parseInt(a,2));
    }
}

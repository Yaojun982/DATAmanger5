import java.util.Arrays;
import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input line:");
        String s = input.nextLine();
        System.out.println("s = "+s);

        String[]t = s.split(" ");
        System.out.println("t = "+ Arrays.toString(t));

    }
}

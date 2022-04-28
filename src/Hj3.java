import java.util.Arrays;
import java.util.Scanner;

public class Hj3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter int:");
        String[]s =scanner.nextLine().split(" ");
        int n = s.length;
        int[] a = new  int[n];
        for (int i = 0; i <n ; i++) {
            a[i] = Integer.valueOf(s[i]);

        }
        System.out.println("a = "+ Arrays.toString(a));


    }
}

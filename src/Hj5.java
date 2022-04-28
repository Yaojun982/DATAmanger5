import java.util.Arrays;
import java.util.Scanner;

public class Hj5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter int:");
        String[]s =scanner.nextLine().trim().split(" ");
        System.out.println("a = "+ Arrays.toString(s));

        int n = s.length;
        int[] a = new  int[n];
        for (int i = 0; i <n ; i++) {
            a[i] = Integer.valueOf(s[i]);

        }int sum = 0;
            for (int i =a[0]; i <=a[1] ; i++) {
        sum+=i;
    }
            System.out.println(sum);
}

}

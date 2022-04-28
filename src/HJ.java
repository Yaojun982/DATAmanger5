import java.util.Arrays;
import java.util.Scanner;

public class HJ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input two int:");
        String s = input.nextLine();
        System.out.println("s = "+s);
///////////////data change////////////
        String[]t = s.split(" ");
        int a =  Integer.valueOf(t[0]);
        int b = Integer.valueOf(t[1]);
        System.out.format("a= %d,b=%d\n",a,b);

    }
}

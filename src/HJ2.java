import java.util.Scanner;

public class HJ2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input two int:");
        String s = input.nextLine();
        System.out.println("s = "+s);
///////////////data change////////////
        String[]t = s.split(" ");
        double a =  Double.valueOf(t[0]);
        double b = Double.valueOf(t[1]);
        System.out.format("a= %d,b=%d\n",a,b);

    }
}

import java.util.Scanner;

public class Q1_0428
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);


        System.out.println("請輸入n值:");
        double n = input.nextDouble();
        double j = 1;
        double sumfor = 0;
        double sumwhile = 0;


        for(double i = 1 ; i <= n ; i++)
        {
            double a = i;
            double b = i+1;
            double c = a / b ;
            sumfor = sumfor + c;
        }System.out.print("for loop:");
        System.out.printf("%4.2f",sumfor);

        System.out.println(" ");

        while(j <= n)
        {
            double a = j;
            double b = j + 1;
            double c = j / b ;
            sumwhile = sumwhile + c;
            j = j + 1;
        }
        System.out.print("While loop:");
        System.out.printf("%4.2f",sumwhile);
    }

}
package HW3;
import java.util.Scanner;

public class Q2_0505 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("請輸入四位數密碼:");
        int a[] = new int[4];

        for(int i = 0; i < 4; i++){

            a[i] = sc.nextInt();
            a[i] += 5;
            a[i] %= 10;
        }

        int temp;
        temp = a[0];
        a[0] = a[3];
        a[3] = temp;

        int temp2;
        temp2 = a[1];
        a[1] = a[2];
        a[2] = temp2;

        System.out.print("加密後的密碼為: ");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]);
        }
    }

}
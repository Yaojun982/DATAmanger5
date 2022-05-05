package P3;

import java.util.Arrays;
import java.util.Random;

public class Rand {
    public static void main(String[] args)  {
        Random rnd = new Random();
        int n = 10;
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]= rnd.nextInt(100);

        }
        System.out.println("a = "+ Arrays.toString(a));
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum +=a[i];
            System.out.println("sum = "+sum);

        }
    }
}
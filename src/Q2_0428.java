import java.util.Scanner;

public class Q2_0428 {
    public static void main(String[] args) {
       double fh;
       int n  ;
       Scanner in = new Scanner(System.in);
        System.out.println("請輸入從多米落下:");
       fh = in.nextDouble();
        System.out.println("請輸入第幾次下:");
        n = in.nextInt();
        System.out.println("從"+fh+"m"+"第"+n+"落第次數距離總和"+countT(n,fh)+"m");
        System.out.println("從"+fh+"m"+"第"+n+"反彈次數高度"+countH(n,fh)+"m");
    }
    public static double countT(int n ,double fh) {
        double totallong = fh;
        for (int i = 0; i < n-1; i++) {
            totallong+=fh/(double) (Math.pow(2,i));
        }
        return totallong;
    }
    public static double countH(int n ,double fh) {
          return fh/(double) (Math.pow(2,n));
        }

}
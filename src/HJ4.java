public class HJ4 {
    public static void main(String[] args) {


    }
    static String rev(int a){
        a= Math.abs(a);
        int m =0;
        while (a>0){
            int x =a%10;
            a/=10;
            System.out.println("x="+x);
            System.out.println("a="+a);

        }
        return "hello";
    }
}

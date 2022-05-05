package P3;

import java.util.Random;

public class Dices {
    public static void main(String[] args) {
        Random rnd = new Random();
        int  DICWS_NO=3,SIDE=6;
        int[]a = new int[DICWS_NO];

        int money = 0;
        int bet = 100;
        int MAX_TEST = 100000000;

        for (int i = 0; i < MAX_TEST; i++) {
            int sum = 0;
            for (int j = 0; j < DICWS_NO; j++) {
                a[j] = rnd.nextInt(SIDE)+1;
                sum+=a[j];
            }
            /////////////all dices
            if (a[0]==a[1]&&a[1]==a[2]){

                //////////big>=11,small<=10
                money-=bet;

            }else if (sum>=11){
                money+=bet;
            }else {
                money-=bet;
            }
        }
        System.out.println((double) money/MAX_TEST);
    }
}

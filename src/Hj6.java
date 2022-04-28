import com.sun.tools.javac.Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Hj6 {
    public static void main(String[] args) {
        ///////try data file
        String fn = "C:\\0\\jj.txt";
        File file = new File(fn);
        try (Scanner scanner= new Scanner(file)){

            int a = scanner.nextInt();
            while (scanner.hasNext()) {
                System.out.println("a= " + a);
            }
            /*
            int a = scanner.nextInt();
            System.out.println("a= "+a);

            int a = scanner.nextInt();
            System.out.println("a= "+a);
*/
        }catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

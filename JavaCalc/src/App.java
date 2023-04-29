import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hi Everyone");
        Scanner myScan = new Scanner(System.in);
        boolean run = true;
        while (run == true)
        {
            System.out.println(": ");
            String str = myScan.nextLine();
            System.out.println(str);
            run = false;
        }
        myScan.close();
    }
}

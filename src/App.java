import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner myScan = new Scanner(System.in);
        Reader reader = new Reader();
        
        System.out.println("=============Calculator=============");
        boolean run = true;
        while (run == true) {
            System.out.print(":> ");
            String str = myScan.nextLine();
            
            if (str == "") {
                    run = false;
                }
            else {
                reader.readInput(str);
            }
        }
        myScan.close();
    }
}

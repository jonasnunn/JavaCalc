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
                reader.convertInput(str);
                double[] numbers = reader.getNumbers();
                char[] operators = reader.getOperators();
                Calculator calc = new Calculator(numbers, operators);
                double answer = calc.getAnswer();
                System.out.println(answer);
            }
        }
        myScan.close();
    }
}

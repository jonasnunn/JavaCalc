import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner myScan = new Scanner(System.in);
        Reader reader = new Reader();

        System.out.println("Welcome to my calculator program. The calculator supports 4 operators\n1. +\n2. - \n3. *\n4. /\nEnter a blank line to quit");
        System.out.println("=============Calculator=============");
        boolean run = true;
        while (run == true) {
            System.out.print(":> ");
            String str = myScan.nextLine();
            
            // A blank input will exit the loop and end execution of the program.
            if (str == "") {
                    run = false;
                }
            // Validate the input and preform math on the input. 
            else {
                reader.convertInput(str); // Convert the input to two arrays of numbers and operators.
                double[] numbers = reader.getNumbers();
                char[] operators = reader.getOperators();
                Calculator calc = new Calculator(numbers, operators);
                double answer = calc.getAnswer(); // Do the math.
                String output = String.format("=  %f", answer);
                System.out.println(output); // Display the answer in a user friendly way.
            }
            System.out.println("");
        }
        myScan.close();
    }
}

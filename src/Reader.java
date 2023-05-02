import java.util.*;
public class Reader {
    
    private List<Character> operators;
    private List<Character> numbers;
    private double[] numberArray;
    private char[] opsArray;

    Reader() {
        operators = new ArrayList<Character>();
        operators.add('*');
        operators.add('/');
        operators.add('+');
        operators.add('-');

        numbers = new ArrayList<Character>();
        numbers.add('0');
        numbers.add('1');
        numbers.add('2');
        numbers.add('3');
        numbers.add('4');
        numbers.add('5');
        numbers.add('6');
        numbers.add('7');
        numbers.add('8');
        numbers.add('9');
        numbers.add('.');
    }

    private boolean checkValidChars(String input) {
        // Loop over the clean string ensuring it had valid chars.
        for (int i = 0; i < input.length(); i++){
            char currentChar = input.charAt(i);
            if (!numbers.contains(currentChar) && !operators.contains(currentChar)) {
                System.out.println("Invalid Input. Please enter a valid expression.");
                return false; 
            }
        }
        return true;
    }    

    private double[] findNums(String input) {
        String[] numberStrings = input.split("[*/+-]");
        double[] doubles = new double[numberStrings.length];
        
        // Convert all of the strings to doubles. 
        for (int i = 0; i < numberStrings.length; i++){
            doubles[i] = Double.parseDouble(numberStrings[i]);
        }
        // System.out.println(Arrays.toString(doubles));
        return doubles;
    }

    private char[] findOps(String input) {
        String opString = input.replaceAll("[0123456789.]", "");
        char[] opCharArray = opString.toCharArray();
        // System.out.println(opCharArray);
        return opCharArray;
    }

    /*Take a raw input string from the user and converts it to
    1. The numbers into an array of doubles
    2. The operators into an array of chars. */
    public void convertInput(String input) {
        String cleanInput = input.replaceAll("\\s", ""); // Remove blank spaces
        if (!checkValidChars(cleanInput)) //If chars are not valid return.
            return;
        
        numberArray = findNums(cleanInput); // Find the numbers.
        opsArray = findOps(cleanInput); // Find the operators.
        
        // Check if any numbers exists
        if (numberArray.length == 0) {
            System.out.println("Invalid Input. Please enter a valid expression.");
            return; 
        }

        // Check if any operators exists
        if (opsArray.length == 0) {
            System.out.println("Invalid Input. Please enter a valid expression.");
            return; 
        }
        
        System.out.println(Arrays.toString(numberArray));
        System.out.println(opsArray);
    }

    public double[] getNumbers() {
        return numberArray;
    }

    public char[] getOperators() {
        return opsArray;
    }
}

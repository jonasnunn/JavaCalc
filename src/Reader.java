import java.util.*;
public class Reader {
    
    private List<Character> operators;
    private List<Character> numbers;

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
    }

    private boolean checkValidChars(String input) {

        // Loop over the clean string ensuring it had valid chars.
        for (int i = 0; i < input.length(); i++){
            char currentChar = input.charAt(i);
            if (!numbers.contains(currentChar) && !operators.contains(currentChar)) {
                System.out.println("Invalid Input. Please enter a different expression.");
                return false; 
            }
        }
        return true;
    }    

    public void findNums(String input) {
        for (int i = 0; i < input.length(); i++){
            char currentChar = input.charAt(i);
            
        }
    }

    public void readInput(String input) {
        String cleanInput = input.replaceAll("\\s", ""); // Remove blank spaces
        
        if (!checkValidChars(cleanInput)); //If chars are not valid return.
            return;
        
        
            //System.out.println(cleanInput);
        

        // // Loop over the clean string looking for operators
        // for (int i = 0; i < cleanInput.length(); i++){
        //     char currentChar = cleanInput.charAt(i);
        //     if (currentChar == '*' || currentChar == '/') {

        //     }
        // }
    }
}

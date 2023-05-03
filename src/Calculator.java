import java.util.*;
public class Calculator {
    
    private double[] nums; 
    private char[] ops; 
    List<Double> numsList;
    List<Character> opsList;
    double answer; 

    Calculator(double[] numbers, char[] operators) {
        nums = numbers;
        ops = operators;
        numsList = new ArrayList<>();
        for (double num : nums) {
            numsList.add(num);
        }
        opsList = new ArrayList<>();
        for (char op : ops) {
            opsList.add(op);
        }
    }

    public double getAnswer() {
        preformMath();
        return numsList.get(0);
    }

    private void preformMath() {
        // Multiplication and division loop
        int runTimes = opsList.size();
        int index = 0;
        for (int i = 0; i < runTimes; i++) {
            if (opsList.get(index) == '+' || opsList.get(index) == '-') {
                index++;
            }
            else if (opsList.get(index) == '*') {
                answer = multiply(numsList.get(index), numsList.get(index + 1));
                numsList.remove(index);
                numsList.remove(index);
                numsList.add(index, answer);
                opsList.remove(index);
            }
            else if (opsList.get(index) == '/') {
                answer = divide(numsList.get(index), numsList.get(index + 1));
                numsList.remove(index);
                numsList.remove(index);
                numsList.add(index, answer);
                opsList.remove(index);
            } 
        }
        // Addition and subtraction loop
        runTimes = opsList.size();
        for (int i = 0; i < runTimes; i++) {
            if (opsList.get(0) == '+') {
                answer = add(numsList.get(0), numsList.get(1));
                numsList.remove(0);
                numsList.remove(0);
                numsList.add(0, answer);
                opsList.remove(0);
            } 
            else if (opsList.get(0) == '-') {
                answer = subtract(numsList.get(0), numsList.get(1));
                numsList.remove(0);
                numsList.remove(0);
                numsList.add(0, answer);
                opsList.remove(0);
            } 
        }
    }

    private double add(double num1, double num2) {
        return num1 + num2;
    }

    private double subtract(double num1, double num2) {
        return num1 - num2;
    }

    private double multiply(double num1, double num2) {
        return num1 * num2;
    }
    
    private double divide(double num1, double num2) {
        return num1 / num2;
    }
}
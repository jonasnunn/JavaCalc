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
        for (int i = 0; i < runTimes; i++) {
            if (ops[i] == '*') {
                answer = multiply(nums[i], nums[i+1]);
                numsList.remove(i);
                numsList.remove(i);
                numsList.add(i, answer);
                opsList.remove(i);
            } 
            else if (ops[i] == '/') {
                answer = divide(nums[i], nums[i+1]);
                numsList.remove(i);
                numsList.remove(i);
                numsList.add(i, answer);
                opsList.remove(i);
            } 
        }
        // Addition and subtraction loop
        runTimes = opsList.size();
        for (int i = 0; i < runTimes; i++) {
            if (ops[i] == '+') {
                answer = add(nums[i], nums[i+1]);
                numsList.remove(i);
                numsList.remove(i);
                numsList.add(i, answer);
                opsList.remove(i);
            } 
            else if (ops[i] == '-') {
                answer = subtract(nums[i], nums[i+1]);
                numsList.remove(i);
                numsList.remove(i);
                numsList.add(i, answer);
                opsList.remove(i);
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
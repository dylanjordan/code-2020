package Udemy.Exercise29;

import java.util.Scanner;

public class SimpleCalculator {
    
    public Scanner input = new Scanner(System.in);
    public double firstNumber, secondNumber, userInput, answer;

    public void getFirstNumber() {
        System.out.println("Input your first number:");
        firstNumber = input.nextDouble();
    }
    public void getSecondNumber() {
        System.out.println("Input your second Number");
        secondNumber = input.nextDouble();
    }
    public double getAdditionResult() {
        answer = firstNumber + secondNumber;
        return answer;

    }
    public double getSubtractionResult() {
        answer = firstNumber - secondNumber;
        return answer;
    }
    public double getMultiplicationResult() {
        answer = firstNumber * secondNumber;
        return answer;
    }
    public double getDivisionResult() {
        answer = firstNumber / secondNumber;
        return answer;
    }

}

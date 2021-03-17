package OtherJava;
import java.util.Scanner;

public class Calculator {
    public double firstNumber, secondNumber, answer;
    public int userInput;
    public boolean condition;
    public Scanner input = new Scanner(System.in);
    
    public void GetFirstNumber(){
        System.out.println("Welcome to the program, please input your first number:");
        firstNumber = input.nextDouble();
    }
    public void GetSecondNumber(){
        System.out.println("Input recorded...\nPlease input your second number");
        secondNumber = input.nextDouble();
    }
    public void Math(){
        while (condition = true) {
            System.out.println("Which function would you like to do? Please enter 1 to multipy, 2 to divide, 3 to subtract, and 4 to add");
            userInput = input.nextInt();
            if (userInput == 1) {
                answer = firstNumber * secondNumber;
                System.out.println(firstNumber + " multiplied by " + secondNumber + " equals " + answer);
                break;
            }
            if (userInput == 2) {
                answer = firstNumber / secondNumber;
                System.out.println(firstNumber + " divided by " + secondNumber + " equals " + answer);
                break;
            }
            if (userInput == 3) {
                answer = firstNumber - secondNumber;
                System.out.println(firstNumber + " subtracted by " + secondNumber + " equals " + answer);
                break;
            }
            if (userInput == 4) {
                answer = firstNumber + secondNumber;
                System.out.println(firstNumber + " added by " + secondNumber + " equals " + answer);
                break;
            }
        }
        
    }
    

}


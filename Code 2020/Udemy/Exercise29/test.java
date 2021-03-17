package Udemy.Exercise29;

public class test {
    public static void main(String[]args) {

    SimpleCalculator function = new SimpleCalculator();
    function.getFirstNumber();
    function.getSecondNumber();
    System.out.println("add= " + function.getAdditionResult());
    System.out.println("subtract= " + function.getSubtractionResult());
    System.out.println("multiply= " + function.getMultiplicationResult());
    System.out.println("divide= " + function.getDivisionResult());

    }
    
}

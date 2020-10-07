import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);

        float firstNumber, secondNumber;
        String operator;

        System.out.print("Input First Number: ");
        firstNumber = inputUser.nextFloat();

        System.out.print("Input Operator: ");
        operator = inputUser.next();
        
        System.out.print("Input Second Number: ");
        secondNumber = inputUser.nextFloat();

        float addition, subtraction, multiplication, division;
        addition = firstNumber + secondNumber;
        subtraction = firstNumber - secondNumber;
        multiplication = firstNumber * secondNumber;
        division = firstNumber / secondNumber;

        if(operator.equals("+")) {
             System.out.println("result: " + addition);
        } else {
            if(operator.equals("-")) {
                System.out.println("result: " + subtraction);
            } else {
                if(operator.equals("x")) {
                    System.out.println("result: " + multiplication);
                } else {
                    if(operator.equals("/")) {
                        System.out.println("result: " + division);
                    } else {
                        System.out.println("Operator is error");
                    }
                }
            }
        }
    }
}

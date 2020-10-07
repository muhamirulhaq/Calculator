import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);

        float firstNumber, secondNumber;
        String operator;
        firstNumber = inputUser.nextFloat();
        operator = inputUser.next();
        secondNumber = inputUser.nextFloat();

        float addition, subtraction, multiplication, division;
        addition = firstNumber + secondNumber;
        subtraction = firstNumber - secondNumber;
        multiplication = firstNumber * secondNumber;
        division = firstNumber / secondNumber;

        if(operator.equals("+")) {
             System.out.println("result: " + addition);
        } else {
            System.out.println("operator is not addition");
        }
    }
}

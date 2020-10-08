import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);

        float firstNumber, secondNumber;
        String operator, confirmation;

        confirmation = "YES";

        while(confirmation.equals("YES")) {

        System.out.print("\nInput First Number: ");
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
             System.out.println("\nresult: " + addition);
             System.out.println("\nTry again? (TYPE 'YES')");
             confirmation = inputUser.next();
        } else {
            if(operator.equals("-")) {
                System.out.println("\nresult: " + subtraction);
                System.out.println("\nTry again? (TYPE 'YES')");
                confirmation = inputUser.next();
            } else {
                if(operator.equals("x")) {
                    System.out.println("\nresult: " + multiplication);
                    System.out.println("\nTry again? (TYPE 'YES')");
                    confirmation = inputUser.next();
                } else {
                    if(operator.equals("/")) {
                        System.out.println("\nresult: " + division);
                        System.out.println("\nTry again? (TYPE 'YES')");
                        confirmation = inputUser.next();
                    } else {
                        System.out.println("\nOperator is error");
                    }
                }
            }
        }
        } 
        inputUser.close();
    }
}


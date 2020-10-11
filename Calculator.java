// Operator of addition is "+";
// Operator of subtraction is "-";
// Operator of multiplication is "x";
// Operator of division is "/";
// Operator of exponent is "^";

import java.util.Scanner;

public class Calculator {

    public static float addition(float a, float b) {
        float c = a + b;
        return c;
    }

    public static float subtraction(float a, float b) {
        float c = a - b;
        return c;
    }

    public static float multiplication(float a, float b) {
        float c = a * b;
        return c;
    }

    public static float division(float a, float b) {
        float c = a / b;
        return c;
    }

    public static float exponent(float a, float b) {
        float c = a;
        float i = 1;
        if(b == 0) {
            c = 1;
        } else {
           while(i < b) {
               c = c * a;
               i++;
           }
        }
        return c;
    }

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

        float additionIs, subtractionIs, multiplicationIs, divisionIs, exponentIs;
        additionIs = addition(firstNumber, secondNumber);
        subtractionIs = subtraction(firstNumber, secondNumber);
        multiplicationIs = multiplication(firstNumber, secondNumber);
        divisionIs = division(firstNumber, secondNumber);
        exponentIs = exponent(firstNumber, secondNumber);

        if(operator.equals("+")) {
             System.out.println("\nresult: " + additionIs);
             System.out.println("\nTry again? (TYPE 'YES')");
             confirmation = inputUser.next();
        } else {
            if(operator.equals("-")) {
                System.out.println("\nresult: " + subtractionIs);
                System.out.println("\nTry again? (TYPE 'YES')");
                confirmation = inputUser.next();
            } else {
                if(operator.equals("x")) {
                    System.out.println("\nresult: " + multiplicationIs);
                    System.out.println("\nTry again? (TYPE 'YES')");
                    confirmation = inputUser.next();
                } else {
                    if(operator.equals("/")) {
                        System.out.println("\nresult: " + divisionIs);
                        System.out.println("\nTry again? (TYPE 'YES')");
                        confirmation = inputUser.next();
                    } else {
                        if(operator.equals("^")) {
                            System.out.println("result: " + exponentIs);
                            System.out.println("\nTry again? (TYPE 'YES')");
                            confirmation = inputUser.next();
                        } else {
                        System.out.println("\nOperator is error");
                        }
                    }
                }
            }
        }
        } 
        inputUser.close();
    }
}

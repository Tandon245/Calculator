import java.util.*;

public class Main {
    public static double evaluation(String expression){
        double result = 0;
        String[] tokens = expression.split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)");

        ArrayList<Double> operands = new ArrayList<>();
        ArrayList<String> operators = new ArrayList<>();

        for (String token : tokens) {
            if (token.matches("[+\\-*/]")) {
                // Token is an operator
                operators.add(token);
            } else {
                // Token is an operand
                operands.add(Double.parseDouble(token));
            }
        }

        // Start with the first operand
        result = operands.get(0);

        // Perform calculations based on operators and subsequent operands
        for (int i = 0; i < operators.size(); i++) {
            String operator = operators.get(i);
            double nextOperand = operands.get(i + 1);

            switch (operator) {
                case "+":
                    result += nextOperand;
                    break;
                case "-":
                    result -= nextOperand;
                    break;
                case "*":
                    result *= nextOperand;
                    break;
                case "/":
                    if (nextOperand != 0) {
                        result /= nextOperand;
                    } else {
                        throw new ArithmeticException("Division by zero");
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator: " + operator);
            }
        }

        return result;

    }
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        boolean continueCalculating = true;

        while (continueCalculating) {
            System.out.println("Enter an expression (e.g., 2+3-4+5) or 'exit' to quit:");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                continueCalculating = false;
                System.out.println("Calculator exiting...");
            } else {
                try {
                    double result = evaluation(input);
                    System.out.println("Result: " + result);
                } catch (Exception e) {
                    System.out.println("Invalid expression. Please try again.");
                }
            }
        }



    }
}
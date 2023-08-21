# Simple Calculator with Expression Tokenization

This is a Java program that implements a simple calculator where users can input mathematical expressions like "2+3-4+5". The program tokenizes the expressions to separate operands and operators and then performs calculations accordingly.

## How the Calculator Works

1. The program uses a `Scanner` to continuously accept user input for calculations.

2. Users can input expressions like "2+3-4+5". The program tokenizes the expressions using a regular expression that splits between digits and non-digits or between non-digits and digits.

3. The tokenization separates numbers and operators, storing them in separate arrays.

4. The program then processes the arrays of operands and operators to perform calculations, following the order of operations.

5. The result of each calculation is displayed to the user.

6. The program continues to run until the user types "exit" to quit the calculator.

## Regular Expression for Tokenization

The regular expression used for tokenization is: `(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)`.

- `(?<=\\d)`: A positive lookbehind that asserts a digit before the current position.
- `(?=\\D)`: A positive lookahead that asserts a non-digit after the current position.
- `|`: Separates the two conditions for tokenization.
- `(?<=\\D)`: A positive lookbehind that asserts a non-digit before the current position.
- `(?=\\d)`: A positive lookahead that asserts a digit after the current position.

This regular expression effectively matches positions where digits transition to non-digits or non-digits transition to digits.

## How to Use

1. Compile and run the Java program using a compatible Java environment.

2. The program will prompt you to enter expressions like "2+3-4+5". You can also type "exit" to quit the calculator.

3. The program will tokenize the input expression, perform calculations, and display the results.

4. Keep entering expressions or exit the calculator as needed.

Feel free to modify and improve the program to suit your needs!

## Sample Output

Enter an expression (e.g., 2+3-4+5) or 'exit' to quit:
2+3-4+5
Result: 6.0
Enter an expression (e.g., 2+3-4+5) or 'exit' to quit:
5/0
Invalid expression. Please try again.
Enter an expression (e.g., 2+3-4+5) or 'exit' to quit:
exit
Calculator exiting...



Please note that this is a basic calculator and doesn't handle operator precedence or parentheses. More advanced calculations might require additional parsing and evaluation strategies.

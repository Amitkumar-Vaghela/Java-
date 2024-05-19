import java.util.Scanner;

public class SimpleCalculator {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter first number: ");
 double num1 = scanner.nextDouble();
 System.out.print("Enter second number: ");
 double num2 = scanner.nextDouble();
 System.out.println("Choose an operation (+, -, *, /): ");
 char operation = scanner.next().charAt(0);
 double output;
 switch (operation) {
 case '+':
 output = num1 + num2;
 break;
 case '-':
 output = num1 - num2;
 break;
 case '*':
 output = num1 * num2;
 break;
 case '/':
 if (num2 != 0) {
 output = num1 / num2;
 } else {
 System.out.println("Error! Dividing by zero is not allowed.");
 return;
 }
 break;
 default:
 System.out.println("Invalid operation! Please enter again.");
 return;
 }
 System.out.println(num1 + " " + operation + " " + num2 + " = " + output);
 }
}

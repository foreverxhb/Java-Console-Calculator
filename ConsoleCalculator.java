import java.util.*;
class ConsoleCalculator{

public static double addition(double a, double b)
{
return a+b;
}
public static double subtraction(double a, double b)
{
return a-b;
}
public static double multiplication(double a, double b)
{
return a*b;
}
public static double division(double a, double b)
{
if(b==0){
    System.out.println("Wrong Input- Cannot divide by zero.");
    return 0;
}
return a/b;
}

public static void main(String[]args)
 {
    Scanner sc = new Scanner (System.in);
    boolean continueLoop = true;
    System.out.println("---Welcome to the Calculator Build By Harshal Zade---");
    while(continueLoop){
        System.out.println("\nChoose an operation: ");
        System.out.println("1. Addition(+)");
        System.out.println("2. Subtraction(-)");
        System.out.println("3. Multiplication(*)");
        System.out.println("4. Division(/)");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        String input = sc.next();
        int choice;
    try {
        choice = Integer.parseInt(input);
    } catch (NumberFormatException e) {
        System.out.println("Invalid Input, Please enter a number from 1 to 5.");
        continue;
    }
    if (choice < 1 || choice > 5) {
        System.out.println("Invalid Input, Please select from 1 to 5.");
        continue;
    }
    if (choice == 5) {
        System.out.println("Exiting Calculator... Goodbye!");
        break;
    }
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        double result=0;
        switch(choice)
        {
            case 1:
            result = addition(num1, num2);
            System.out.println("\nAddition: "+num1+" + "+num2+" = "+result);
            break;
            case 2:
            result = subtraction(num1, num2);
            System.out.println("\nSubtraction: "+num1+" - "+num2+" = "+result);
            break;
            case 3:
            result = multiplication(num1, num2);
            System.out.println("\nMultiplication: "+num1+" * "+num2+" = "+result);
            break;
            case 4:
            result = division(num1, num2);
            System.out.println("\nDivision: "+num1+" / "+num2+" = "+result);
            break;
            default:
            System.out.println("Invalid Input, Please select from 1 to 5.");
            continue;
        }
        }
        sc.close();
 }
}

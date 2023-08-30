import java.util.Scanner;
public class ArithmeticDemo {
    
        public static void main(String[] args)
        {
            int firstNumber; 
            int secondNumber;
            int sum;
            int difference; 
            int average; 
            
            Scanner input = new Scanner(System.in);

            System.out.print("Please enter a number: ");
            firstNumber = input.nextInt();
            System.out.print("PLease enter sencond number: ");
            secondNumber = input.nextInt();

            sum = firstNumber + secondNumber;
            difference = firstNumber - secondNumber;
            average = sum/ 2;

            System.out.println(firstNumber + " + " +  secondNumber + " is " + sum);
            System.out.print(firstNumber + " - " + secondNumber + " is\n " + difference);
            System.out.print("The average of " + firstNumber + " and " + secondNumber + " is " + average);

        }

    
    
}

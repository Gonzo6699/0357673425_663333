import java.util.Scanner;
public class ArithmeticDemo3 {
    
        public static void main(String[] args)
        {
            double firstNumber; 
            double secondNumber;
            double sum;
            double difference; 
            double average; 
            
            Scanner input = new Scanner(System.in);

            System.out.print("Please enter a number: ");
            firstNumber = input.nextInt();
            System.out.print("PLease enter sencond number: ");
            secondNumber = input.nextInt();

            sum = firstNumber + secondNumber;
            difference = firstNumber - secondNumber;
            //average = (double) sum/ 2;
            average = sum / 2.0;
            System.out.println(firstNumber + " + " +  secondNumber + " is " + sum);
            System.out.println(firstNumber + " - " + secondNumber + " is\n " + difference);
            System.out.println("The average of " + firstNumber + " and " + secondNumber + " is " + average);

        }

    
    
}

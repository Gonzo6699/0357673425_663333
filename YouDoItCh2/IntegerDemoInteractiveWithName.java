//File name: IntegerDemoInteractive
//Written by Steven Gonzalez
//pg. 62

import java.util.Scanner;

public class IntegerDemoInteractiveWithName {
    public static void main(String[] args)
     { 
        int anInt; 
        byte aByte;
        short aShort;
        long aLong;
        String name;
        //int anotherInt = anInt * 10000000;
        Scanner input = new Scanner(System.in);
    
        System.out.print("PLease enter an integer: ");
        anInt = input.nextInt();
        System.out.print("PLease enter a byte integer: ");
        aByte = input.nextByte();
        System.out.print("PLease enter a short integer: ");
        aShort = input.nextShort();
        System.out.print("Please enter a long integer: ");
        aLong = input.nextLong();
        System.out.print("Please enter a name: ");
        input.nextLine();
        name = input.nextLine();
        //input.nextLine();
        System.out.println("Thank you, " + name);
        System.out.println("The int is " + anInt);
        System.out.println("The byte is " + aByte);
        System.out.println("The short is " + aShort);
        System.out.println("The long is " + aLong);
        //System.out.println("Another int is " + anotherInt);

    }
}
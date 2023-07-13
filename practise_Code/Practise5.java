package practise_Code;

import java.util.Scanner;

public class Practise5 {
    public static void main(String[] args) {
        System.out.print("Enter Week Number:");
        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();

        switch(week) {
            case 1: System.out.println("Your " + week + " Day is " + "MONDAY");
                break;
            case 2: System.out.println("Your " + week + " Day is " + "TUESDAY");
                break;
            case 3: System.out.println("Your " + week + " Day is " + "WENDESDAY");
                break;
            case 4: System.out.println("Your " + week + " Day is " + "THURSDAY");
                break;
            case 5: System.out.println("Your " + week + " Day is " + "FRIDAY");
                break;
            case 6: System.out.println("Your " + week + " Day is " + "SATURADY");
                break;
            case 7: System.out.println("Your " + week + " Day is " + "SUNDAY");
                break;
        
            default:
        }
    }
}

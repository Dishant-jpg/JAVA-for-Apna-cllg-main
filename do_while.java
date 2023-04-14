import java.util.*;
import java.io.*;
public class do_while {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char ch;
        int operationNumber;
        do{
            System.out.println("List of Operation is\n 1. Addition\n 2. Substration");
            System.out.println("Select a valid operation:");
            operationNumber = sc.nextInt();
            switch(operationNumber){
                case 1: 
                int a,b;
                System.out.println("Enter Two Number To Addition :");
                 a = sc.nextInt();
                 b = sc.nextInt();
                System.out.println("Addition" + (a+b));
                break;

                case 2:
                int x,y;
                System.out.println("Enter Two Number To Substartion :");
                x =sc.nextInt();
                y = sc.nextInt();
                System.out.println("Substration" + (x-y));
                break;

             default:
             System.out.println("Invalid Opeartion are perform");
            }
            System.out.println("Do You Again want to perform Operation (Y/N)");
            ch = sc.next().charAt(0);
        }while(ch=='Y');
    }
    }

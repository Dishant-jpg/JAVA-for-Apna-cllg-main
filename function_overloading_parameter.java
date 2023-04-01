import java.util.*;
public class function_overloading_parameter {
    public static int sum(int a, int b){
        return a+b;// sum of 2 Number
    }

    public static int sum(int a, int b, int c){
        return a+b+c;// Sum of 3 number
    }

    public static int multiply(int a, int b){
        return a*b;// Sum of 3 number
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your number :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("sum of 2no. is: " + sum(a, b));
        System.out.println("sum of 3no. is: " +sum(a, b, c));
        System.out.println("mutliply is: " +multiply(a, b));

    }
}

import java.util.*;
public class averageof3no {
    public static double average( double a, double b, double c){
        return a + b + c / 3;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number :");
        double a = sc.nextDouble();
        System.out.println("enter second number :");
        double b = sc.nextDouble();
        System.out.println("enter third number :");
        double c = sc.nextDouble();

        System.out.println("the average value is :" + average(a, b, c)  );

    }
}

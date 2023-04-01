import java.util.Scanner;

public class function_parameter {
    public static int calculatorsum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static int calculatorminus(int a, int b){
        int minus = a-b;
        return minus;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = calculatorsum(a,b);
    int minus = calculatorminus(a, b);
    System.out.println("sum is :" + sum);
    System.out.println("minus is :" + minus);
    }
}

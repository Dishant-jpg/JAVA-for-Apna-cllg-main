import java.util.Scanner;

public class swap_productab {
    public static int multiply(int a, int b){
        int product = a * b;
        return product;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = multiply(a,b);
        System.out.println(product);
    }
}

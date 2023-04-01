import java.util.*;
public class find_factorial {
    public static int factorial(int n){
        int fc = 1;
        for(int i=1; i<=n; i++){
            fc= fc * i; //fc is multiply by i. So this is factorail of f.
        }
        return fc;//factorial of n.
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number :"); //Input for user.
        int f = sc.nextInt();
        System.out.println(factorial(f)); //print factorial.
    }
}

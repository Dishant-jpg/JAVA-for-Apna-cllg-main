import java.util.*;
public class butterfly {
    public static void butterfly_pattern(int n){
        // First Half Pattern 
        for(int i= 1; i<=n; i++){
            // stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            
            // space = 2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            // star - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Second Half Pattern 
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            
            // space = 2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            // star - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Butterfly Pattern Number :");
        int n = sc.nextInt();
        butterfly_pattern(n);

    }
}

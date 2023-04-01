import java.util.*;
public class isprime_overloading {
    public static boolean isPrime(int n){
        for(int i=2; i<=n-1; i++){
            if(i%n==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter Your Number :");
            int i = sc.nextInt();

            System.out.println(isPrime(i));
        
    }
}

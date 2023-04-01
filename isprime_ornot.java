import java.util.Scanner;

public static boolean isPrime(int n){
    for(int i=2; i<=n-1; i++){
        if(i%n==0){
            return false;
        }
    }
    return true;
}


public class isprime_ornot {
    public static void primesInRange(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i + "");
            }
    }
    System.out.println();
}
    public static void main(String args[]){
        primesInRange(20);

    }
} 

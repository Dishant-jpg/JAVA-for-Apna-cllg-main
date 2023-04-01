import java.util.*;
public class sumofdigit_interger {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("input an Interger :");
    int digits = sc.nextInt();
    System.out.println("The sum is :" + sumDigits(digits));
  }  

  public static int sumDigits(int n){
    int sumofDigit=0;
    while(n>0){
        int lastdigit = n%10;
        sumofDigit += lastdigit;
        n/=10;
    }

    return sumofDigit;
  }
}

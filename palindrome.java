import java.util.*;
public class palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        int palindrome = sc.nextInt();

        if(isPalindrome(palindrome)){
            System.out.println("Number ;" + palindrome + "is a palindrome");
        }else{
            System.out.println("Number :" + palindrome + "is a not palindrome");
        }

    }

    public static boolean isPalindrome(int number){
        int palindrome = number;
        int reverse = 0;

        while(palindrome !=0){
            int remindar = palindrome % 10;
            reverse = reverse * 10 + remindar;
            palindrome = palindrome / 10;
        }

        if(number == reverse){
            return true;
        }
        return false;
    }
}

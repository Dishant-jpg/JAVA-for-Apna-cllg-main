import java.util.*;
public class practisenum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Interger Number :");
        int num;
        
        System.out.print("Enter Interger Number :");
        num = sc.nextInt();

        if(isEven(num)) {
            System.out.println("Number is even.");
        }else{
            System.out.println("Number is Odd.");
        }

    }

    public static boolean isEven(int number){
        if(number%2==0){
            return true;
        }else{
            return false;
        }

    }
}

import java.util.*;
public class Binary_to_decimal {
    public static void bintodec(int binNum){
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while(binNum > 0){
            int lastDigit = binNum % 10;
             decNum = decNum + (lastDigit *(int) Math.pow(2, pow));
            pow++;
            binNum = binNum/10;
        }

        System.out.println("decimal of " + myNum + "= " + decNum);
    }
    public static void main(String args[]){
        System.out.print("enter your Binary Number :");
        Scanner sc = new Scanner(System.in);
        int binNum = sc.nextInt();
        bintodec(binNum);
    }
}
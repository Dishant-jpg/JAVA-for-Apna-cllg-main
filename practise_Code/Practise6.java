package practise_Code;


import java.util.Scanner;

public class Practise6 {
    public static void main(String[] args) {
        System.out.print("Enter Your NUmber:");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

    if(year%4 == 0){
        System.out.println( year+ " is the leap year");
    }else {
        System.out.println(year + " is not a leap year");
    }
    }
}

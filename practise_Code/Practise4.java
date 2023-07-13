package practise_Code;

import java.util.Scanner;

public class Practise4 {
    public static void main(String[] args) {
        System.out.print("Enter Your Temperature:");
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();

        if(temp>100){
            System.out.println(temp + "You have High Fever");
            System.out.print("So, You should go to doctor");
        }else{
            System.out.print("You Don't have a fever");
        }
    }
}

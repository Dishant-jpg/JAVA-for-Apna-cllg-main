package practise_Code;

import java.util.Scanner;

public class pratise3 {
     public static void main(String args[]) {
      System.out.println("Enter Your Number:");
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();

      if(a>0){
          System.out.print( a + " is positive number");
      } else{
          System.out.print( a + " is negative number");
      }
  }
}

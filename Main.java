import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      //write your code here
      Scanner sc = new Scanner(System.in);
      int T;
      T = sc.nextInt();
      while(T!=0){
        T--;
      }
      int hours = sc.nextInt();
      int min = sc.nextInt();
      double h = (hours * 60 + min) * 0.5;
      double m = (min * 6);
      
      int angle= Math.abs(hours - min);
       if(angle>180){
          angle = 360-angle;
        }
      
      System.out.println(angle);
      
    }
  }
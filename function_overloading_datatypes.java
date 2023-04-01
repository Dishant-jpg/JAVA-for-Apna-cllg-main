import java.util.*;
public class function_overloading_datatypes {
    public static int sum(int a, int b) {
        return a+b;
    }


    public static float sum(float a, float b) {
        return a+b;
    }


    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
                int a= sc.nextInt();
                int b= sc.nextInt();
          
            System.out.println("sum of interger is :" + sum(6, 6));
            System.out.println(" sum of float is :" +sum(6.6f, 5.6f));
    }
}


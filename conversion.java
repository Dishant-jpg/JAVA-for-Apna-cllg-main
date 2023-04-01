import java.util.Scanner;

public class conversion {
    public static void main (String args[]){
        //This is Type Conversion
        /*int a = 25;
        long b = a;
        System.out.println(b);*/

        //In compatible Type (Lossy Conversion) So this is Possible In Type Conversion,Implicit Conversion, Widening Conversion.
       /* long a = 25;
        int b = a;
        System.out.println(b);*/
// In Scannner We will Take Int  to float but this is not Work, but we will take float to int this is work. So this is Type Conversion.
        Scanner sc = new Scanner(System.in);
        float number = sc.nextInt();
        System.out.println(number);
        
    }
}

import java.util.Scanner;

public class Nested_loop {
 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); // top to down star.

                for(int line = 1; line<=n; line++){
             for(int star=1; star<=line; star++){
                 System.out.print("* ");
             }
             System.out.println( );
            }}}
            // down to bottom star.
    // for(int line = 1; line<=n; line++){
    //     for(int star=1; star<=n-line+1; star++){
    //         System.out.print("* ");
    //     }
    //     System.out.println( );
    // }

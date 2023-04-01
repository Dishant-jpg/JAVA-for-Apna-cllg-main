import java.util.*;
public class while1_n {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        int n = sc.nextInt();
        int counter = 1;

        while(counter <= n){ // n is user input
            System.out.println(counter);
            counter++;
        }
        System.out.println("THANKS FOR USING CODE!");    }
}

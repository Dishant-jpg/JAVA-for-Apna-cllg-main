import java.util.Scanner;

public class ternary {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
        
        //Ternary Operator
        String Number = ((type%2) == 0)? "Even" : "Odd"; //  Type = Condition, Even= Statement1, Odd= Statement2
        System.out.println(Number);
    }
}

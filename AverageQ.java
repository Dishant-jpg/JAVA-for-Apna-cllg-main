import java.util.*;
public class AverageQ {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // Input 3 Numbers A,B,C
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int Average = (A + B + C) / 3;
        System.out.println("So Average is a:" + Average);

    }
}

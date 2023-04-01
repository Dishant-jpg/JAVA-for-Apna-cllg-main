import java.util.*;
public class Temperature {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double Temp = sc.nextDouble();

        if(Temp > 100){
            System.out.println("You have a fever");
        }
        else{
            System.out.println("You don't have a fever");
        }
    }
}

import java.util.*;
public class zero_one_triangle {
    public static void zero_tri(int number){
        for(int i=1; i<=number; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2 == 0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Triangle =");
        int number = sc.nextInt();
        zero_tri(number);

    }
}

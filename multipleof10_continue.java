import java.util.Scanner;

public class multipleof10_continue {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("enter your number :");
            int m = sc.nextInt();

            if(m%10==0){
                continue;
            }
            System.out.println("number was :"+ m);
        }while(true);
    }
}

import java.util.Scanner;

public class Income_Tax {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int Income = sc.nextInt();
        int Tax;

        if(Income <= 250000){
            Tax = 0;
        }
        else if(Income >= 250000 && Income < 500000){
            Tax = (int) (Income * 0.05);
        }
        else if(Income >= 500000 && Income < 1000000){
            Tax = (int) (Income * 0.2);
        }
        else{
            Tax = (int) (Income * 0.3);
        }
         System.out.println("Your Tax is:" + Tax);
    }
}

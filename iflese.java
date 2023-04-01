import java.util.*;
public class iflese {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("ADULT😁");
        }
        if( (age>13 && age<16)){
            System.out.println("Teenager");
        }
        else{
            System.out.println("NOT ADULT");
        }
        System.out.println(age);
    }
}

    
import java.util.*;
public class space {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int space = 8;
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.println(j);
            }
            for(int k=1; k<=space; k++){
                System.out.println(" ");
            }
            space = space-2;
            for(int j=i; j==1; j++){
                System.out.println(j);
            }
            System.out.println();
        }
    }
}

import java.util.*;
public class toys {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n-->0){
            int t = sc.nextInt();
            int c = sc.nextInt();
            if(c-t>1){
                count++;
            }
        }
        System.out.println(count);
    }
}

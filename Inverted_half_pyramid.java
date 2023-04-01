import java.util.*;
public class Inverted_half_pyramid {
    public static void invertedHalf(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j + " ");
                
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            System.out.print("enter inverted half pyramid number =");
            int n = sc.nextInt();
            invertedHalf(n);
        }
            
    }


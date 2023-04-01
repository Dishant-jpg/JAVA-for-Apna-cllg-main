public class TypePromotion2 {
   public static void main(String args[]){
    // Rule Two The Whole Expression is promoted to long, float, or double Respectively.
    int a = 10;
    float b = 2324.4f;
    long c = 44;
    double d = 42;
    double ans = a+b+c+d;
    System.out.println(ans);
   } 
}

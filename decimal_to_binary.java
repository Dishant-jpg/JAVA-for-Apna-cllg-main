public class decimal_to_binary {
    public static void dectobin(int n){
        int Mynum = n;
        int pow = 0;
        int binNum = 0;

        while(n>0){
            int rem = n%2;
            binNum = binNum + (rem * (int)Math.pow(10,pow));

            pow++;
            n = n/2;
        }
        System.out.println("binary form of " + Mynum + " =" + binNum);

    }
 public static void main(String args[]){
    dectobin(4);

 }   
}

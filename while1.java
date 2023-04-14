public class while1 {
    public static void main(String args[]){
        int i =5;
        while(i>0){
            int j=1;
            while(j<=5){
                System.out.println(i + " " + j);
                j++;
                i--;
            }
        }
    }
}

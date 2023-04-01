import java.util.*;;
public class hollow_rectangle {
    public static void hollowRectangle(int totalRow, int totalColumns){
        for(int i=1; i<=totalRow; i++){
            for(int j=1; j<=totalColumns; j++){
                if(i==1 || i==totalRow || j==1 || j==totalColumns){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){

        hollowRectangle(4, 5);
    }
}

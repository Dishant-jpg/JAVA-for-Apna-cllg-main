import java.util.Scanner;

public class floatdatatype {
   public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   float Pencil = sc.nextFloat();
   float Pen = sc.nextFloat();
   float Eraser = sc.nextFloat();

   float TotalCost = (Pencil + Pen + Eraser);
   System.out.println("Bill is : " + TotalCost); 

   // Add 18% GST In the Total
   float newTotal = TotalCost + (0.18f * TotalCost);
   System.out.println("Include GST :" + newTotal);
   } 
}

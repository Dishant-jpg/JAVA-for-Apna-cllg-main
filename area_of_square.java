import java.util.*;
public class area_of_square {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int operationNumber;
        System.out.println("Pleaes eneter a valid operation number" + 
        "\n1. Calculate area of circle" +
        "\n2. Calculate are of square"  +
        "\n3. Calculate area of recatngle"
        );
        operationNumber = sc.nextInt();
        int side, length, width, rectArea;
        double circleArea;
        
        switch(operationNumber){
            case 1:
                    circleArea = calculateAreafCircle();
                    System.out.println("Area of circle is:" + circleArea);
                    break;
            
            case 2:
                    System.out.println("Please enter the size of square: ");
                    side = sc.nextInt();
                    calculateAreafSquare(side);
                    break;
                    
            
            case 3:
                    System.out.println("Please enter the length and widh of recatngle: ");
                    length = sc.nextInt();
                    width = sc.nextInt();
                    rectArea = calculateAreafRectangle(length,width);
                    System.out.println("Area of Rectangle" + rectArea);
                    break;
        
            default:
                    System.out.println("Invalid operation number enetered");
        }
        }
        public static double calculateAreafCircle(){
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter the radius of the circle :");
            int radius = sc1.nextInt();
            return 3.14*radius*radius;
        }
        public static void calculateAreafSquare(int side){
            System.out.println("Area of Square :" + side+side);
        }
        public static int calculateAreafRectangle(int length, int width){
            return length*width;
        }
    }

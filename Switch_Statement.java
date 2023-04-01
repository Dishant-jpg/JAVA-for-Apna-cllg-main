import java.util.Scanner;

public class Switch_Statement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

    switch (number){
        case 1 : System.out.println("Samsosa");
        break;
        case 2 : System.out.println("Kachori");
        break;
        case 3 : System.out.println("Mango Shake");
        break;
        case 4 : System.out.println("Jalebi");
        break;
        case 5 : System.out.println("Burger");
        break;
        case 6 : System.out.println("Pizza");
        break;
        case 7 : System.out.println("Double Cheese Pizza");
        break;
        case 8 : System.out.println("Hot coffee");
        break;
        case 9 : System.out.println("Cold Coffee");
        break;
        case 10 : System.out.println("Tea");
        break;
        case 11 : System.out.println("Manchorin");
        break;
        default : System.out.println("We Wake up");
    }
    }
}

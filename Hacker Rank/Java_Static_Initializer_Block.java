import java.util.Scanner;

public class Java_Static_Initializer_Block{
    static int breadth;
    static int height;
    static boolean flag;

    static {
        Scanner scanner = new Scanner(System.in);
        breadth = scanner.nextInt();
        height = scanner.nextInt();
        scanner.close();

        if (breadth <= 0 || height <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        } else {
            flag = true;
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = breadth * height;
            System.out.println(area);
        }
    }
}
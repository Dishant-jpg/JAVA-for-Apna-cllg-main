import java.util.Scanner;

public class java_int_to_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        // Convert the integer to a string
        String s = Integer.toString(n);
        // Alternative: String s = String.valueOf(n);

        // Check if the conversion is correct
        if (s.equals(String.valueOf(n))) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
    }
}

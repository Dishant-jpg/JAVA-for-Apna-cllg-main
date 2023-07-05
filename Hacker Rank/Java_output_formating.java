import java.util.Scanner;

public class Java_output_formating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("================================");
        
        while (scanner.hasNext()) {
            String string = scanner.next();
            int number = scanner.nextInt();
            
            System.out.printf("%-15s%03d%n", string, number);
        }
        
        System.out.println("================================");
        
        scanner.close();
    }
}
import java.util.*;
public class ternary_que {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        String ReportCard = marks >=  33 ? "PASS" : "FAIL";
        System.out.println(ReportCard);
    }
}

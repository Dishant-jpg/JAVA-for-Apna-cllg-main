public class Logical {
    public static void main(String args[]){
        //LOGICAL OPERATOR 
        System.out.println( (3>2) && (3>0) ); // AND Logical Operator (T,F,F,F)
        System.out.println( (3>2) && (3>7) ); // AND Logical Operator
        System.out.println( (3>7) && (3>0) ); // AND Logical Operator
        System.out.println( (3>7) && (3>10) ); // AND Logical Operator
        System.out.println( (3>2) || (3>0) ); // NOT Logical Operator (T,T,T,F)
        System.out.println( (3>2) || (3>0) ); // NOT Logical Operator
        System.out.println( (3>2) || (3>0) ); // NOT Logical Operator
        System.out.println( (3>7) || (3>7) ); // NOT Logical Operator
        System.out.println(!(3>0));  // OR Logical Operator (T,F)
        System.out.println(!(3>7));  // OR Logical Operator
    }
}

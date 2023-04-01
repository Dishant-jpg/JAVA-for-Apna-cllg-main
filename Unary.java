public class Unary {
    // Two Type Of Unary Operator 
    // 1. Increment 
    // 2. Decrement
    public static void main(String args[]){
        //Two Type of Increment
        //1. Pre Increment
        //2. Post Increment

        // int a = 20;
        // int b = ++a;
        // System.out.println(a); // In This Firsty Change the Value of a and then value of a is incerment to the b.(Pre)
        // System.out.println(b);

        // int a = 20;
        // int b = a++;
        // System.out.println(a); // In this Firstly use the value of a in b and then a value will incerment.(Post)
        // System.out.println(b);



        // Two Type of Decerement
        //1.Pre Decerement
        //2.Post Decerement

        // int a = 20;
        // int b = --a;
        // System.out.println(a);// In this firstly check the value of a is decrement and then b value is same as a.(Pre)
        // System.out.println(b);


        int a = 20;
        int b = a--;
        System.out.println(a);// In this firstly check a value in memory and tthen check b value is 20 then value is change in a is 19 so a is 19 and b is 20.(Post)
        System.out.println(b);
    }
}

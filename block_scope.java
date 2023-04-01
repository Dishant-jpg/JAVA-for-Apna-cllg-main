import java.util.*;
public class block_scope {
    public static void main(String args[]){
        int block = 10;

        {
            int block2 = 50;
            System.out.println(block2);
        }
        //System.out.println(block2);// So this is error present in this block.
        System.out.println(block);
    }
}

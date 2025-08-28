import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
        int a=sc.nextInt();
        char ch=sc.next().charAt(0);
        int b=sc.nextInt();
        int result=0;
        boolean valid=true;
        switch(ch){
            case '+':
               System.out.println(a + b);
                break;
            case '-':
               System.out.println(a - b);
                break;
            case '*':
               System.out.println(a * b);
                break;
            case '/':
               System.out.println(a / b);
                break;
            default:
                System.out.println("no symbol");
        }
    }
}

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rem,pro=1;
        while(n>0){
            rem=n%10;
            n=n/10;
            pro=pro*rem;
        }
        System.out.println(pro);
    }
}

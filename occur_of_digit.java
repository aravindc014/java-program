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
        int a=sc.nextInt();
        int rem,count=0;
        while(n>0){
            rem=n%10;
            if(rem==a){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}

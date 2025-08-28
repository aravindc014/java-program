import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(x>0||y>0){
            if(x>0) System.out.println("Positive X-Axis");
            else System.out.println("Positive Y-Axis");
        }
        if(x<0||y<0){
            if(x<0) System.out.println("Negative X-Axis");
            else System.out.println("Negative Y-Axis");
        }
        if(x==0&&y==0){
            System.out.println("Origin");
        }
    }
}

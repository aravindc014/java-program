import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        int count=0;
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(Character.isDigit(ch)){
                System.out.print(ch);
                count = 1;
            }
           
        }
          if(count==0){
                System.out.print("0");
            }
    }
}

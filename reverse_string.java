import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        for(int i=n-1;i>=0;i--){
            char ch=str.charAt(i);
            System.out.print(ch);
        }
    }
}

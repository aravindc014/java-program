import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String str="aeiouAEIOU";
        String b="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(str.indexOf(ch)!=-1){
                b=b+' ';
            }
            else b+=ch;
        }
        System.out.println(b);
    }
}

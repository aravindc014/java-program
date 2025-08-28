import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution*/
        Scanner sc=new Scanner(System.in);
        String line=sc.nextLine();
        int u=0;
        for(int i=0;i<line.length();i++){
            char c=line.charAt(i);
                if(Character.isUpperCase(c)){
                    u++;
                }
            }
        System.out.println(u);
    }
}

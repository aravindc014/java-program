import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String c=sc.nextLine();
        String s=sc.nextLine();
            if(s.contains(c)){
                System.out.println("Present");
            }
            else System.out.println("Not Present");
    }
}

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
    String str1 = sc.next();
    String str2 = sc.next();
    String s1,s2;
    s1 = str1.toLowerCase();
    s2 = str2.toLowerCase();

       if(s1.length() == s2.length()) {

          char[] charArray1 = s1.toCharArray();
          char[] charArray2 = s2.toCharArray();

           Arrays.sort(charArray1);
           Arrays.sort(charArray2);

          boolean result = Arrays.equals(charArray1, charArray2);

      if(result) {
        System.out.println(str1 + " and " + str2 + " are Anagrams.");
      }
      else {
        System.out.println(str1 + " and " + str2 + " are Not Anagrams.");
      }
    }
    else {
      System.out.println(str1 + " and " + str2 + " are Not Anagrams.");
    }
    }
}

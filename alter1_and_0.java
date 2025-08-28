import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int val,n;
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0) val=0;
            else val=1;
            for(int j=1;j<=n;j++){
                System.out.print(val);
            }
            System.out.println();
        }
    }
}

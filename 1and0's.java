import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n,i,j,cent_r,cent_c;
        n=sc.nextInt();
        cent_r=(n+1)/2;
        cent_c=(n+1)/2;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(cent_r==i||cent_c==j){
                    System.out.print("0");
                }
                else if((n%2==0&&cent_r+1==i)||(n%2==0&&cent_c+1==j)){
                    System.out.print("0");
                }
                else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}

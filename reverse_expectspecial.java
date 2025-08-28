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
        char[] arr=str.toCharArray();
        int n=arr.length;
        int left=0,right=n-1;
        while(left<right){
            while(!Character.isLetterOrDigit(arr[left])){
                left++;
            }
                while(!Character.isLetterOrDigit(arr[right])){
                    right--;
                }
            if(left<right){
                char temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
            }
        System.out.println(arr);
        
        }
}

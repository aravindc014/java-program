//import java.io.*;
import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int a= scanner.nextInt();
        int b=scanner.nextInt();
        for(int i=1; i<=a; i++){
            System.out.println(i+" * "+ b +" = "+i*b);
        }
       scanner.close();
    }
}

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int pos = sc.nextInt();
        if (pos < 1 || pos > n) {
            System.out.println("Deletion not possible.");
        } else {
            for (int i = pos-1 ; i < n - 1; i++) {
                a[i] = a[i + 1];
            }
            for (int i = 0; i < n-1; i++) {
            System.out.print(a[i] + " ");
        }
                
            }
        }
    }


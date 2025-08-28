import java.io.*; 
import java.util.*; 
import java.text.*; 
import java.math.*; 
import java.util.regex.*;  

public class Solution {     
    public static void main(String[] args) {         
        try {
            Scanner sc = new Scanner(System.in);
            int n, max = 0, count = 1, data = 0;
            n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n - 1; i++) {
                if (a[i] == a[i + 1]) {
                    count++;
                } else {
                    if (max < count) {
                        max = count;
                        data = a[i];
                    }
                    count = 1;
                }
            }
            // Check last count segment
            if (max < count) {
                max = count;
                data = a[n - 1];
            }
            if (max > n / 2)
                System.out.println("The majority element is : " + data);
            else
                System.out.println("No majority element found in the array");
            
            sc.close();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers only.");
        } catch (NegativeArraySizeException e) {
            System.out.println("Array size cannot be negative.");
        } catch (Exception e) {
            System.out.println("No majority element found in the array");
        }
    } 
}

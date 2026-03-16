import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int[] x = new int[n];
                long totalSum = 0;
                
                for (int i = 0; i < n; i++) {
                    x[i] = sc.nextInt();
                    totalSum += x[i];
                }
                
                String result = "NO";
                long leftSum = 0;
                
                for (int i = 0; i < n; i++) {
                    // Right sum is (totalSum - leftSum - current element)
                    if (leftSum == (totalSum - leftSum - x[i])) {
                        result = "YES";
                        break;
                    }
                    leftSum += x[i];
                }
                System.out.println(result);
            }
        }
        sc.close();
    }
}

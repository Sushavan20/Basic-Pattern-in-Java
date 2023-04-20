/* 
Pattern
===========
*****
   *
  *
 *
*****
------------
*/

import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        int space = n - 1;
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == n) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int j = 1; j <= space-1; j++) {
                    System.out.print(" ");
                }
                space--;
                System.out.print("*");
                System.out.println();
            }
        }
        System.out.println();
        sc.close();
    }
}

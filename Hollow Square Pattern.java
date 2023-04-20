/* 
Pattern
===========
*****
*   *
*   *
*   *
*****
------------
*/


import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++) {
            if ((i == 1 || i == n)) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("*");
                }
            }
            else {
                for (int j = 1; j <= n; j++) {
                    if(j==1||j==n) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
            sc.close();
        }
    }
}

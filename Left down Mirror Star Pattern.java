/* 
Pattern
===========
*****
****
***
**
*
------------
*/

import java.util.*;
public class p3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        sc.close();
    }
}

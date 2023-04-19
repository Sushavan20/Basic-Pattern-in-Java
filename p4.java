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
public class p4 {
    public static void main(String[] args) {
        System.out.print("Enter number of rows: ");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int space=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            space++;
            for(int j=0;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        sc.close();
    }
}
/* 
Pattern
===========
    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *
------------
*/

import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of rows for one half: ");
        int n = sc.nextInt();
        int space=n-1;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=space;k++){
                System.out.print(" ");
            }
            space--;
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        space=1;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=space;k++){
                System.out.print(" ");
            }
            space++;
            for(int k=1;k<=n-i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        sc.close();
    }
}

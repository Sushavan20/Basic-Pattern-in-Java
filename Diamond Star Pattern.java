/* 
Pattern
===========
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
------------
*/

import java.util.*;
public class Test {
    public static void main(String[] args) {
        System.out.print("Enter number of rows for one half: ");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int space=n-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            space--;
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        space=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            space++;
            for(int k=1;k<=2*(n-i)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        sc.close();
    }
}

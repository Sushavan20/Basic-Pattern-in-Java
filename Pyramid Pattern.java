/* 
Pattern
===========
    * 
   * *
  * * *
 * * * *
* * * * *
------------
*/

import java.util.*;
public class Test {
    public static void main(String[] args) {
        System.out.print("Enter number of rows: ");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            for (int j=n-i;j>1;j--){ 
                System.out.print(" ");
            }  
            for (int j=0;j<=i;j++){ 
                System.out.print("* "); 
            } 
            System.out.println();
        }
        System.out.println();
        sc.close();
    }
}

     

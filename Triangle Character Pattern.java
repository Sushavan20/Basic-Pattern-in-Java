/* 
Pattern
===========
     A 
    A B 
   A B C 
  A B C D 
 A B C D E 
A B C D E F 
------------
*/

import java.util.Scanner;

public class Test {        
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        for (int i=0;i<=n;i++){ 
            int alphabet = 65; 
            for (int j=n;j>i;j--){
            System.out.print(" ");
            }
            for (int k=0;k<=i;k++){
                System.out.print((char) (alphabet + k) + " ");
            }
            System.out.println();
        }
        System.out.println();
        sc.close();
    }
}

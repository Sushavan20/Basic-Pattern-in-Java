/* 
Pattern
===========
        1 
      2 3 2
    3 4 5 4 3
  4 5 6 7 6 5 4
5 6 7 8 9 8 7 6 5
------------
*/


import java.util.*;
public class p15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        int space=n-1;
        for(int i=1;i<=n;i++){
            int count=i;
            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            space--;
            for(int k=1;k<=(2*i-1)/2;k++){
                System.out.print(count++ + " ");
            }
            for(int k=(2*i-1)/2+1;k>=1;k--){
                System.out.print(count-- + " ");
            }
            System.out.println();
        }
        System.out.println();
        sc.close();
    }
}
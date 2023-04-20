/* 
Pattern
===========
        1 
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
  4 3 2 1 2 3 4
    3 2 1 2 3
      2 1 2
        1
------------
*/


import java.util.Scanner;
  
public class Test{            
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of rows for one half: ");
        int n = sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=n-i;j++){ 
                System.out.print("  "); 
            } 
            for (int k=i;k>= 1;k--){
                System.out.print(k + " ");
            }
            for (int l=2;l<=i;l++){ 
                System.out.print(l + " "); 
            } 
            System.out.println(); 
        } 
        n=n-1;
        for (int i=n;i>= 1;i--){
            for (int j=0;j<=n-i;j++){ 
                System.out.print("  "); 
            } 
            for (int k=i;k>=1;k--){
                System.out.print(k + " ");
            }
            for (int l=2;l<=i;l++){
                System.out.print(l + " ");
            }
            System.out.println();
        }
        System.out.println();
        sc.close();
    }
}

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


import java.util.Scanner;
public class Test{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows for one half: ");
        int n = sc.nextInt();        
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){ 
                System.out.print("*"); 
            } 
            System.out.println(); 
        } 
        for (int i=n-1;i>=0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        sc.close();
    }
}

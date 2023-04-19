/* 
Pattern
===========
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
------------
*/


import java.util.*;
public class p14 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int count =1;
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
        System.out.println();
        sc.close();
    }
}

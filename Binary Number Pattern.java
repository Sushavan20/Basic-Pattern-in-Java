/* 
Pattern
===========
10101
01010
10101
01010
10101
------------
*/


import java.util.Scanner;
public class Test{
      
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        int flag;
        for (int i=1;i<=n;i++) {
            if(i%2 == 0){
                flag = 0;
                for (int j=1;j<=n;j++){
                    System.out.print(flag); 
                    flag = (flag == 0)? 1 : 0;
                }
            }
            else
            {
                flag = 1;
                  
                for (int j=1;j<=n;j++)
                {
                    System.out.print(flag);
                    flag = (flag == 0)? 1 : 0;
                }
            }
            System.out.println();
        }
        System.out.println();
        sc.close();
    }
}            

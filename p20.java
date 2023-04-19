/* 
Pattern
===========
A B C D E F 
A B C D E 
A B C D 
A B C 
A B 
A 
A 
A B 
A B C
A B C D
A B C D E
A B C D E F
------------
*/



import java.util.Scanner;
 
public class p20{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        n=n/2;
        for (int i=n;i>=0;i--){
            int alphabet = 65;
            for (int j=0;j<=i;j++){
                System.out.print((char) (alphabet + j) + " ");
            }
            System.out.println();
        }
        for (int i = 0; i<= 5; i++)
        {
            int alphabet = 65;
            for (int j=0;j<=i;j++){
                System.out.print((char) (alphabet + j) + " ");
            }
            System.out.println();
        }
        System.out.println();
        sc.close();
    }       
}
 
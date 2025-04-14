package Pattern;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n");
        int n = sc.nextInt();
        System.out.println("Enter the val m");
        int m = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==n/2 ||j== m/2 ||(j==0 && i<=n/2) || (i==n-1 && j<=m/2) || (j>=m/2 && i==0) || (j==m-1 && i>=n/2 )){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

package Pattern;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println("Enter the value of m");
        int m = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1||i==n||j==1||j==m){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
//        for(int i=1;i<=n;i++){
//            if(i==1 || i==n){
//                for(int j=1;j<=n;j++){
//                    System.out.print("*");
//                }
//            }
//            else{
//                for(int j=1;j<=n;j++){
//                    if(j==1 || j==n){
//                        System.out.print("*");
//                    }else{
//                        System.out.print(" ");
//                    }
//                }
//            }
//            System.out.println();
//        }

    }
}

//Hollow Square:
//        ****
//        *  *
//        *  *
//        ****
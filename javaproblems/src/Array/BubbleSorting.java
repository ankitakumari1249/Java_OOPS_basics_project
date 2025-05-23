package Array;

import java.util.Scanner;

public class BubbleSorting {
    public static int[] sortArr(int[] arr){
        int n = arr.length;
      for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
          if(arr[i]>arr[j]){
              int temp = arr[i];
              arr[i]=arr[j];
              arr[j] =temp;
          }
      }
  }
        return arr;
    }
    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        BubbleSorting.printArr(arr);
        BubbleSorting.sortArr(arr);
        System.out.println();
        BubbleSorting.printArr(arr);
    }
}

package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {
    public static int getMin(int arr[]){
        int result = arr[0];
        for(int i=1;i< arr.length;i++){
            result = Math.min(result,arr[i]);
        }
        return result;
    }

    public static int getMax(int arr[]){
        int result = arr[0];
        for(int i=1;i< arr.length;i++){
            result = Math.max(result,arr[i]);
        }
        return result;
    }

//    static int getMin(int arr[], int i, int n)
//    {
//        // If there is single element, return it.
//        // Else return minimum of first element and
//        // minimum of remaining array.
//        return (n == 1) ? arr[i] : Math.min(arr[i],
//                getMin(arr,i + 1 , n - 1));
//    }

//    static int getMin(int arr[], int n)
//    {
//        return Arrays.stream(arr).min().getAsInt();
//    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int arr [] =new int[n];
        for(int i=0; i<arr.length;i++){
            System.out.println("Enter your array element");
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
//        Arrays.sort(arr);
//        int max =  arr[arr.length-1];
//        int min = arr[0];
//        System.out.println("Max element of arr = "+max);
//        System.out.println("Min element of arr = "+min);
        System.out.println("Max element is "+MaxMin.getMax(arr));
        System.out.println("Min element is "+MaxMin.getMin(arr));

    }
}

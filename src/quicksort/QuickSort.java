package quicksort;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    
    public static void main(String[] args) {
        
        int[] arr = new int[20];
        for ( int x = 0; x < arr.length; x++ ) {
            arr[x] = new Random().nextInt(20);
        }
        System.out.println(Arrays.toString(arr));
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        
    }
    
    public static void sort(int[] arr, int l, int h) {
        partition(arr, l, h);
    }
    
    public static void partition(int[] arr, int l, int h) {
        
        int pivot = 0;
        System.err.println("The pivot is: " + arr[pivot]);
        int leftToRight = 1;
        int rightToLeft = arr.length - 1;
        
        while ( true ) {
            
            while ( leftToRight < arr.length - 1 && arr[leftToRight] < arr[pivot] )
                leftToRight++;
            
            while ( rightToLeft > 0 && arr[rightToLeft] > arr[pivot] )
                rightToLeft--;
            
            if ( rightToLeft <= leftToRight ) {
                swap(arr, rightToLeft, pivot);
                break;
            } else
                swap(arr, leftToRight, rightToLeft--);
        }
        
    }
    
    public static void swap(int[] arr, int leftToRight, int rightToLeft) {
        int temp = arr[leftToRight];
        arr[leftToRight] = arr[rightToLeft];
        arr[rightToLeft] = temp;
    }
    
}
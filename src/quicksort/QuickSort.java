package quicksort;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    
    public static void main(String[] args) {
        
        int[] arr = new int[10];
        for ( int x = 0; x < arr.length; x++ ) {
            arr[x] = new Random().nextInt(20);
        }
        System.out.println(Arrays.toString(arr));
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        
    }
    
    public static void sort(int[] arr, int l, int h) {
        if ( l < h ) {
            int pivot = partition(arr, l, h);            
            sort(arr, l, pivot - 1);
            sort(arr, pivot + 1, h);
        }
    }
    
    public static int partition(int[] arr, int l, int h) {
        
        int pivot = arr[l];
        int leftToRight = l + 1;
        int rightToLeft = h;
        
        while ( true ) {
            
            while ( leftToRight < h && arr[leftToRight] < pivot )
                leftToRight++;
            
            while ( rightToLeft > l && arr[rightToLeft] > pivot )
                rightToLeft--;
            
            if ( rightToLeft < leftToRight ) {
                swap(arr, rightToLeft, l);
                break;
            } else
                swap(arr, leftToRight, rightToLeft--);
        }
        
        return rightToLeft;
    }
    
    public static void swap(int[] arr, int leftToRight, int rightToLeft) {
        int temp = arr[leftToRight];
        arr[leftToRight] = arr[rightToLeft];
        arr[rightToLeft] = temp;
    }
    
}
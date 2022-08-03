package assissted;

import java.util.Arrays;
import java.util.Collections;
 
class smallest 
{
    public static int small(Integer[] arr,int k)
    {
       
        Arrays.sort(arr);
        return arr[k - 1];
    }
 
    // driver program
    public static void main(String[] args)
    {
        Integer arr[] = new Integer[] { 12, 3, 5, 7, 19 };
        int k = 4;
        System.out.print("K'th smallest element is " + small(arr, k));
    }
}

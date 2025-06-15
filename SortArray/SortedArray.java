import java.util.Scanner;
import java.util.Arrays;


public class SortedArray {
    // write code here   
    
    public int[] getIntegers(int arrSize){
         int[] arr = new int[arrSize];
         Scanner sc = new Scanner(System.in);
         
         for(int i = 0; i < arrSize; i++){
             int ele = sc.nextInt();
             arr[i] = ele;
         }
         
         return arr;
    }
    
    
    public int[] sortIntegers(int[] arr){
        int[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy); //[5, 15, 26, 81, 106]

        //Reversing- for descending order
        for(int i = 0; i < copy.length/2; i++){
            int temp = copy[i];
            copy[i] = copy[copy.length - 1 - i];
            copy[copy.length - 1 - i]  = temp;
        }
        
        return copy;
    }
    
    public void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println("Element "+i+" contents "+arr[i]);
        }
    }
}


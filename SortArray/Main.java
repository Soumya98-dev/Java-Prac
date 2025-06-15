import java.util.Arrays;


class Main {
    public static void main(String[] args){
        SortedArray sortedArray = new SortedArray();
        int[] arr = sortedArray.getIntegers(5);
        System.out.println(Arrays.toString(arr));

        int[] sortedArr = sortedArray.sortIntegers(arr);
        System.out.println(Arrays.toString(sortedArr));

        sortedArray.printArray(sortedArr);
    }
}


//[106, 26, 81, 5, 15]
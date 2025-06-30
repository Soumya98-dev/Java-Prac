import java.util.Scanner;
import java.util.Arrays;

public class MinimumElement{
	public int readInteger(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("No of elements: ");
		int number = scanner.nextInt();
		return number;
	} 

	public int[] readElements(){
		int[] arr = new int[readInteger()];
		for(int i = 0; i < arr.length; i++){
			Scanner scanner = new Scanner(System.in);
			int number = scanner.nextInt();
			arr[i] = number;
		}

		return arr;
	}

	public int findMin(int[] arr){
		Arrays.sort(arr);
		return arr[0];
	}
}
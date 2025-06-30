public class Main{
	public static void main(String[] args){
		MinimumElement minimumElement = new MinimumElement();
		minimumElement.readInteger();
		int[] arr = minimumElement.readElements();
		System.out.println(minimumElement.findMin(arr));
	}
}
package activities;
import java.util.*;

public class Activity2 {

	public static void main(String[] args) {
		// Initializing Array
		int[] arr = {10,77,10,54,-11,10};
		int sum=30,checksum=0;
		System.out.println("Array have following elements:" + " " + Arrays.toString(arr) );
		System.out.println("Value to be matched =" + " " + sum );
		System.out.println("Result =" + " " + result(arr,checksum,sum) );
		}
	public static boolean result(int[] arr, int checksum, int sum) {
		for(int i=0;i<=arr.length-1;i++) {
			if (arr[i]==10) {
					checksum+=arr[i];
			}
		}
		return checksum==sum;
	}
}



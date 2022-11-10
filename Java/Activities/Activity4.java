package activities;
import java.util.*;
public class Activity4 {
	
	public static void main(String[] args) {
		int[] BeforeSort = {4,7,11,9,1,3,6};
		Activity4 sort = new Activity4();
		System.out.println("Array before sorting = " + Arrays.toString(BeforeSort));
		sort.InsertionSort(BeforeSort);
		
	}
	void InsertionSort(int[] arr) {
		int len = arr.length, i;
        
        for (i = 1; i < len; i++) {
            int Frstele = arr[i];
            int j = i - 1;
            
            while (j >= 0 && Frstele < arr[j]) {
                arr[j + 1] = arr[j];
                --j;
            }
            arr[j + 1] = Frstele;
        }
		System.out.println("Array after sorting = " + Arrays.toString(arr));
	}

}

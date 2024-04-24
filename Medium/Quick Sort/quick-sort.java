//{ Driver Code Starts
import java.util.*;
class Sorting
{
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
    // Driver program
    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

			
			new Solution().quickSort(arr,0,n-1);
			printArray(arr);
		    T--;
		}
} }
// } Driver Code Ends


class Solution {
    // Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high) {
        if (low >= high) {
            return;
        }

        // Partition the array
        int p = partition(arr, low, high);

        // Recursively sort the left and right parts
        quickSort(arr, low, p - 1);
        quickSort(arr, p + 1, high);
    }

    static int partition(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low + 1;  // Corrected initialization
        int j = high;

        while (i <= j) {  // Corrected condition
            while (i <= j && arr[i] < pivot) {
                i++;
            }
            while (i <= j && arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        // Swap arr[low] and arr[j] to place the pivot at its correct position
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        // Return the pivot index
        return j;
    }
}
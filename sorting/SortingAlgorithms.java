import java.util.Scanner;
import java.util.ArrayList;

public class SortingAlgorithms{

	static void SelectionSort(int[] arr, int n){
		for (int i=0; i<=n-2; i++){
			int min = i;
			for(int j=i; j<=n-1; j++){
				if (arr[j] < arr[min]){
					int temp = arr[min];
					arr[min] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	static void BubbleSort(int[] arr, int n){
		for (int i=n-1; i>0; i--){
			boolean swap = false;
			for (int j=0; j<i; j++){
				if (arr[j] > arr[j+1]){
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;

					swap = true;
				}
			}
			if (!swap) return;
		}
	}

	static void InsertionSort(int[] arr, int n){
		for (int i=0; i<=n-1; i++){
			int j = i;
			while( j>0 && arr[j-1] > arr[j]){
				int temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;

				j--;
			}
		}
	}

	static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low;      // starting index of left half of arr
        int right = mid + 1;   // starting index of right half of arr

        //storing elements in the temporary array in a sorted manner//

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // if elements on the left half are still left //

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

	static void MergeSort(int[] arr, int low, int high){
		if (low >= high) return;

		int mid = (low + high)/2;
		MergeSort(arr, low, mid);
		MergeSort(arr, mid+1, high);
		merge(arr, low, mid, high);
	}

	static int partition(int[] arr, int low, int high){
		int pivot = arr[low];
		int i = low, j = high;

		while (i < j){
			while (arr[i] <= pivot && i<high){
				i++;
			}
			while (arr[j] >= pivot && j>low){
				j--;
			}
			if (i < j){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		int temp = arr[low];
		arr[low] = arr[j];
		arr[j] = temp;

		return j;
	}

	static void QuickSort(int[] arr, int low, int high){
		if (low < high){
			int partition = partition(arr, low, high);
			QuickSort(arr, low, partition-1);
			QuickSort(arr, partition+1, high);
		}
	}

	// driver code
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array elements: ");
        for (int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        
		System.out.print("\n1. Selection Sort\n2. Bubble Sort\n3. Insertion Sort\n4. Merge Sort\n5. Quick Sort\nSelect an algorithm: ");
		int alg = scan.nextInt();

		switch(alg){
			case 1:
				SelectionSort(arr, n);
				break;
			case 2:
				BubbleSort(arr, n);
				break;
			case 3:
				InsertionSort(arr, n);
				break;
			case 4:
				int l=0, h=n-1;
				MergeSort(arr, l, h);
				break;
			case 5:
				QuickSort(arr, 0, n-1);
				break;
			default:
				System.out.println("Incorrect input");
				break;
		}

        System.out.println("\nSorted array: ");
		
		for (int i=0; i<n; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
import java.util.Scanner;

public class Selection{
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

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array elements: ");
        for (int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        
		
		SelectionSort(arr, n);

        System.out.println("\nSorted array: ");
		
		for (int i=0; i<n; i++){
			System.out.print(arr[i] + " ");
		}
	}
}
package learnings.interfaceconcepts.examples;

public class SelectionSort {

//https://www.geeksforgeeks.org/java-program-for-selection-sort/

//Assume the first element in the array as smallestElement
//Find the smallest element in the array by traversing the array completely.
//Assume the first oart of the array is unsorted


    void sort(int arr[]) {
        int n = arr.length;
        int i =0;
        int min_idx = i;
        // One by one move boundary of unsorted subarray
        for ( i = 0; i < n; i++) {
            // Find the minimum element in unsorted array

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;

                    // Swap the found minimum element with the first
                    // element
                    int temp = arr[min_idx];
                    arr[min_idx] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    // Prints the array
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver code to test above
    public static void main(String args[]) {
        SelectionSort ob = new SelectionSort();
        int arr[] = {64, 25, 12, 22, 11};
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }


}

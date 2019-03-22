// ThreeWayRadixQuickSort class for Suffix Array.
public class ThreeWayRadixQuickSort {
    public static void sort(String [] arr) {
        sort(arr, 0, arr.length -1, 0);
    }
    // Helper Function for the 3-Way Radix QuickSort Algorithm.
    public static void sort(String [] arr, int low, int high, int kth) {
        if(high <= low)
            return;
        int l = low, h = high;
        // The item on which the partition of the array is based.
        int v = charAt(arr[low], kth);
        int i = low + 1;
        // Loop to compare the kth characters of the strings to the partitoning item.
        while(i <= h) {
            int t = charAt(arr[i], kth);
            // Three-Way Partitioning.
            if(t < v)
                swap(arr, l++, i++);
            else if(t > v)
                swap(arr, i, h--);
            else
                i++;
        }
        // Recursive calls for further partitoning the array of strings.
        sort(arr, low, l-1, kth);
        if(v >=0)
            sort(arr, l, h, kth + 1);
        sort(arr, h+1, high, kth);
    }
    // swap method for swapping elements in the array.
    public static void swap(String [] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    // charAt method that returns the character at a specific index of a given string. 
    public static Character charAt(String arr, int k) {
        return arr.charAt(k);
    }
    // Main method for Testing ThreeWayRadixQuickSort.
    public static void main(String [] args) {
        String [] arr = {"bat", "cat", "abc"};
        sort(arr);
        for(String str: arr) {
            System.out.println(str);
        }
    }
}

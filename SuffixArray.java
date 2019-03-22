// Class for Suffix Array Construction. 
public class SuffixArray {
 // Method to construct the suffix array. 
  public int[] suffixArrayBuilder(String str) {
    int len = str.length();
    // Array to hold the sorted indexes corresponding to the suffixes.
    int [] suffix_array = new int[len];
    // Array to hold suffixes of a given string. 
    String [] suffixes = new String[len];
    // Populating the array with suffixes.
    for(int i =0; i < len; i++) {
      suffixes[i] = str.substring(i);
    }
    // Sorting the array based on suffixes.
    ThreeWayRadixQuickSort.sort(suffixes);
    // Populating the suffix array with indexes corresposnding to the suffixes. 
    for(int i =0; i < len; i++) {
      suffix_array[i] = len - suffixes[i].length();
    }
  return suffix_array;
}

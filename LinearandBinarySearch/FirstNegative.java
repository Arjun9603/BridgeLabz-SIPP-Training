package LinearandBinarySearch;

public class FirstNegative {
    public static int findFirstNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 7, -2, 9, -5, 3};
        

        System.out.println(findFirstNegative(arr1)); // Output: 2
        
    }
}

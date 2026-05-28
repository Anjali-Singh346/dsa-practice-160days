public class Solution2 {
    static void nextPermutation(int arr[]) {
        int n = arr.length;
        int j = n - 2;
        while (j >= 0 && arr[j] >= arr[j + 1]) {
            j--;
        }
        if (j >= 0) {
            int i = n - 1;

            while (arr[i] <= arr[j]) {
                i--;
            }
            // Swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        // Step 3: Reverse the right part
        reverse(arr, j + 1, n - 1);

    }

    static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            end--;
            start++;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 6, 5, 4 };
        nextPermutation(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
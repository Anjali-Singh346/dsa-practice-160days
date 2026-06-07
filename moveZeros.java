public class moveZeros {
    static void moveZerostoEnd(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }
    }

    // 2nd way
    static void pushZerosToEnd(int[] arr) {
        // code here
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                if (i != index) {
                    arr[index] = arr[i];
                    arr[i] = 0;

                }
                index++;

            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 0, 4, 3, 0, 5, 0 };
        int arr1[] = { 1, 2, 0, 4, 3, 0, 5, 0 };
        moveZerostoEnd(arr);
        pushZerosToEnd(arr1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}

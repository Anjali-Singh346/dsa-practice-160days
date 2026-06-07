
//  Brute Force
public class Minimum {
    static int solve(int[] arr, int index) {
        // end reached
        if (index >= arr.length - 1) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        // try all jumps
        for (int jump = 1; jump <= arr[index]; jump++) {
            int result = solve(arr, index + jump);
            min = Math.min(min, 1 + result);
        }
        return min;
    }

    // Optimized
    static int minJumps(int[] arr) {
        int n = arr.length;
        // already at destination
        if (n == 1) {
            return 0;
        }

        // cannot move from start
        if (arr[0] == 0) {
            return -1;
        }
        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;
        for (int i = 0; i < n - 1; i++) {
            // update farthest reachable index
            farthest = Math.max(farthest, i + arr[i]);
            // current jump range finished
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
                // cannot move further
                if (currentEnd == i) {
                    return -1;
                }

                // reached end
                if (currentEnd >= n - 1) {
                    return jumps;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2 };
        System.out.println(solve(arr, 0));
        System.out.println(minJumps(arr));
    }
}

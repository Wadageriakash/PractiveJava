package dsa;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayRotator {

    /**
     * Rotates an array to the right by k steps.
     * This method uses a more functional approach with streams for clarity,
     * but for very large arrays, direct manipulation might be more performant
     * due to the overhead of boxing/unboxing and stream operations.
     *
     * @param nums The array to rotate.
     * @param k The number of steps to rotate the array to the right.
     * @return A new array representing the rotated array.
     */
    public static int[] rotateArray(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k % nums.length == 0) {
            return Arrays.copyOf(nums, nums.length); // No rotation needed or k is a multiple of length
        }

        int n = nums.length;
        k = k % n; // Normalize k to be within the array bounds (0 to n-1)

        // Using streams to create a new array with rotated elements
        // The idea is to concatenate two parts of the array:
        // 1. The last k elements
        // 2. The first n-k elements
        return IntStream.range(0, n)
                .map(i -> {
                    // Calculate the new index after rotation
                    // If i is less than k, it comes from the end of the original array
                    // If i is k or more, it comes from the beginning of the original array
                    return nums[(n - k + i) % n];
                })
                .toArray();
    }

    /**
     * Rotates an array in-place using Collections.rotate on a List.
     * This is an efficient and concise way to rotate using Java's utility classes.
     *
     * @param nums The array to rotate. This array will be modified.
     * @param k The number of steps to rotate the array to the right.
     */
    public static void rotateInPlaceWithCollections(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k % nums.length == 0) {
            return; // No rotation needed or k is a multiple of length
        }

        int n = nums.length;
        k = k % n; // Normalize k

        // Convert the int array to a List<Integer> for Collections.rotate
        List<Integer> numList = Arrays.stream(nums)
                                      .boxed()
                                      .collect(Collectors.toList());

        // Rotate the list
        Collections.rotate(numList, k);

        // Copy the rotated elements back to the original array
        IntStream.range(0, n)
                 .forEach(i -> nums[i] = numList.get(i));
    }


    /**
     * Rotates an array by reversing parts of it. This is an efficient in-place method
     * that doesn't use streams for the core rotation logic, but can be combined
     * with streams for other array operations if needed.
     * The three-step reversal algorithm:
     * 1. Reverse the whole array.
     * 2. Reverse the first k elements.
     * 3. Reverse the remaining n-k elements.
     *
     * @param nums The array to rotate. This array will be modified.
     * @param k The number of steps to rotate the array to the right.
     */
    public static void rotateInPlaceWithReversals(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k % nums.length == 0) {
            return;
        }

        int n = nums.length;
        k %= n; // Normalize k

        // Reverse the entire array
        reverse(nums, 0, n - 1);
        // Reverse the first k elements
        reverse(nums, 0, k - 1);
        // Reverse the remaining n-k elements
        reverse(nums, k, n - 1);
    }

    // Helper method to reverse a portion of an array
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;
        System.out.println("Original array: " + Arrays.toString(arr1));
        int[] rotatedArr1 = rotateArray(arr1, k1);
        System.out.println("Rotated array (using streams - new array): " + Arrays.toString(rotatedArr1)); // Expected: [5, 6, 7, 1, 2, 3, 4]

        System.out.println("\n--- In-place rotation with Collections.rotate ---");
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        int k2 = 3;
        System.out.println("Original array: " + Arrays.toString(arr2));
        rotateInPlaceWithCollections(arr2, k2);
        System.out.println("Rotated array (in-place with Collections.rotate): " + Arrays.toString(arr2)); // Expected: [5, 6, 7, 1, 2, 3, 4]

        System.out.println("\n--- In-place rotation with Reversals ---");
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7};
        int k3 = 3;
        System.out.println("Original array: " + Arrays.toString(arr3));
        rotateInPlaceWithReversals(arr3, k3);
        System.out.println("Rotated array (in-place with Reversals): " + Arrays.toString(arr3)); // Expected: [5, 6, 7, 1, 2, 3, 4]

        // Example with k > n
        int[] arr4 = {10, 20, 30};
        int k4 = 4;
        System.out.println("\nOriginal array: " + Arrays.toString(arr4));
        int[] rotatedArr4 = rotateArray(arr4, k4);
        System.out.println("Rotated array (k > n): " + Arrays.toString(rotatedArr4)); // Expected: [30, 10, 20] (rotated by 1 step)

        // Example with k = 0
        int[] arr5 = {1, 2, 3};
        int k5 = 0;
        System.out.println("\nOriginal array: " + Arrays.toString(arr5));
        int[] rotatedArr5 = rotateArray(arr5, k5);
        System.out.println("Rotated array (k = 0): " + Arrays.toString(rotatedArr5)); // Expected: [1, 2, 3]

        // Example with k = multiple of n
        int[] arr6 = {1, 2, 3};
        int k6 = 6;
        System.out.println("\nOriginal array: " + Arrays.toString(arr6));
        int[] rotatedArr6 = rotateArray(arr6, k6);
        System.out.println("Rotated array (k = multiple of n): " + Arrays.toString(rotatedArr6)); // Expected: [1, 2, 3]
    }
}
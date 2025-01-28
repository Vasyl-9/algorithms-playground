package sk.vasyl.algorithms_playground.array;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

/**
 * @author vasyl
 */
public class ArrayAssignments {

    /**
     * Finds and prints the second largest element in the array.
     * This method goes through the array by maintaining two variables
     * for the largest and second largest values.
     *
     * @param array The input array of integers to analyze.
     *              Must not be null and must contain at least two elements.
     */
    private static void arraySecondLargestElement(int[] array) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.print("ArraySecondLargestElement - ");
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second largest element: " + secondLargest);
        }
    }

    /**
     * Rotates the array to the right by one position and prints the result.
     * This method shifts all elements to the right, wrapping the last element to the front.
     *
     * @param array The input array of integers to be rotated.
     *              Must not be null and may contain any number of elements.
     */
    private static void arrayRotateRight(int[] array) {
        if (array.length == 0) return;

        int last = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = last;

        System.out.print("ArrayRotateRight - ");
        System.out.println("Result array: " + Arrays.toString(array));
    }

    /**
     * Counts and prints the frequency of each element in the array.
     * This method uses a hashmap to track and count occurrences of each element.
     *
     * @param array The input array of integers to be analyzed.
     *              Must not be null.
     */
    private static void arrayElementFrequency(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        System.out.print("ArrayElementFrequency - ");
        System.out.println("Frequencies: " + frequencyMap);
    }

    /**
     * Finds and prints the minimum and maximum elements in the given array.
     * This method iterates through the array once, comparing each element
     * to the current minimum and maximum values.
     *
     * @param array The input array of integers to be analyzed.
     *              Must not be null and must contain at least one element.
     */
    private static void arrayMinMax(int[] array) {
        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) min = array[i];
            if (array[i] > max) max = array[i];

        }
        System.out.print("ArrayMinMax - ");
        System.out.println("Minimum: " + min + " Maximum: " + max);
    }


    /**
     * Checks if the given array is a palindrome and prints the result.
     * A palindrome array reads the same forwards and backwards.
     * This method compares elements from the start and end of the array,
     * moving towards the center.
     *
     * @param array The input array of integers to be checked for palindrome property.
     *              Must not be null and can be of any length.
     */
    private static void arrayPalindrome(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - i - 1]) {
                System.out.print("ArrayPalindrome - ");
                System.out.println("The array " + Arrays.toString(array) + " array is not a palindrome.");
                return;
            }
        }
        System.out.print("ArrayPalindrome - ");
        System.out.println("The array " + Arrays.toString(array) + " is a palindrome.");
    }

    /**
     * Removes duplicate elements from the given array and prints the result.
     * This method uses a LinkedHashSet to maintain the order of unique elements,
     * then converts the set back to an array and prints it.
     *
     * @param array The input array of integers from which duplicates will be removed.
     *              Must not be null. If empty, an empty result will be printed.
     */
    private static void arrayRemoveDuplicates(int[] array) {
        Set<Integer> unique = new LinkedHashSet<>();
        for (int num : array) {
            unique.add(num);
        }

        int[] result = unique.stream().mapToInt(Integer::intValue).toArray();
        System.out.print("ArrayRemoveDuplicates - ");
        System.out.println("Result array: " + Arrays.toString(result));
    }

    /**
     * Moves all zero elements in the array to the end while maintaining the order of non-zero elements.
     * This method iterates through the array and shifts non-zero elements forward.
     *
     * @param array The input array of integers to be modified.
     *              Must not be null.
     */
    private static void arrayMoveZeroes(int[] array) {
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[index++] = array[i];
            }
        }

        while (index < array.length) {
            array[index++] = 0;
        }

        System.out.print("ArrayMoveZeroes - ");
        System.out.println("Result array: " + Arrays.toString(array));
    }

    /**
     * Calculates and prints the sum of all elements in the given array.
     * This method iterates through the array, adding each element to the sum.
     *
     * @param array The input array of integers to be summed.
     *              Must not be null.
     */
    private static void arraySum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        System.out.print("ArraySum - ");
        System.out.println("Sum of elements: " + sum);
    }

    /**
     * Reverses the elements of the given array in place and prints the result.
     * This method swaps elements from the start and end of the array,
     * moving towards the center.
     *
     * @param array The input array of integers to be reversed.
     *              Must not be null.
     */
    private static void arrayReverse(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }

        System.out.print("ArrayReverse - ");
        System.out.println("Result array: " + Arrays.toString(array));
    }

    /**
     * Checks if the given array contains a specific element and prints the result.
     * This method iterates through the array, searching for the specified element.
     *
     * @param array   The input array of integers to be searched.
     *                Must not be null.
     * @param element The element to search for in the array.
     */
    private static void arrayContainsElement(int[] array, int element) {
        boolean found = false;
        for (int num : array) {
            if (num == element) {
                found = true;
                break;
            }
        }

        System.out.print("ArrayContainsElement - ");

        System.out.println("Array: " + Arrays.toString(array) + " Element: " + element + " found: " + found);
    }

    public static void main(String[] args) {
        arrayMinMax(new int[]{10, 15, 12, 3, 6, 8});
        arrayPalindrome(new int[]{1, 2, 3, 2, 5, 1});
        arrayRemoveDuplicates(new int[]{1, 2, 3, 2, 6, 4, 2, 1, 4, 2});
        arrayMoveZeroes(new int[]{0, 1, 0, 0, 2, 0, 3, 0, 2,});
        arraySum(new int[]{1, 2, 3, 2, 5, 1});
        arrayReverse(new int[]{1, 0, 3, 2, 5, 9});
        arrayContainsElement(new int[]{1, 2, 3, 2,}, 1);
        arraySecondLargestElement(new int[]{10, 15, 12, 3, 6, 8});
        arrayRotateRight(new int[]{1, 2, 3, 4, 5});
        arrayElementFrequency(new int[]{1, 2, 3, 2, 5, 1, 1, 3});
    }
}

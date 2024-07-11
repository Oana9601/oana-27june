/*
Verificarea daca un array este monotonic (daca elementele sale sunt fie in ordine crescatoare, sau descrescatoare);
 */

public class MonotonicArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3};
        System.out.println("The array is monotonic " + isMonotonic(array));
    }

    public static boolean isMonotonic(int[] array) {
        if (array.length <= 1) {
            return true;
        }

        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                isIncreasing = false;
            }
            if (array[i] > array[i - 1]) {
                isDecreasing = false;
            }
        }

        return isIncreasing || isDecreasing;
    }
}


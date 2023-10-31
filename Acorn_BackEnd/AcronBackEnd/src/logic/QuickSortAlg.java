package logic;

public class QuickSortAlg {
    private static void quickSort(int [] array, int low, int high) {
        if (low > high) {
            return;
        }
        int i = low;
        int j = high;
        int threshold = array[low];
        // Alternately scanned from both ends of the list
        while (i < j) {
            // Find the first position less than value from right to left
            while (i < j && array[j] > threshold) {
                j--;
            } //Replace the low with a smaller number than the value
            if (i < j)
                array[i++] = array[j];
            // Find the first position greater than threshold from left to right
            while (i < j && array[i] <= threshold) {
                i++;
            } //Replace the high with a number larger than the value
            if (i < j)
                array[j--] = array[i];
        }
        array[i] = threshold;
        quickSort (array, low, i - 1); // left quickSort
        quickSort (array, i + 1, high); // right quickSort
    }

    public static void quickSort(int [] array) {
        if (array.length > 0) {
            quickSort (array, 0, array.length - 1);
        }
    }
    public static void main(String[] args) {
        int [] scores = { 90, 60, 50, 80, 70, 100 };
        quickSort (scores);
        for (int i = 0; i < scores.length ; i++) {
            System.out .print(scores[i] + "," );
        }
    }
}


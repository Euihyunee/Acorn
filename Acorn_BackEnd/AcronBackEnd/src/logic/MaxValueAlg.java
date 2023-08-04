package logic;

public class MaxValueAlg {
    public static void main(String[] args) {
        int [] scores = { 60, 50, 95, 80, 70 };
        int maxValue = max (scores);
        System.out.println("Max Value = " + maxValue);

        int minValue = min(scores);
        System.out.println("Min Value = " + minValue);

    }
    public static int max(int [] arrays) {
    // Maximum initialization value is 0
        for (int i = 0; i < arrays.length - 1; i++) {
            if (arrays[i] > arrays[i + 1]) { // swap
                int temp = arrays[i];
                arrays[i] = arrays[i + 1];
                arrays[i + 1] = temp;
            }
        }
        int maxValue = arrays[arrays.length - 1];
        return maxValue;
    }
    public static int min(int [] arrays) {
        // Maximum initialization value is 0
        for (int i = 0; i < arrays.length - 1; i++) {
            if (arrays[i] < arrays[i + 1]) { // swap
                int temp = arrays[i];
                arrays[i] = arrays[i + 1];
                arrays[i + 1] = temp;
            }
        }
        int maxValue = arrays[arrays.length - 1];
        return maxValue;
    }
    public static void printArray(int [] arrays){
        System.out.print("배열 : ");
        for (int num : arrays) {
            System.out.print(num + " ");
        }
    }
}


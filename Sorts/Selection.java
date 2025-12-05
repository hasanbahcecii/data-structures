package Sorts;

public class Selection {

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void sort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                swap(array, i, minIndex);
            }
        }

//        for (int i = 0; i < array.length; i++) {
//            int min = i;
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[j] < array[min]) {
//                    min = j;
//                }
//            }
//            swap(array, i, min);
//        }
    }
}

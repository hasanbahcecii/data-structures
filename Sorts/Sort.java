package Sorts;

public class Sort {

    public static void main(String[] args) {

        int[] array = new int[1000];
        int[] copyArray = new int[1000];
        int[] copyArray2 = new int[1000];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }

        for (int i = 0; i < array.length; i++) {
            copyArray[i] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            copyArray2[i] = array[i];
        }

        Selection.print(array);
        long start = System.nanoTime();
        Selection.sort(array);
        long end = System.nanoTime();
        Selection.print(array);
        System.out.println("\nSelection sort time: " + (end - start) + " ns");

        Insertion.print(copyArray);
        long start2 = System.nanoTime();
        Insertion.sort(copyArray);
        long end2 = System.nanoTime();
        Insertion.print(copyArray);
        System.out.println("Insertion sort time: " + (end2 - start2) + " ns");

        Bubble.print(copyArray2);
        long start3 = System.nanoTime();
        Bubble.sort(copyArray2);
        long end3 = System.nanoTime();
        Bubble.print(copyArray2);
        System.out.println("Bubble sort time: " + (end3 - start3) + " ns");

    }

}

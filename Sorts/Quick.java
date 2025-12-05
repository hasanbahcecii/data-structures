package Sorts;

public class Quick {

    public static void quickSort(int[] array, int low, int high) {

        if (low < high) {
            int pi = partition(array, low, high);

            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }

    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }

        System.out.println();
    }
}

/*
  [8,2,4,7,1,3,9,6,5]    l = 8 in indexi , h = 5 in indexi

 i = l - 1 

i++ if ten önce


partition 1 in çıktısı i + 1 değerini döndürecek  


 */

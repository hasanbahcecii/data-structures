package Sorts;

public class SortsTestDrive {
    public static void main(String[] args) {
        
        int[] arr = {8,2,4,7,1,3,9,6,5};

        Quick.quickSort(arr,0, arr.length - 1);

        Quick.print(arr);

    }
    
}

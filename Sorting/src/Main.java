import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Selection Sort
        SelectionSort selectionSort = new SelectionSort();
        int[] result = selectionSort.selection(new int[]{4, 1, 3, 9, 7});
        System.out.println("Sorted array using Selection Sort" + Arrays.toString(result));
    }
}
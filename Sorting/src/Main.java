import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Selection Sort
        SelectionSort selectionSort = new SelectionSort();
        int[] result = selectionSort.selection(new int[]{4, 1, 3, 9, 7});
        System.out.println("Sorted array using Selection Sort :- " + Arrays.toString(result));

        //Bubble Sort
        BubbleSort bubbleSort = new BubbleSort();
        int[] result1 = bubbleSort.bubble(new int[]{4, 1, 3, 9, 7});
        System.out.println("Sorted array using Bubble Sort :- "+Arrays.toString(result1));

        //Insertion Sort
        InsertionSort insertionSort = new InsertionSort();
        int[] result2 = insertionSort.insertion(new int[]{4, 1, 3, 9, 7});
        System.out.println("Sorted array using Insetion Sort :- " + Arrays.toString(result2));

        //Merge Sort
        MergeSort mergeSorted = new MergeSort();
        int[] arr = {12, 11, 13, 5, 6, 7};
        mergeSorted.mergeSort(arr, 0, arr.length - 1);
        System.out.println("sorted using the merge sort :- "+Arrays.toString(arr));

        //QuickSort
        QuickSort sorter = new QuickSort();
        int[] arr1 = {10, 7, 8, 9, 1, 5};
        sorter.quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted using the quick sort :- "+Arrays.toString(arr1));
    }
}
/*
* T.c Best O(n) worst O(n)^2 avg O(n)^2
* S.c O(1)
* */

public class InsertionSort {

    public int[] insertion(int[] arr){
        int n = arr.length;
        if(n == 0 || n == 1) return arr;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }


        return arr;
    }
}

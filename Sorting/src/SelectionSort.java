/*
* Time Complexity = O(n)
* Space Complexity = O(1)
* */
public class SelectionSort {
    public int[] selection(int[] arr){
        int n = arr.length;
        if(n == 0) return arr;

        for(int i = 0; i<n-1;i++){
            int min_index = i;
            for(int j = i+1;j<n;j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }

        return arr;
    }
}

/*
* Time Complexity O(n)
* Space Complexity O(1)
* */

public class BubbleSort {
    public int[] bubble(int[] arr){
        int n = arr.length;
        if(n == 0 ) return arr;

        for(int i = 0; i<n-1; i++){
            for(int j = i+1;j <n; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}

public class Main {
    public static void main(String[] args) {
        //Input array
        int[] arr =  new int[]{1,3,5,6};

        //Insert position
        BinnarySearch bs = new BinnarySearch();
        int result = bs.bs(arr, 5);
        System.out.println("Search insert position LC(35) :- "+result);

        //search in 2D matrix
        BinnarySearch2D binarySearch2D = new BinnarySearch2D();
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        boolean found = binarySearch2D.searchMatrix(matrix, 3);
        System.out.println("search in 2D matrix LC(74) :- " + found);

    }
}
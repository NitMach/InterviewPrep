import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        NGE2 nge2 = new NGE2();
        int[] result = nge2.nge(new int[]{1, 2, 1});
        System.out.println("NGE2 LC(503) :- "+Arrays.toString(result));


        SmallestElement smallestElement = new SmallestElement();
        int[] result1 = smallestElement.prevSmaller(new int[]{4, 5, 2, 10, 8});
        System.out.println("Nearest Smallest Element :- " + Arrays.toString(result1));
    }
}
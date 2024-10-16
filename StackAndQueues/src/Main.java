import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        NGE2 nge2 = new NGE2();
        int[] result = nge2.nge(new int[]{1, 2, 1});
        System.out.println("NGE2 LC(503) :- "+Arrays.toString(result));
    }
}
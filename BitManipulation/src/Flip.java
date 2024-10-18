public class Flip {
    public int minBitFlips(int start, int goal){
        int z = start ^ goal;
        int count = 0;
        while(z>1){
            if(z%2 != 0) count+=1;
            z = z/2;
        }
        if(z == 1) count = count +1;
        return count;
    }
}

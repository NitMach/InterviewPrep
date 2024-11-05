public class RoationOfOther {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        StringBuilder sb = new StringBuilder(goal);

        int size = s.length();
        int start = 0;
        while(start<size){
            if(s.equals(sb.toString())) return true;
            System.out.println(sb);
            char temp = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(temp);
            start += 1;
        }

        return false;
    }
}

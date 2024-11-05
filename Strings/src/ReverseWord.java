import java.util.Stack;

public class ReverseWord {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        if(s.length() == 0) return sb.toString();
        Stack<Character> stack = new Stack<>();

        int start = s.length() - 1;

        while(start >= 0){
            if(s.charAt(start) == ' '){
                while(!stack.isEmpty()){
                    sb.append(stack.pop());
                }
                if (sb.length() > 0 && sb.charAt(sb.length() - 1) != ' ') {
                    sb.append(' ');
                }
            }else{
                stack.push(s.charAt(start));
            }
            start -= 1;
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ' ') {
            sb.setLength(sb.length() - 1);
        }

        return sb.toString();
    }
}

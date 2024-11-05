import java.util.Stack;

public class OuterMostParanthesis {
    public String removeOuterParentheses(String s) {

        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        int start = 0;

        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);

            if(c == '('){
                stack.push(c);
            }else{
                stack.pop();
            }

            if(stack.isEmpty()){
                result.append(s, start + 1, i);
                start = i + 1;
            }
        }
        return result.toString();
    }
}

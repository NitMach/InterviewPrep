import java.util.*;
public class PhoneNumber {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }
        Map<Character,String> map = new HashMap<>();
        map.put('1', "");
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        List<String> result = new ArrayList<>();
        helperFunc(digits, result, 0, new StringBuffer(), map);
        return result;
    }

    private void helperFunc(String digits, List<String> result, int index, StringBuffer slate, Map<Character,String> map){
        if(index == digits.length()){
            result.add(slate.toString());
        }else{
            char curr = digits.charAt(index);
            String currString = map.get(curr);
            for (char c : currString.toCharArray()) {
                helperFunc(digits, result, index + 1, slate.append(c), map);
                slate.deleteCharAt(slate.length() - 1);
            }
        }
    }
}

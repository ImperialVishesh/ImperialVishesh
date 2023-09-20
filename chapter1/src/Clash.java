
import java.util.Stack;
class isValid {
    public boolean validParan(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop()!= c) {
                return false;
            }
        }
        return stack.isEmpty();
    }


}

public class Clash {
    public static void main(String[] args) {
        isValid str = new isValid();

        boolean ans = str.validParan("()");
        System.out.println(ans);
    }
}


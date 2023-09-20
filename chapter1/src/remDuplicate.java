import java.util.ArrayList;

class palindrome {
    void charAt(String s){
        ArrayList<Character> arr = new ArrayList<>();
        ArrayList<Character> arr1 = new ArrayList<>();
        int j = s.length()-1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            arr.add(c);
        }

        for (int i = 0; i <s.length(); i++) {
            arr1[j] = arr[i];
            j--;
        }
//        System.out.println(arr);
    }

}

public class remDuplicate {

    public static void main(String[] args) {
        palindrome str = new palindrome();
        str.charAt("123");
    }
}

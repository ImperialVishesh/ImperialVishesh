import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class KthLargestStream {
    public static void main(String[] args) {
        int k;
        Scanner in = new Scanner(System.in);
        k = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(5);
        arr.add(8);
        arr.add(2);
        arr.add(9);
        arr.add(10);
        arr.add(4);

        Collections.sort(arr);

        System.out.println(arr.get(arr.size() - k));
    }
}

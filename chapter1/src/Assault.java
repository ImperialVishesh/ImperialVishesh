import java.util.ArrayList;

public class Assault {
    public static void main(String[] args) {
        ArrayList<String> Sample = new ArrayList<>();
        Sample.add("Vishesh");
        Sample.add("Sudarshan");
        Sample.add("Shyam");
        Sample.add("Devanad");
        System.out.println("Student list with e:");

        for(String s : Sample){
            if(s.contains("e"))
                System.out.println(s);
        }
    }
}

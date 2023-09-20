
import java.util.Scanner;
class Stack{
    int top =-1;
    int[] arr = new int[5];
    void push(){
        Scanner sc = new Scanner(System.in);

        if (top == (arr.length-1)){
            System.out.println("Stack overflow");
        }else {

            System.out.println("Enter Data :");
            for(int i=0;i< arr.length;i++){
                arr[i] = sc.nextInt();
            }
        }
    }
    void display(){
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

public class Royale {
    public static void main(String[] args) {

        Stack s = new Stack();
        s.push();
        s.display();
    }
}

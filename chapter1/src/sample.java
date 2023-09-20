import java.util.Scanner;
public class sample {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
        }

    public static class Head{
        Node head = null;
        Node tail = null;

        public void kuch_bhi(){
            Scanner sc = new Scanner(System.in);
            int n;
            do {
                System.out.println("Enter the data:");
                int a = sc.nextInt();
                System.out.println("Enter 1 to continue: ");
                n = sc.nextInt();
                Node newNode = new Node(a);
                if (head == null) {
                    head = newNode;
                    tail = newNode;
                } else {
                    tail.next = newNode;
                    tail = newNode;
                }
            }while(n==1);
            }

        public void display(){
            Node current = head;
            if(head==null){
                System.out.println("Nhi 5kaam kr rha h");
            }
            while(current!= null){
                System.out.println(current.data);
                current = current.next;
            }
        }

        public void insertion_at_beg(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the data:");
            int a = sc.nextInt();
            Node newNode = new Node(a);
            if (head==null)
            {
                head = newNode;
                tail =newNode;
            }else{
                newNode.next = head.next;
                head.next = newNode;
            }
        }

        public void insertion_at_end(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the data:");
            int a = sc.nextInt();
            Node newNode = new Node(a);
            if(head == null){
                head = newNode;
                tail = newNode;
            }else{
                newNode.next = tail.next;
                tail.next = newNode;
            }
        }
    }

    public static void main(String[] args){
        Head h = new Head();
        h.kuch_bhi();
        h.display();;
//        h.insertion_at_end();
        h.insertion_at_beg();
        h.display();
    }
}

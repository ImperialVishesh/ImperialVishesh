class CreateList{
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void add(int data){
        Node newNode = new Node(data);

        if(head==null){
            head = newNode;
            tail = newNode;
        }
    }
}

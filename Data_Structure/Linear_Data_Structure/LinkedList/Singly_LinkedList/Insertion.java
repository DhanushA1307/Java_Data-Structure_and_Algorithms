package Data_Structure.Linear_Data_Structure.LinkedList.Singly_LinkedList;

public class Insertion<T>{
    public Node insertAtBegin(Node head, T data){
        if(head == null){
            head = new Node(data);
        }else{
            Node temp = new Node(data);
            temp.next = head;
            head = temp;
        }
        return head;
    }
    public Node insertAtEnd(Node head, T data){
        if(head == null){
            head = new Node(data);
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new Node(data);
        }
        return head;
    }
    public Node insertAtPosition(Node head, T data, int position){
        if(head == null){
            return (new Node(data));
        }else{
            Node temp = head;
            for(int i = 0; i < position-1; i++){
                temp = temp.next;
            }
            Node newNode = new Node(data);
            newNode.next = temp.next;
            temp.next = newNode;
        }
        return head;
    }
}
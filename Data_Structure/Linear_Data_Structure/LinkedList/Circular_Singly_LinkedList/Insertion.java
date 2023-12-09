package Data_Structure.Linear_Data_Structure.LinkedList.Circular_Singly_LinkedList;
public class Insertion<T> {
    public Node<T> insert_back(Node<T> head, Node<T> tail, T val){
        Node<T> new_node = new Node<T>(val);
        if(head == null){
            head = new_node;
            tail = new_node;
            tail.next = head;
        }else{
            tail.next = new_node;
            tail = new_node;
            tail.next = head;
        }
        return head;
    }
}

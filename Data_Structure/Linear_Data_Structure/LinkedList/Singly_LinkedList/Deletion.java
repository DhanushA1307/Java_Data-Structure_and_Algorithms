package Data_Structure.Linear_Data_Structure.LinkedList.Singly_LinkedList;
import java.util.*;

public class Deletion{
    public Node<T> delete_begin(Node<T> head){
        return (head.next);
    }
    public Node<T> delete_end(Node<T> head){
        Node<T> temp = head;
        while(temp.next.next != null) temp = temp.next;
        temp.next = null;
        return head;
    }
    public Node<T> delete_mid(Node<T> head){
        Node<T> temp = head;
        while(temp != null){
            if(temp.next == Others<T>.middle(head)){
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
}

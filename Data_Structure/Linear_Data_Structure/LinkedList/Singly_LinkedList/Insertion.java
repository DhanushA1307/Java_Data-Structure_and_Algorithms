package Data_Structure.Linear_Data_Structure.LinkedList.Singly_LinkedList;
import java.util.*;

public class insertion
{
    public Node<T> insertAtBegin(Node<T> head, T data)
    {
        if(head == null)
        {
            head = new Node<T>(data);
        }
        else
        {
            Node<T> temp = new Node<T>(data);
            temp.next = head;
            head = temp;
        }
        return head;
    }
    public Node<T> insertAtEnd(Node<T> head, T data){
        if(head == null){
            head = new Node<T>(data);
        }else{
            Node<T> temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new Node<T>(data);
        }
        return head;
    }
    public Node<T> insertAtPosition(Node<T> head, T data, int position){
        if(head == null){
            return (new Node<T>(data));
        }else{
            Node<T> temp = head;
            for(int i = 0; i < position-1; i++){
                temp = temp.next;
            }
            Node<T> newNode = new Node<T>(data);
            newNode.next = temp.next;
            temp.next = newNode;
        }
        return head;
    }
}
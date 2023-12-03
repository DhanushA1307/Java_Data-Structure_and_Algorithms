package Data_Structure.Linear_Data_Structure.LinkedList.Singly_LinkedList;
import java.util.*;

public class Node<T> insertion
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
}
package Data_Structure.Linear_Data_Structure.LinkedList.Circular_Singly_LinkedList;

public class Node<T> {
    T val;
    Node<T> next;

    Node(T val){
        this.val = val;
        this.next = null;
    }
}

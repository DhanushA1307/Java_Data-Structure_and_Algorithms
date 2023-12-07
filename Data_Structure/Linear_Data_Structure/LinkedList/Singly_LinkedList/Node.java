package Data_Structure.Linear_Data_Structure.LinkedList.Singly_LinkedList;

public class Node<T>{
    public T data;
    public Node<T> next;

    public Node(T data){
        this.data = data;
        this.next = null;
    }
}
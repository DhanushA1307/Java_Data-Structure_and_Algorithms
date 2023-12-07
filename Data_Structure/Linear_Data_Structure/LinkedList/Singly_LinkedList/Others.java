package Data_Structure.Linear_Data_Structure.LinkedList.Singly_LinkedList;

public class Others{
    public void Prints(Node<T> head){
        System.out.print("\t");
        for(Node<T> temp = head; temp != null; temp = temp.next) System.out.print(temp.data+" ");
        System.out.print("NULL\n");
    }
    public Node<T> middle(Node<T> head){
        Node<T> slow = head;
        for(Node<T> fast = head; fast != null && fast.next != null; fast = fast.next.next) slow = slow.next;
        return slow;
    }
}

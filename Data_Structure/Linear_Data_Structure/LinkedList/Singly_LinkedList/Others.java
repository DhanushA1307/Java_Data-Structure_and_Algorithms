package Data_Structure.Linear_Data_Structure.LinkedList.Singly_LinkedList;

public class Others{
    public void Prints(Node<T> head){
        System.out.print("\t");
        for(Node<T> temp = head; temp != null; temp = temp.next) System.out.print(temp.data+" ");
        System.out.print("NULL\n");
    }
}

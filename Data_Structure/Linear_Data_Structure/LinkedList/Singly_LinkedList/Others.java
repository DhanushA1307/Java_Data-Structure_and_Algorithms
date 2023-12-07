package Data_Structure.Linear_Data_Structure.LinkedList.Singly_LinkedList;

public  class Others{
    public static void Prints(Node head){
        System.out.print("\t");
        for(Node temp = head; temp != null; temp = temp.next) System.out.print(temp.data+" ");
        System.out.print("NULL\n");
    }
    public static Node middle(Node head){
        Node slow = head;
        for(Node fast = head; fast != null && fast.next != null; fast = fast.next.next) slow = slow.next;
        return slow;
    }
}

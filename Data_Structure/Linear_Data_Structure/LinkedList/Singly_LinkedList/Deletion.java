package Data_Structure.Linear_Data_Structure.LinkedList.Singly_LinkedList;

public class Deletion{    
    public Node delete_begin(Node head){
        return (head.next);
    }
    public Node delete_end(Node head){
        Node temp = head;
        while(temp.next.next != null) temp = temp.next;
        temp.next = null;
        return head;
    }
    public Node delete_mid(Node head){
        Node temp = head;
        while(temp != null){
            if(temp.next == Others.middle(head)){
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
}

package Data_Structure.Linear_Data_Structure.LinkedList.Singly_LinkedList;
import java.util.*;

public class Main{
    public static void main(String[] args){
        
        Insertion I = new Insertion();
        Deletion D = new Deletion();
        
        Node<Integer> head= null;
        Boolean cond = true;

        Scanner sc = new Scanner(System.in);
        while(cond){
            System.out.print("\n1. Insertion\n2. Deletion\n3. Others\n4. Exit\nEnter your choice: ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("\n1. Insert at begin\n2. Insert at end\n3. Insert at mid\nEnter your choice: ");
                    int ch = sc.nextInt();
                    switch(ch){
                        case 1:
                            System.out.print("Enter the data: ");
                            int data = sc.nextInt();
                            head = I.insertAtBegin(head, data);
                            break;
                        case 2:
                            System.out.print("Enter the data: ");
                            data = sc.nextInt();
                            head = I.insertAtEnd(head, data);
                            break;
                        case 3:
                            System.out.print("Enter the data: ");
                            data = sc.nextInt();
                            System.out.print("Enter the position: ");
                            int pos = sc.nextInt();
                            head = I.insertAtPosition(head, data, pos);
                            break;
                        default:
                            System.out.println("Invalid choice!");
                    }
                    break;
                case 2:
                    System.out.print("\n1. Delete at begin\n2. Delete at end\n3. Delete at mid\nEnter your choice: ");
                    ch = sc.nextInt();
                    switch(ch){
                        case 1:
                            head = D.delete_begin(head);
                            break;
                        case 2:
                            head = D.delete_end(head);
                            break;
                        case 3:
                            head = D.delete_mid(head);
                            break;
                        default:
                            System.out.println("Invalid choice!");
                    }
                    break;
                case 3:
                    System.out.print("\n1. Print\n2. Middle\nEnter your choice: ");
                    ch = sc.nextInt();
                    switch(ch){
                        case 1:
                            Others.Prints(head);
                            break;
                        case 2:
                            System.out.println("Middle: "+ Others.middle(head).data);
                            break;
                        default:
                            System.out.println("Invalid choice!");
                    }
                    break;
                case 4:
                    cond = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
        sc.close();
    }
}
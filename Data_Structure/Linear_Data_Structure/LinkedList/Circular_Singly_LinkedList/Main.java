package Data_Structure.Linear_Data_Structure.LinkedList.Circular_Singly_LinkedList;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Node<Integer> head = null;
        Boolean cond = true;
        Scanner sc = new Scanner(System.in);
        while(cond){
            System.out.println("\n1. Insertion");
            System.out.println("\n2. Deletion");
            System.out.println("\n3. Others");
            System.out.println("\n4. Exit");
            System.out.print("\nEnter your Choice:\t");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    cond = false;
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        }
        sc.close();
    }
}

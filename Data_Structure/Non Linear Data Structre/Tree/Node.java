package Data_Structure.Non Linear Data Structre.Tree;

public class Node<T>{
    T data;
    Node<T> left;
    Node<T> right;
    Node(T data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

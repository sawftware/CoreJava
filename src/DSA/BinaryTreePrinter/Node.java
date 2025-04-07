package DSA.BinaryTreePrinter;

public class Node<T> {
    public Node<T> left, right;
    public T data;
    public Node(final T data) {
        this.data = data;
    }
}
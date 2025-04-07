package DSA.BinaryTreePrinter;

public class __Print__ {
    public static void main(final String[] args) {
        final BinaryTreePrinter printer = new BinaryTreePrinter();
        printer.printNode(getBinaryTree());
    }

    public static Node<Integer> getBinaryTree() {
        final Node<Integer> root = new Node<>(4);

        final Node<Integer> n11 = new Node<>(2);
        final Node<Integer> n12 = new Node<>(5);

        final Node<Integer> n21 = new Node<>(8);
        final Node<Integer> n22 = new Node<>(7);
        final Node<Integer> n23 = new Node<>(1);
        final Node<Integer> n24 = new Node<>(9);

        final Node<Integer> n31 = new Node<>(1);
        final Node<Integer> n32 = new Node<>(8);
        final Node<Integer> n33 = new Node<>(8);
        final Node<Integer> n34 = new Node<>(4);
        final Node<Integer> n35 = new Node<>(2);
        final Node<Integer> n36 = new Node<>(0);
        final Node<Integer> n37 = new Node<>(7);
        final Node<Integer> n38 = new Node<>(8);

        final Node<Integer> n41 = new Node<>(1);
        final Node<Integer> n42 = new Node<>(4);
        final Node<Integer> n43 = new Node<>(6);
        final Node<Integer> n44 = new Node<>(1);
        final Node<Integer> n45 = new Node<>(9);
        final Node<Integer> n46 = new Node<>(3);
        final Node<Integer> n47 = new Node<>(4);
        final Node<Integer> n48 = new Node<>(6);
        final Node<Integer> n49 = new Node<>(8);
        final Node<Integer> n410 = new Node<>(1);
        final Node<Integer> n411 = new Node<>(5);
        final Node<Integer> n412 = new Node<>(2);
        final Node<Integer> n413 = new Node<>(4);
        final Node<Integer> n414 = new Node<>(9);
        final Node<Integer> n415 = new Node<>(1);
        final Node<Integer> n416 = new Node<>(2);

        root.left = n11;
        root.right = n12;

        n11.left = n21;
        n11.right = n22;
        n12.left = n23;
        n12.right = n24;

        n21.left = n31;
        n21.right = n32;
        n22.left = n33;
        n22.right = n34;
        n23.left = n35;
        n23.right = n36;
        n24.left = n37;
        n24.right = n38;

        n31.left = n41;
        n31.right = n42;
        n32.left = n43;
        n32.right = n44;
        n33.left = n45;
        n33.right = n46;
        n34.left = n47;
        n34.right = n48;
        n35.left = n49;
        n35.right = n410;
        n36.left = n411;
        n36.right = n412;
        n37.left = n413;
        n37.right = n414;
        n38.left = n415;
        n38.right = n416;

        return root;
    }
}

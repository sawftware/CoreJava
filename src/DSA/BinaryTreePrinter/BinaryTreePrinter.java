package DSA.BinaryTreePrinter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreePrinter {

    public <T> void printNode(final Node<T> root) {
        final int maxLevel = maxLevel(root);
        printNodeInternal(Collections.singletonList(root), 1, maxLevel);
    }

    private <T> void printNodeInternal(
            final List<Node<T>> nodes, final int level, final int maxLevel) {
        if (nodes.isEmpty() || isAllElementsNull(nodes)) {
            return;
        }

        int floor = maxLevel - level;
        int edgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
        int firstSpaces = (int) Math.pow(2, (floor)) - 1;
        int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

        printWhitespace(firstSpaces);

        final List<Node<T>> newNodes = new ArrayList<>();
        for (final Node<T> node : nodes) {
            if (node != null) {
                System.out.print(node.data);
                newNodes.add(node.left);
                newNodes.add(node.right);
            } else {
                newNodes.add(null);
                newNodes.add(null);
                System.out.print(" ");
            }

            printWhitespace(betweenSpaces);
        }
        System.out.println();

        for (int i = 1; i <= edgeLines; i++) {
            for (final Node<T> node : nodes) {
                printWhitespace(firstSpaces - i);
                if (node == null) {
                    printWhitespace(edgeLines + edgeLines + i + 1);
                    continue;
                }

                if (node.left != null) {
                    System.out.print("/");
                }
                else {
                    printWhitespace(1);
                }
                printWhitespace(i + i - 1);

                if (node.right != null) {
                    System.out.print("\\");
                }
                else {
                    printWhitespace(1);
                }
                printWhitespace(edgeLines + edgeLines - i);
            }
            System.out.println();
        }

        printNodeInternal(newNodes, level + 1, maxLevel);
    }

    private <T> int maxLevel(final Node<T> node) {
        if(node == null) {
            return 0;
        }

        return Math.max(
                maxLevel(node.left), maxLevel(node.right)
        ) + 1;
    }

    private void printWhitespace(final int count) {
        for(int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }

    private <T> boolean isAllElementsNull(final List<T> list) {
        for(final Object obj: list) {
            if(obj != null) {
                return false;
            }
        }
        return true;
    }
}

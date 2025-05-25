import java.util.Stack;

class TreeNode {
    int key;
    TreeNode left, right;

    TreeNode(int item) {
        key = item;
        left = right = null;
    }
}

public class BinaryTreeIterativeApproach {
    TreeNode root;

    // Insert without recursion
    public void insert(int key) {
        TreeNode newNode = new TreeNode(key);
        if (root == null) {
            root = newNode;
            return;
        }

        TreeNode current = root;
        TreeNode parent = null;

        while (current != null) {
            parent = current;
            if (key < current.key) current = current.left;
            else current = current.right;
        }

        if (key < parent.key) parent.left = newNode;
        else parent.right = newNode;
    }

    // Delete without recursion
    public void delete(int key) {
        TreeNode parent = null, current = root;

        // Search for node
        while (current != null && current.key != key) {
            parent = current;
            if (key < current.key) current = current.left;
            else current = current.right;
        }

        if (current == null) return; // Not found

        // Case 1: Node has two children
        if (current.left != null && current.right != null) {
            TreeNode successorParent = current;
            TreeNode successor = current.right;
            while (successor.left != null) {
                successorParent = successor;
                successor = successor.left;
            }
            current.key = successor.key; // Copy successor value
            current = successor;
            parent = successorParent;
        }

        // Case 2 & 3: Node has one child or no child
        TreeNode child = (current.left != null) ? current.left : current.right;

        if (parent == null) root = child; // Deleting root
        else if (parent.left == current) parent.left = child;
        else parent.right = child;
    }

    // Inorder traversal without recursion
    public void inorder() {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            System.out.print(current.key + " ");
            current = current.right;
        }
    }

    // Preorder traversal without recursion
    public void preorder() {
        if (root == null) return;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            System.out.print(node.key + " ");

            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }
    }

    // Postorder traversal without recursion
    public void postorder() {
        if (root == null) return;

        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();

        stack1.push(root);
        while (!stack1.isEmpty()) {
            TreeNode node = stack1.pop();
            stack2.push(node);
            if (node.left != null) stack1.push(node.left);
            if (node.right != null) stack1.push(node.right);
        }

        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop().key + " ");
        }
    }

    // Main method
    public static void main(String[] args) {
        BinaryTreeIterativeApproach tree = new BinaryTreeIterativeApproach();

        // Insert nodes
        int[] keys = {50, 30, 70, 20, 40, 60, 80};
        for (int key : keys) tree.insert(key);

        // Traversals
        System.out.print("Inorder: ");
        tree.inorder(); // 20 30 40 50 60 70 80
        System.out.print("\nPreorder: ");
        tree.preorder(); // 50 30 20 40 70 60 80
        System.out.print("\nPostorder: ");
        tree.postorder(); // 20 40 30 60 80 70 50

        // Delete a node
        System.out.println("\n\nDeleting 50...");
        tree.delete(50);
        System.out.print("Inorder after deletion: ");
        tree.inorder(); // Updated inorder
    }
}


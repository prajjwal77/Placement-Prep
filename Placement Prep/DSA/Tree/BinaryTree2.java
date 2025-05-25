//Resursive Approach to implement a Binary Search Tree (BST) in Java
// Tree Node class
class TreeNode {
    int key;
    TreeNode left, right;

    public TreeNode(int item) {
        key = item;
        left = right = null;
    }
}

// Binary Search Tree class
public class BinaryTree2 {
    TreeNode root;

    // Insert a node
    public TreeNode insert(TreeNode root, int key) {
        if (root == null) {
            return new TreeNode(key);
        }
        if (key < root.key) {
            root.left = insert(root.left, key);
        } else if (key > root.key) {
            root.right = insert(root.right, key);
        }
        return root;
    }

    // Delete a node
    public TreeNode delete(TreeNode root, int key) {
        if (root == null) return null;

        if (key < root.key) {
            root.left = delete(root.left, key);
        } else if (key > root.key) {
            root.right = delete(root.right, key);
        } else {
            // Node with one or no child
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            // Node with two children: get inorder successor
            root.key = minValue(root.right);
            root.right = delete(root.right, root.key);
        }
        return root;
    }

    // Get min value (used in delete)
    public int minValue(TreeNode root) {
        int min = root.key;
        while (root.left != null) {
            min = root.left.key;
            root = root.left;
        }
        return min;
    }

    // Inorder traversal (Left, Root, Right)
    public void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }

    // Preorder traversal (Root, Left, Right)
    public void preorder(TreeNode root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // Postorder traversal (Left, Right, Root)
    public void postorder(TreeNode root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.key + " ");
        }
    }

    // Main method to test
    public static void main(String[] args) {
        BinaryTree2 tree = new BinaryTree2();

        // Insert nodes
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);

        // Traversals
        System.out.println("Inorder:");
        tree.inorder(tree.root);  // 20 30 40 50 60 70 80
        System.out.println("\nPreorder:");
        tree.preorder(tree.root); // 50 30 20 40 70 60 80
        System.out.println("\nPostorder:");
        tree.postorder(tree.root); // 20 40 30 60 80 70 50

        // Delete a node
        System.out.println("\n\nDeleting 50...");
        tree.root = tree.delete(tree.root, 50);
        System.out.println("Inorder after deletion:");
        tree.inorder(tree.root);  // Updated inorder
        System.out.println();
        System.out.println("Min value in the tree: " + tree.minValue(tree.root)); // Should print 20
    }
}

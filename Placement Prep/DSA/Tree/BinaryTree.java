// Node class for BST
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

// Binary Search Tree class
class BST {
    private TreeNode root;

    public BST() {
        root = null;
    }

    // Insert operation
    public void insert(int val) {
        root = insertRecursive(root, val);
    }

    private TreeNode insertRecursive(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }

        if (val < root.val) {
            root.left = insertRecursive(root.left, val);
        } else if (val > root.val) {
            root.right = insertRecursive(root.right, val);
        }

        return root;
    }

    // Search operation
    public boolean search(int val) {
        return searchRecursive(root, val);
    }

    private boolean searchRecursive(TreeNode root, int val) {
        if (root == null) {
            return false;
        }

        if (root.val == val) {
            return true;
        } else if (val < root.val) {
            return searchRecursive(root.left, val);
        } else {
            return searchRecursive(root.right, val);
        }
    }

    // Delete operation
    public void delete(int val) {
        root = deleteRecursive(root, val);
    }

    private TreeNode deleteRecursive(TreeNode root, int val) {
        if (root == null) {
            return root;
        }

        if (val < root.val) {
            root.left = deleteRecursive(root.left, val);
        } else if (val > root.val) {
            root.right = deleteRecursive(root.right, val);
        } else {
            // Node to delete found

            // Case 1: No child or one child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Case 2: Two children
            root.val = minValue(root.right); // Replace node with the inorder successor
            root.right = deleteRecursive(root.right, root.val); // Delete the inorder successor
        }

        return root;
    }

    private int minValue(TreeNode root) {
        int minValue = root.val;
        while (root.left != null) {
            minValue = root.left.val;
            root = root.left;
        }
        return minValue;
    }

    // Inorder traversal
    public void inorder() {
        inorderRecursive(root);
        System.out.println();
    }

    private void inorderRecursive(TreeNode root) {
        if (root != null) {
            inorderRecursive(root.left);
            System.out.print(root.val + " ");
            inorderRecursive(root.right);
        }
    }

    // Preorder traversal
    public void preorder() {
        preorderRecursive(root);
        System.out.println();
    }

    private void preorderRecursive(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preorderRecursive(root.left);
            preorderRecursive(root.right);
        }
    }

    // Postorder traversal
    public void postorder() {
        postorderRecursive(root);
        System.out.println();
    }

    private void postorderRecursive(TreeNode root) {
        if (root != null) {
            postorderRecursive(root.left);
            postorderRecursive(root.right);
            System.out.print(root.val + " ");
        }
    }
}

// Main class to test BST operations
public class BinaryTree {
    public static void main(String[] args) {
        BST bst = new BST();

        // Insert nodes
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        // Print inorder traversal
        System.out.println("Inorder traversal:");
        bst.inorder();

        // Search for a node
        int searchKey = 40;
        System.out.println("Searching for " + searchKey + ": " + (bst.search(searchKey) ? "Found" : "Not Found"));

        // Delete a node
        bst.delete(30);
        System.out.println("Inorder traversal after deleting 30:");
        bst.inorder();

        // Print preorder traversal
        System.out.println("Preorder traversal:");
        bst.preorder();

        // Print postorder traversal
        System.out.println("Postorder traversal:");
        bst.postorder();
    }
}


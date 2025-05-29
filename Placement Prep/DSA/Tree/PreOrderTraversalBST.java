public class PreOrderTraversalBST {
     // Definition for a binary tree node.
     static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;

          TreeNode(int x) {
               val = x;
          }
     }
     // Pre-order traversal of a binary search tree (BST)
     public static void preOrderTraversal(TreeNode root) {
          if (root == null) {
               return;
          }
          // Visit the root node
          System.out.print(root.val + " ");
          // Traverse the left subtree
          preOrderTraversal(root.left);
          // Traverse the right subtree
          preOrderTraversal(root.right);
     }
     /**
      * Pre-order traversal of a binary search tree (BST).
      * 
      * Steps:
      * 1. Visit the root node.
      * 2. Traverse the left subtree in pre-order.
      * 3. Traverse the right subtree in pre-order.
      *
      * Time Complexity: O(n), where n is the number of nodes in the tree.
      * Space Complexity: O(h), where h is the height of the tree (due to recursion stack).
      */
     public static void main(String[] args) {
          // Example usage
          TreeNode root = new TreeNode(10);
          root.left = new TreeNode(5);
          root.right = new TreeNode(15);
          root.left.left = new TreeNode(3);
          root.left.right = new TreeNode(7);
          root.right.right = new TreeNode(20);

          System.out.println("Pre-order Traversal:");
          preOrderTraversal(root);
     }
}

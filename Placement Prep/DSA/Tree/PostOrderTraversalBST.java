public class PostOrderTraversalBST {
     // Definition for a binary tree node.
     static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;

          TreeNode(int x) {
               val = x;
          }
     }
     // Post-order traversal of a binary search tree (BST)
     //Resursive approach
     public static void postOrderTraversal(TreeNode root) {
          if (root == null) {
               return;
          }
          // Traverse the left subtree
          postOrderTraversal(root.left);
          // Traverse the right subtree
          postOrderTraversal(root.right);
          // Visit the root node
          System.out.print(root.val + " ");
     }
     /**
      * Post-order traversal of a binary search tree (BST).
      * 
      * Steps:
      * 1. Traverse the left subtree in post-order.
      * 2. Traverse the right subtree in post-order.
      * 3. Visit the root node.
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

          System.out.println("Post-order Traversal:");
          postOrderTraversal(root);
     }
}

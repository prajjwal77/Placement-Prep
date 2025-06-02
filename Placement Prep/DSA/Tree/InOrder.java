public class InOrder {

     // Definition for a binary tree node

     static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;

          TreeNode(int x) {
               val = x;
               left = null;
               right = null;
          }
     }
     // Function to perform in-order traversal of the binary tree
     public static void inOrderTraversal(TreeNode root) {
          if (root == null) {
               return;
          }
          // Traverse the left subtree
          inOrderTraversal(root.left);
          // Visit the root node
          System.out.print(root.val + " ");
          // Traverse the right subtree
          inOrderTraversal(root.right);
     }
     //Algorithm:
     // 1. Start at the root node.
     // 2. Recursively traverse the left subtree.
     // 3. Visit the root node (process the current node).
     // 4. Recursively traverse the right subtree.
     // This results in visiting nodes in the order: left, root, right.
     

     // Main method to test the in-order traversal
     public static void main(String[] args) {
           // Example usage
           TreeNode root = new TreeNode(1);
           root.left = new TreeNode(2);
           root.right = new TreeNode(3);
           root.left.left = new TreeNode(4);
           root.left.right = new TreeNode(5);
     
           System.out.println("In-order traversal:");
           inOrderTraversal(root);
     }
}

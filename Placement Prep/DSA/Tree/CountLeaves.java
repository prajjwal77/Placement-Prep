public class CountLeaves {
      // Node class for Binary Tree
     static class Node{
          int val;
          Node left;
          Node right;

          public Node(int val) {
               this.val = val;
               this.left = null;
               this.right = null;
          }
     }
     // Count leaves in a binary tree
     public static int count(Node root){
          if(root == null){
               return 0;
          }
          if(root.left == null && root.right == null){
               return 1; // Leaf node
          }
          // Recur for left and right subtrees
          return count(root.left) + count(root.right);
     }

     public static void main(String[] args) {
          // Example usage
          Node root = new Node(1);
          root.left = new Node(2);
          root.right = new Node(3);
          root.left.left = new Node(4);
          root.left.right = new Node(5);
          root.right.left = new Node(6);
          root.right.right = new Node(7);

          int leafCount = count(root);
          System.out.println("Number of leaves in the binary tree: " + leafCount); // Output: 3
     }
}

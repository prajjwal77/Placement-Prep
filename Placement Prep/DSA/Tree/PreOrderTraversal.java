
import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal {
     // Node class for Binary Tree
     static class Node {
          int val;
          Node left;
          Node right;

          public Node(int val) {
               this.val = val;
               this.left = null;
               this.right = null;
          }
     }
     // Pre-order traversal of a binary tree
     List<Integer> ans = new ArrayList<>();
     public List<Integer> preOrder(Node root) {
          if (root == null) {
               return ans;
          }
          // Visit the root
          ans.add(root.val);
          // Traverse the left subtree
          preOrder(root.left);
          // Traverse the right subtree
          preOrder(root.right);
          return ans;
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
          

          PreOrderTraversal traversal = new PreOrderTraversal();
          List<Integer> result = traversal.preOrder(root);
          System.out.println("Pre-order traversal of the binary tree: " + result); // Output: [1, 2, 4, 5, 3]
     }
}

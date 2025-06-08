import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;



public class LevelOrder {
      static class Node {
          int data;
          Node left, right;

          Node(int data) {
               this.data = data;
               this.left = null;
               this.right = null;
          }
     }

     public static ArrayList<Integer> levelOrder(Node root) {
          ArrayList<Integer> result = new ArrayList<>();
          if (root == null) {
               return result; // Return empty list if tree is empty
          }

          Queue<Node> queue = new LinkedList<>();
          queue.add(root);

          while (!queue.isEmpty()) {
               Node current = queue.poll();
               result.add(current.data); // Add current node's data to result

               // Add left and right children to the queue
               if (current.left != null) {
                    queue.add(current.left);
               }
               if (current.right != null) {
                    queue.add(current.right);
               }
          }
          return result;
     }
     public static void main(String[] args) {
          Node root = new Node(1);
          root.left = new Node(2);
          root.right = new Node(3);
          root.left.left = new Node(4);
          root.left.right = new Node(5);
          root.right.left = new Node(6);
          root.right.right = new Node(7);

          ArrayList<Integer> result = levelOrder(root);
          System.out.println("Level Order Traversal: " + result);
     }
}

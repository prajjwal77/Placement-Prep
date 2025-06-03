
import java.util.LinkedList;
import java.util.Queue;

public class BFSTraversal {
     static class TreeNode{
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) {
               val = x;
               left = null;
               right = null;
          }
     }
     public void bfsTraversal(TreeNode root) {
          if (root == null) {
               return;
          }
          Queue<TreeNode> queue = new LinkedList<>();
          queue.add(root);
          while (!queue.isEmpty()) {
               TreeNode current = queue.poll();// Remove the head of the queue
               System.out.print(current.val + " ");
               if (current.left != null) {
                    queue.add(current.left);// Add left child to the queue
               }
               if (current.right != null) {
                    queue.add(current.right);// Add right child to the queue
               }
          }
     }
     public static void main(String[] args) {
          BFSTraversal tree = new BFSTraversal();
          TreeNode root = new TreeNode(1);
          root.left = new TreeNode(2);
          root.right = new TreeNode(3);
          root.left.left = new TreeNode(4);
          root.left.right = new TreeNode(5);
          root.right.left = new TreeNode(6);
          root.right.right = new TreeNode(7);
          root.left.left.left = new TreeNode(8);
          root.left.left.right = new TreeNode(9);
          root.right.left.left = new TreeNode(10);
          root.right.left.right = new TreeNode(11);
          root.right.right.left = new TreeNode(12);
          root.right.right.right = new TreeNode(13);

          System.out.print("BFS Traversal of the tree: ");
          tree.bfsTraversal(root);
     }
}

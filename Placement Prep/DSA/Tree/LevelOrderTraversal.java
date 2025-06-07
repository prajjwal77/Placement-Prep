public class LevelOrderTraversal {
     static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
     }
     //recursive level order traversal
     public void levelOrder(TreeNode root) {
         int level = 1;// Start from level 1
           while (printLevel(root, level)) {
               level++;// Increment level after printing all nodes at the current level
           }
     }
     private boolean printLevel(TreeNode root, int level) {
         if (root == null) {
             return false;
         }
         if (level == 1) {
             System.out.print(root.val + " ");
             return true;
         }
         boolean left = printLevel(root.left, level - 1);
         boolean right = printLevel(root.right, level - 1);
         return left || right;
     }

     public static void main(String[] args) {
          TreeNode root = new TreeNode(1);
          root.left = new TreeNode(2);
          root.right = new TreeNode(3);
          root.left.left = new TreeNode(4);
          root.left.right = new TreeNode(5);
          root.right.left = new TreeNode(6);
          root.right.right = new TreeNode(7);

          LevelOrderTraversal solution = new LevelOrderTraversal();
          solution.levelOrder(root);

     }
}

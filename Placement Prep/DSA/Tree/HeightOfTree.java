public class HeightOfTree {
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
     public int heightOfTree(TreeNode root){
          if(root == null) {
               return 0;
          }
          int leftHeight = heightOfTree(root.left);
          int rightHeight = heightOfTree(root.right);
          return Math.max(leftHeight, rightHeight) + 1;
     }
     public static void main(String[] args) {
          HeightOfTree tree = new HeightOfTree();
          TreeNode root = new TreeNode(1);
          root.left = new TreeNode(2);
          root.right = new TreeNode(3);
          root.left.left = new TreeNode(4);
          root.left.right = new TreeNode(5);
          root.right.left = new TreeNode(6);
          root.right.right = new TreeNode(7);
          root.left.left.left = new TreeNode(8);
          root.left.left.right = new TreeNode(9);

          System.out.println("Height of the tree: " + tree.heightOfTree(root));
     }
}

public class IsSymmetricTree {
     //module 85 PwSKills
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
     public static boolean check(TreeNode left, TreeNode right){
          if(left == null && right == null){
               return true; // Both nodes are null, symmetric
          }
          if(left == null || right == null){
               return false; // One node is null, not symmetric
          }
          if(left.val != right.val){
               return false; // Values are different, not symmetric
          }
          // Recursively check the left and right subtrees
          return check(left.left, right.right) && check(left.right, right.left);
     }
     public static boolean isSymmetric(TreeNode root) {
        return check(root, root); // Start checking from the root
     }

     public static void main(String[] args) {
           // Example usage
           TreeNode root = new TreeNode(1);
           root.left = new TreeNode(2);
           root.right = new TreeNode(2);
           root.left.left = new TreeNode(3);
           root.left.right = new TreeNode(4);
           root.right.left = new TreeNode(4);
           root.right.right = new TreeNode(3);
     
           IsSymmetricTree tree = new IsSymmetricTree();
           boolean result = tree.isSymmetric(root);
           System.out.println("Is the tree symmetric? " + result); // Output: true
     }
}

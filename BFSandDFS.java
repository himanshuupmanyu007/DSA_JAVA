import java.util.LinkedList;
import java.util.Queue;

public class BFSandDFS {
    static class TreeNode {
        int data;
        TreeNode left, right;
        public TreeNode(int key) {
            data = key;
            left = right = null;
        }
    }
    static void preorder(TreeNode TreeNode) {
        if (TreeNode == null)
            return;
        System.out.print(TreeNode.data + " ");
        preorder(TreeNode.left);
        preorder(TreeNode.right);
    }

    static void inorder(TreeNode TreeNode) {
        if (TreeNode == null)
            return; 
        inorder(TreeNode.left);
        System.out.print(TreeNode.data + " ");
        inorder(TreeNode.right);
    }

    static void postorder(TreeNode TreeNode) {
        if (TreeNode == null)
            return;
        postorder(TreeNode.left);
        postorder(TreeNode.right);
        System.out.print(TreeNode.data + " ");
    }
   static void printLevelOrder(TreeNode root) {
       Queue<TreeNode> queue = new LinkedList<TreeNode>();
       queue.add(root);
       while (!queue.isEmpty()) {
           TreeNode tempNode = queue.poll();
           System.out.print(tempNode.data + " ");

           /*left child ko add karenge queue me  */
           if (tempNode.left != null) {
               queue.add(tempNode.left);
           }
           /*right child ko add karenge queue me */
           if (tempNode.right != null) {
               queue.add(tempNode.right);
           }
       }
   }
    public static void main(String args[])
            
    {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        System.out.println("Inorder traversal");
        inorder(root);

        System.out.println("\nPreorder traversal ");
        preorder(root);

        System.out.println("\nPostorder traversal");
       postorder(root);

        System.out.println("\nLevelorder traversal");
        printLevelOrder(root);

    }

} 


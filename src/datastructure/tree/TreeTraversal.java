package datastructure.tree;
import java.util.*;

// level order traversal
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x){
        this.val = x;
        this.left = null;
        this.right = null;
    }
    TreeNode(int x,TreeNode left,TreeNode right){
        this.val = x;
        this.left = left;
        this.right = right;
    }
}
class Level_order_traversal {
    public static List<List<Integer>> levelorder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            ArrayList<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                level.add(node.val);

                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
            result.add(level);
        }
        return result;
    }
}
public class TreeTraversal{

    static void printList(List<Integer>list){
        for(int num : list) System.out.print(num + " ");
        System.out.println();
    }
    public static void main(String[] args) {

        System.out.println("Hey!, This is for Tree");

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        List<List<Integer>> result = Level_order_traversal.levelorder(root);
//        System.out.println(result);

        for(List<Integer>level : result) printList(level);

    }
}

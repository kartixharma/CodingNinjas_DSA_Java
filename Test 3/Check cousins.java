import java.util.LinkedList;
import java.util.Queue;

class Solution {
   public static boolean isCousin(BinaryTreeNode<Integer> root, int p, int q) {
    if (root == null) 
		return false;
	Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
	queue.add(root);
	while (!queue.isEmpty()) {
		int size = queue.size();
		boolean isAexist = false;		
		boolean isBexist = false;		
		for (int i = 0; i < size; i++) {
			BinaryTreeNode<Integer> cur = queue.poll();
            if (cur.data == p) 
				isAexist = true;
            if (cur.data == q) 
				isBexist = true;
			if (cur.left != null && cur.right != null) { 
				if (cur.left.data == p && cur.right.data == q) { 
					return false;
				}
				if (cur.left.data == p && cur.right.data == q) { 
					return false;
				}
			}
			if (cur.left != null) {
				queue.add(cur.left);
			}
			if (cur.right != null) {
				queue.add(cur.right);
			}
		}
		if (isAexist && isBexist)  return true;
	}
	return false;
}
}
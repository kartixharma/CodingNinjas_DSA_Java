import java.util.LinkedList;
import java.util.Queue;
public class Solution {
    public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){
        Queue<TreeNode<Integer>> pNodes = new LinkedList<>();
        TreeNode<Integer> max = new TreeNode<>(Integer.MIN_VALUE);
        TreeNode<Integer> sMax=max;
        int data=0;
        pNodes.add(root);
        while(!pNodes.isEmpty()){
            TreeNode<Integer> fNode = pNodes.poll();
            for(TreeNode<Integer> c : fNode.children){
                pNodes.add(c);
            }
            if(fNode.data > data){
                if(fNode.data > max.data){
                    sMax = max;
                    data = max.data;
                    max = fNode;
                }
                else if (fNode.data < max.data){
                    sMax = fNode;
                    data = sMax.data;
                }
            }
        }
        return sMax;
    }
}
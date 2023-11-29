import java.util.LinkedList;
import java.util.Queue;
public class BinarySearchTree {
	private BinaryTreeNode<Integer> root;
	private BinaryTreeNode<Integer> insertHelper(int data, BinaryTreeNode<Integer> root){
		if(root==null){
			BinaryTreeNode<Integer> newR = new BinaryTreeNode<>(data);
			return newR;
		}
		else if(root.data>=data){
			root.left = insertHelper(data, root.left);
		}
		else{
			root.right = insertHelper(data, root.right);
		}
		return root;
	}
	public void insert(int data) {
		root = insertHelper(data, root);
	}
	private BinaryTreeNode<Integer> removeHelper(int data, BinaryTreeNode<Integer> root){
		if(root==null){
            return null;
        }
        if(data<root.data){
            root.left = removeHelper(data, root.left);
            return root;
        }
		else if(data>root.data){
            root.right=removeHelper(data, root.right);
            return root;
        }
		else{
            if(root.left==null && root.right==null){
                return null;
            }
			else if(root.left==null){
                return root.right;
            }
			else if(root.right==null){
                return root.left;
            }
			else{
             	BinaryTreeNode<Integer> minNode = root.right;
             	while(minNode.left!=null){
                 	minNode=minNode.left;
             	}
             	root.data=minNode.data;
             	root.right=removeHelper(minNode.data, root.right);
             	return root;   
            }
        }
	}
	public void remove(int data) {
		root = removeHelper(data, root);
	}
	private void printHelper(BinaryTreeNode<Integer> root){
		if(root==null){
            return;
		}
        String data=root.data+":";
        if(root.left!=null){
        	data+="L:"+root.left.data+",";
		}
        if(root.right!=null){
            data+="R:"+root.right.data;
		}
        System.out.println(data);
        printHelper(root.left);
        printHelper(root.right);
	}
	public void printTree() {
		printHelper(root);
	}
	private boolean searchhelper(int data, BinaryTreeNode<Integer> root){
		if(root==null){
			return false;
		}
		else if(root.data==data){
			return true;
		}
		else if(root.data>data){
			return searchhelper(data, root.left);
		}
		return searchhelper(data, root.right);	
	}
	public boolean search(int data) {
		return searchhelper(data, root);
	}
}
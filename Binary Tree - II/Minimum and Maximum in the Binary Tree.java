public class Solution {
	public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
		if(root==null){
			Pair<Integer, Integer> p = new Pair<>(Integer.MAX_VALUE, Integer.MIN_VALUE);
			return p;
		}
		Pair<Integer, Integer> p = new Pair<>(root.data, root.data);
		Pair<Integer, Integer> L =getMinAndMax(root.left);
		Pair<Integer, Integer> R =getMinAndMax(root.right);
		if(L.maximum<R.maximum){
				p.maximum=R.maximum;
		}
		else{
				p.maximum=L.maximum;
		}
		if(L.minimum>R.minimum){
				p.minimum=R.minimum;
		}
		else {
				p.minimum=L.minimum;
		}
		if(p.minimum>root.data){
			p.minimum=root.data;
		}
		if(p.maximum<root.data){
			p.maximum=root.data;
		}
		return p;
	}
}
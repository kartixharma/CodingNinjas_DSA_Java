import java.util.ArrayList;

class TrieNode{
	char data;
	boolean isTerminating;
	TrieNode children[];
	int childCount;

	public TrieNode(char data) {
		this.data = data;
		isTerminating = false;
		children = new TrieNode[26];
		childCount = 0;
	}
}

public class Trie {
	private TrieNode root;
	public int count;
	public Trie() {
		root = new TrieNode('\0');
	}

	private void add(TrieNode root, String word){
		if(word.length() == 0){
			root.isTerminating = true;
			return;
		}		
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if(child == null){
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}
		add(child, word.substring(1));
	}

	public void add(String word){
		add(root, word);
	}
	
	
	public void autoComplete(ArrayList<String> input, String word) {
        // Write your code here
		for(String w : input){
			add(w);
		}
		String out="";
		autoComplete(root, word, out);
    }
	private void autoComplete(TrieNode root, String word, String out){
		if(root==null){
			return;
		}
		if(word.length()==0){
			if(root.isTerminating){
				System.out.println(out);
			}
			for(int i=0; i<26; i++){
				if(root.children[i]!=null){
				String s = out+root.children[i].data;
				print(root.children[i], s);
				}
			}
			return;
		}
		int indx = word.charAt(0)-'a';
		out+=word.charAt(0);
		autoComplete(root.children[indx], word.substring(1), out);
	}
	private void print(TrieNode root, String s){
		if(root==null){
			return;
		}
		if(root.isTerminating){
			System.out.println(s);
		}
		for(int i=0; i<26; i++){
			if(root.children[i]!=null){
				String t =s+ root.children[i].data;
				print(root.children[i], t);
			}
		}
	}
}
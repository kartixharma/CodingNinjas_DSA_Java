
import java.util.ArrayList;

class TrieNode {
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

		if(child == null) {
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}

		add(child, word.substring(1));
	}

	public void add(String word){
		add(root, word);
	}

	private boolean search(TrieNode root, String word) {
		if(word.length() == 0) {
			return root.isTerminating;
		}

		int childIndex=word.charAt(0) - 'a';
		TrieNode child=root.children[childIndex];

		if(child == null) {
			return false;
		}

		return search(child,word.substring(1));

	}

	public boolean search(String word) {
		return search(root,word);
	}

	private void print(TrieNode root, String word) {
		if (root == null) {
			return;
		}
		
		if (root.isTerminating) {
			System.out.println(word);
		}
		
		for (TrieNode child : root.children) {
			if (child == null) {
				continue;
			}
			String fwd = word + child.data;
			print(child, fwd);
		}
	}
	
	public void print() {
		print(this.root, "");
	}





	/*..................... Palindrome Pair................... */

	private String reverse(String word){
		String rv = "";
		for(int i=word.length()-1; i>=0; i--){
			rv+=word.charAt(i);
		}
		return rv;
	}
	public boolean isPalindromePair(ArrayList<String> words) {
		//Your code goes here
		for(String word : words){
			add(reverse(word));
		}
		return isPalindromePair(root, words);
	}
	private boolean isPalindromePair(TrieNode root, ArrayList<String> words){
		if(words.size()==0){
			return false;
		}
		for(String word : words){
			if(doesPairExist(root, word, 0)){
				return true;
			}
		}
		return false;
	}
	private boolean doesPairExist(TrieNode root, String word, int si){
		if(word.length()==0){
			return true;
		}
		if(si==word.length()){
			if(root.isTerminating){
				return true;
			}
			return checkRemaining(root, "");
		}
		int indx= word.charAt(si)-'a';
		TrieNode child = root.children[indx];
		if(child==null){
			if(root.isTerminating){
				return checkPalindrome(word.substring(si));
			}
			return false;
		}
		return doesPairExist(child, word, si+1);
	}
	private boolean checkRemaining(TrieNode root, String word){
		if(root.isTerminating){
			if(checkPalindrome(word)){
				return true;
			}
		}
		for(int i=0; i<26; i++){
			TrieNode child = root.children[i];
			if(child==null){
				continue;
			}
			String fwd = child.data+word;
			if(checkRemaining(child, fwd)){
				return true;
			}
		}
		return false;
	}
	private boolean checkPalindrome(String word){
		int si=0;
		int ei=word.length()-1;
		while(si<ei){
			if(word.charAt(si)!=word.charAt(ei)){
				return false;
			}
			si++;
			ei--;
		}
		return true;
	}
} 
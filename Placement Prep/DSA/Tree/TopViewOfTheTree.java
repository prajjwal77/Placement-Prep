package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class TopViewOfTheTree {
	static class Node{
		Node left = null;
		Node right=	null;
		int val;
		
		public Node() {};
		public Node(int val) {
			this.val= val;
		}
	}
	//this class is used to find Top view of the tree 
	static class Pair{
		
		Node node;
		int hd;
		public Pair(Node node, int hd) {
			this.hd = hd;
			this.node = node;
		}
	}
	//BFS treversal
	public static List<List<Integer>> traversal(Node root) {
		List<List<Integer>> ans  = new ArrayList<>();
		if(root == null) {
			return ans;
		}
		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		while(!q.isEmpty()) {
			int size = q.size();
			List<Integer> list = new ArrayList<>();
			for(int i=0;i<size;i++) {
				Node curr = q.poll();
				list.add(curr.val);
				if(curr.left != null) {
					q.offer(curr.left);
				}
				if(curr.right != null) {
					q.offer(curr.right);
				}
			}
			ans.add(list);
		}
		return ans;
	}
	//top view of the tree
	public static List<Integer> topView(Node root){
		List<Integer> ans = new ArrayList<>();
		if(root == null) {
			return ans;
		}
		Queue<Pair> q = new LinkedList<>();
		Map<Integer, Integer> map = new TreeMap<>();
		q.offer(new Pair(root,0));
		while(!q.isEmpty()) {
			Pair curr = q.poll();
			map.putIfAbsent(curr.hd, curr.node.val);
			
			if(curr.node.left != null) {
				q.offer(new Pair(curr.node.left, curr.hd-1));
			}if(curr.node.right != null) {
				q.offer(new Pair(curr.node.right, curr.hd+1));
			}
		}
		ans.addAll(map.values());
		return ans;
	}
	
	public static void main(String[] args) {
		Node tree = new Node(1);
		tree.left = new Node(2);
		tree.right = new Node(3);
		tree.left.left = new Node(4);
		tree.left.right = new Node(5);
		tree.right.left = new Node(6);
		tree.right.right = new Node(7);
		System.out.println("Traversal of the Given Tree : "+traversal(tree));
		System.out.println("Top view of the Given  Tree : "+topView(tree));
	}
}

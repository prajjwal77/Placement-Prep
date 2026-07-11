package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//BFS
class Node1 {
	int val;
	Node1 left = null;
	Node1 right = null;

	Node1() {
	}

	Node1(int val) {
		this.val = val;
	}
}

//level order traversal recursively.........
public class LevelOrderTraversal {
	public static List<List<Integer>> levelOrder(Node1 root) {
	    // The final result list containing values for each level
	    List<List<Integer>> result = new ArrayList<>();
	    traverse(root, 0, result);
	    return result;
	}

	private static void traverse(Node1 node, int level, List<List<Integer>> result) {
	    if (node == null) {
	        return; 
	    }

	    if (level == result.size()) {
	        result.add(new ArrayList<>()); 
	    }

	    result.get(level).add(node.val);

	    traverse(node.left, level + 1, result);
	    traverse(node.right, level + 1, result);
	}
	//level order treversal like this.........
	//1 2
	//4 5 6
	//7 8 9 10 11 12
	public static void  bfs(Node1 root) {
		Queue<Node1> q = new LinkedList<>();
		q.offer(root);
		while(!q.isEmpty()) {
			int size = q.size();
			for(int i=0 ; i<size ; i++) {
				Node1 curr = q.poll();
				System.out.print(curr.val + " ");
				
				if(curr.left != null) {
					q.offer(curr.left);
				}
				if(curr.right != null) {
					q.offer(curr.right);
				}
			}
			System.out.println();
		}
	}
	
	public static ArrayList<ArrayList<Integer>> treversal(Node1 root){
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		Queue<Node1> q = new LinkedList<>();
		q.offer(root);
		while(!q.isEmpty()) {
			int size = q.size();
			ArrayList<Integer> list = new ArrayList<>();
			for(int i=0;i<size;i++) {
				Node1 curr = q.poll();
				list.add(curr.val);
				if(curr.left != null) {
					q.offer(curr.left);
				}if(curr.right != null) {
					q.offer(curr.right);
				}
			}
			result.add(list);
		}
		return result;
	}
	//height of the tree using iteration.........
	public static int heightOfTree(Node1 root) {
		Queue<Node1> q = new LinkedList<>();
		q.offer(root);
		int hieght =0;
		while(!q.isEmpty()) {
			int size = q.size();
			for(int i=0;i<size;i++) {
				Node1 curr = q.poll();
				if(curr.left != null) {
					q.offer(curr.left);
				}if(curr.right != null) {
					q.offer(curr.right);
				}
			}
			hieght++;
		}
		return hieght;
	}
	
	//average of levels.........
	public static List<Double> avgOfLevels(Node1 root){
		List<Double> result = new ArrayList<>();
		if(root == null) 
			return result;
		
		Queue<Node1> q = new LinkedList<>();
		q.offer(root);
		while(!q.isEmpty()) {
			int size = q.size();
			long sum = 0;
			for(int i=0 ; i<size ; i++) {
				Node1 curr = q.poll();
				sum += curr.val;
				if(curr.left != null) {
					q.offer(curr.left);
				}
				if(curr.right != null) {
					q.offer(curr.right);
				}
			}
			result.add((double)sum/size);
		}
		return result;
	}
	
	//Largest at every level of the  tree..........
	public static List<Integer> largestAtLevel(Node1 root){
		List<Integer> ans = new ArrayList<>();
		Queue<Node1> q = new LinkedList<>();
		q.offer(root);
		while(!q.isEmpty()) {
			int size = q.size();
			int max = Integer.MIN_VALUE;
			for(int i=0;i<size;i++) {
				Node1 curr = q.poll();
				max = Math.max(max, curr.val);
				if(curr.left!=null)
					q.offer(curr.left);
				if(curr.right!=null)
					q.offer(curr.right);
			}
			ans.add(max);
		}
		return ans;
	}
	//left view of the tree........
	public static List<Integer> leftView(Node1 root){
		List<Integer> ans = new ArrayList<>();
		Queue<Node1> q = new LinkedList<>();
		q.offer(root);
		
		while(!q.isEmpty()) {
			int size = q.size();
			for(int i=0;i<size;i++) {
				Node1 curr = q.poll();
				if(i==0) {
					ans.add(curr.val);
				}
				
				if(curr.left!=null) {
					q.offer(curr.left);
				}if(curr.right!=null) {
					q.offer(curr.right);
				}
			}
		}
		return ans;
	}
	//Right view of the tree...........
	public static List<Integer> rightView(Node1 root){
		List<Integer> ans = new ArrayList<>();
		Queue<Node1> q = new LinkedList<>();
		q.offer(root);
		while(!q.isEmpty()) {
			int size = q.size();
			for(int i=0;i<size;i++) {
				Node1 curr = q.poll();
				if(i == size-1) {
					ans.add(curr.val);
				}
				if(curr.left!= null) {
					q.offer(curr.left);
					
				}if(curr.right != null) {
					q.offer(curr.right);
				}
			}
		}
		return ans;
	}
	//Bottom Up traversal........
	public static LinkedList<List<Integer>> bottomUp(Node1 root){
		LinkedList<List<Integer>> LL = new LinkedList<>();
		Queue<Node1> q = new LinkedList<>();
		q.offer(root);
		while(!q.isEmpty()) {
			int size = q.size();
			List<Integer> level = new ArrayList<>();
			for(int i=0;i<size;i++) {
				Node1 curr = q.poll();
				level.add(curr.val);
				if(curr.left != null) {
					q.offer(curr.left);
				}if(curr.right != null) {
					q.offer(curr.right);
				}
			}
			LL.addFirst(level);
		}
		return LL;
	}
	
	//ZigZag BFS traversal.......
	public static List<List<Integer>> zigzagTraversal(Node1 root){
		List<List<Integer>> answer = new ArrayList<>();
		Queue<Node1> q = new LinkedList<>();
		q.offer(root);
		boolean leftToRight = true;
		while(!q.isEmpty()) {
			int size = q.size();
			LinkedList<Integer> level = new LinkedList<>();
			for(int i=0;i<size;i++) {
				Node1 curr = q.poll();
				if(leftToRight) {
					level.addLast(curr.val);
				}
				else{
					level.addFirst(curr.val);
				}
				
				if(curr.left != null)
					q.offer(curr.left);
				if(curr.right != null)
					q.offer(curr.right);
			}
			answer.add(level);
			leftToRight=!leftToRight;
		}
		return answer;
	}
	public static void main(String[] args) {
		Node1 root = new Node1(1);
		root.left = new Node1(2);
		root.right = new Node1(3);
		root.left.left = new Node1(4);
		root.left.right = new Node1(5);
		root.right.left = new Node1(6);
		root.right.right = new Node1(7);
		//root.left.right.left = new Node1(8);
		System.out.println("Level order traversal using recursion :");
		System.out.println(levelOrder(root));
		System.out.println("Level order traversal level wise(iteratively) :");
		bfs(root);
		System.out.println("Level order traversal using Nested List: "+treversal(root));
		System.out.println("Height of the tree : "+heightOfTree(root));
		System.out.println("Average of each levels : "+avgOfLevels(root));
		System.out.println("Largest element at every level of the tree : "+largestAtLevel(root));
		System.out.println("Left view of the tree : "+leftView(root));
		System.out.println("Right view of the tree :"+rightView(root));
		System.out.println("Bottom-Up traversal of the tree(BFS) : "+bottomUp(root));
		System.out.println("ZigZag Traversal of the Tree : "+zigzagTraversal(root));
	}
}

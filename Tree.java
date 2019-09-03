class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
	public TreeNode(int data) {
		this.data = data;
	}
}
/*
 * This class contains the implementation of a tree data structure with different traversals
 */
public class Tree {
   
	static TreeNode root;
	static TreeNode ptr;
	public void addRoot(int data) {
		root = new TreeNode(data);
	}
	public void addLeft(int data) {
		ptr.left = new TreeNode(data);
	}
	public void addRight(int data) {
		ptr.right = new TreeNode(data);
	}
	
	public void inorderTraversal() {
		inorderTraversal(root);
	}
	public void preorderTraversal() {
		preorderTraversal(root);
	}
	public void postorderTraversal() {
		postorderTraversal(root);
	}
	public void inorderTraversal(TreeNode n) {
		if(n==null) return;
		inorderTraversal(n.left);
		System.out.print(n.data+" ");
		inorderTraversal(n.right);
	}
	public void preorderTraversal(TreeNode n) {
		if(n==null) return;
		System.out.print(n.data+" ");
		inorderTraversal(n.left);
		inorderTraversal(n.right);
	}
	public void postorderTraversal(TreeNode n) {
		if(n==null) return;
		inorderTraversal(n.left);
		inorderTraversal(n.right);
		System.out.print(n.data+" ");
	}
	public static void main(String[] args) {
		
		Tree bt = new Tree();
		bt.addRoot(5);
		bt.ptr =root;
		bt.addLeft(1);
		bt.addRight(7);
		bt.ptr = ptr.right;
		bt.addLeft(6);
		bt.addRight(4);
		System.out.println("Inorder Traversal:");
		bt.inorderTraversal();
		System.out.println("\nPreOrder Traversal:");
		bt.preorderTraversal();
		System.out.println("\nPostOrder Traversal:");
		bt.postorderTraversal();

	}

}

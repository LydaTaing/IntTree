
public class IntTree {
	IntTreeNode overallRoot;

	public IntTree() {
		overallRoot = null;
	}

	private IntTree(int data) {
		overallRoot = new IntTreeNode(data);
	}

	public void printInOrder() {
		printInOrder(overallRoot);
	}

	private void printInOrder(IntTreeNode root) {
		if (root != null) {
			printInOrder(root.left);
			System.out.print(root.data + " ");
			printInOrder(root.right);
		}
		
	}

	public void printPreOrder() {
		printPreOrder(overallRoot);
	}

	private void printPreOrder(IntTreeNode root) {
		if (root != null) {
			System.out.print(root.data + " ");
			printPreOrder(root.left);
			printPreOrder(root.right);
		}

	}

	public void printPostOrder() {
		printPostOrder(overallRoot);
	}

	private void printPostOrder(IntTreeNode root) {
		if (root != null) {
			printPreOrder(root.left);
			printPreOrder(root.right);
			System.out.print(root.data + " ");
		}
		
	}
	
	public void add (int value) {
		overallRoot = add(value, overallRoot);
	}

	private IntTreeNode add(int value, IntTreeNode root) {
		if (root == null) {
			root = new IntTreeNode(value);
		} else if (value < root.data) {
			root.left = add(value, root.left);
		} else {
			root.right = add (value, root.right);
		}
		return root;
	}
	
	public boolean contain  (int value) {
		
		return contains (value, overallRoot);
	}

	private boolean contains(int value, IntTreeNode root) {
		if (root==null) {
			return false;
		}else if (root.data == value) {
			return true;
			
		}else if (value < root.data){
			return contains(value,root.left);
		}else {
			return contains(value,root.right);
		}
	}
	
	
	
}

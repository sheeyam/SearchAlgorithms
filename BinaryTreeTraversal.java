class TreeNode 
{ 
    int key; 
    TreeNode left, right; 
  
    public TreeNode(int item) 
    { 
        key = item; 
        left = right = null; 
    } 
} 

public class BinaryTreeTraversal {
	
	TreeNode root; 
	  
	BinaryTreeTraversal() 
    { 
        root = null; 
    } 

	public static void main(String[] args) {
		BinaryTreeTraversal tree = new BinaryTreeTraversal(); 
		tree.root = new TreeNode(1); 
		tree.root.left = new TreeNode(2); 
		tree.root.right = new TreeNode(3); 
		tree.root.left.left = new TreeNode(4); 
		tree.root.left.right = new TreeNode(5);
		
		// DFS
		System.out.println("PreOrder traversal of binary tree is "); 
        tree.printPreOrder(tree.root); 
  
        System.out.println("\nInOrder traversal of binary tree is "); 
        tree.printInOrder(tree.root); 
  
        System.out.println("\nPostOrder traversal of binary tree is "); 
        tree.printPostOrder(tree.root); 
        
        // BFS
        System.out.println("\nLevelOrder traversal of binary tree is "); 
        tree.printLevelOrder(tree.root);
	}
	
	private void printLevelOrder(TreeNode node) {
		int level = 1;
		while(printLevel(node, level)) {
			level++;
		}
	}

	private boolean printLevel(TreeNode node, int level) {
		if(node == null) {
			return false;
		}
		
		if(level == 1) {
			System.out.print(node.key + " ");
			return true;
		} else {
			boolean left = printLevel(node.left, level-1);
			boolean right = printLevel(node.right, level-1);
			return left || right;
		}
	}

	void printInOrder(TreeNode node) {
		if(node == null) {
			return;
		}
		
		printInOrder(node.left);
		System.out.print(node.key + " ");
		printInOrder(node.right);
	}
	
	void printPreOrder(TreeNode node){
		if(node == null) {
			return;
		}
		
		System.out.print(node.key + " ");
		printPreOrder(node.left);
		printPreOrder(node.right);
	}
	
	void printPostOrder(TreeNode node){
		if(node == null) {
			return;
		}
		
		printPostOrder(node.left);
		printPostOrder(node.right);
		System.out.print(node.key + " ");
	}
}



public class BST{
    
    class Node{
        int data;
        Node left, right;
        
        public Node(int key){
            data = key;
            left = right = null;
        }
    }
    
    Node root;
    
    void insert(int x){
        this.root = insertUtil(this.root, x);
    }
    Node insertUtil(Node root, int x){
        if(root == null){
            return new Node(x);
        }
        if(root.data < x){
            root.right = insertUtil(root.right, x);
        }
        else if(root.data > x){
            root.left = insertUtil(root.left, x);
        }
        return root;
    }
    
    
    boolean search(int x){
        return searchUtil(this.root, x);
    }
    boolean searchUtil(Node root, int x){
        if(root == null)
            return false;
        if(root.data == x)
            return true;
        
        if(root.data < x){
            return searchUtil(root.right, x);
        }
        else if(root.data > x){
            return searchUtil(root.left, x);
        }
        
        return false;
    }
    
    
    void deleteNode(int x){
        this.root = deleteNodeUtil(this.root, x);
    }
    Node deleteNodeUtil(Node root, int x){
        //1) find the Node with Value X (call this target)
        //2) find the Node with value just greater than x (call it successor)
        //3) swap the values of target Node and successor
        //4) delete successor
        if(root == null)
            return root;
        
        if(root.data < x){
            root.right = deleteNodeUtil(root.right, x);
            return root;
        }
        else if(root.data > x){
            root.left = deleteNodeUtil(root.left, x);
            return root;
        }
        
        if(root.right == null){
            return root.left;
        }
        else if(root.left == null){
            return root.right;
        }
        
        // here target node (root) has two children
        // next step is to search for successor
        
        Node parent = root;
        Node succ = root.right;
        while(succ.left != null){
            parent = succ;
            succ = succ.left;
        }
        
        //3)
        root.data = succ.data;
        
        //4) delete the succ 
        if(parent.left == succ){
            parent.left = succ.right; 
        }
        else{
            parent.right = succ.right;
        }
        
        
        return root;
    }
    
    void inorder(){
        inorderUtil(this.root);
    }
    void inorderUtil(Node root){
        if(root != null){
            inorderUtil(root.left);
            System.out.print(root.data + " ");
            inorderUtil(root.right);
        }
    }
    
	public static void main(String[] args) {
		BST tree = new BST();
		
		System.out.println("After insertion: ");
		tree.insert(10);
		tree.insert(20);
		tree.insert(50);
		tree.insert(80);
		tree.insert(70);
		tree.insert(60);
		
		System.out.println("Check if 30 exist: ");
		if(tree.search(30)){
		    System.out.println("Yes");
		}else{
		    System.out.println("No");
		}
		
		System.out.println("Check if 20 exist: ");
		if(tree.search(20)){
		    System.out.println("Yes");
		}else{
		    System.out.println("No");
		}
		
		System.out.println("Tree before deleting 20: ");
		tree.inorder();
		System.out.println();
		tree.deleteNode(20);
		
		System.out.println("\nCheck if 20 exist after deletion: ");
		if(tree.search(20)){
		    System.out.println("Yes");
		}else{
		    System.out.println("No");
		}
		
		tree.inorder();
	}
}
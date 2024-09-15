class TreeNode {
    int key;
    TreeNode left, right;

    public TreeNode(int item) {
        key = item;
        left = right = null;
    }
}

class BinarySearchTree {
    TreeNode root;

    void insert(int key) {
        root = insertRec(root, key);
    }

    TreeNode insertRec(TreeNode root, int key) {
        if (root == null) {
            return new TreeNode(key);
        }
        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    boolean search(int key) {
        return searchRec(root, key);
    }

    boolean searchRec(TreeNode root, int key) {
        if (root == null) {
            return false;
        }
        if (root.key == key) {
            return true;
        }
        if (key < root.key) {
            return searchRec(root.left, key);
        }
        return searchRec(root.right, key);
    }
}

public class Project {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        
        tree.insert(50);
        tree.insert(30);
        tree.insert(85);
        tree.insert(72);
        tree.insert(90);

        
        int searchKey = 30;
        if (tree.search(searchKey)) {
            System.out.println(searchKey + " found!");
        } else {
            System.out.println(searchKey + " not found.");
        }
    }
}

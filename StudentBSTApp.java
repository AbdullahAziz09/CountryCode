import java.util.Scanner;

class Node{
    int rollNo;
    Node left,right;

    public Node(int rollNo){
        this.rollNo = rollNo;
        left=right=null;
    }

}

class BST{
    Node root;

    public Node insert(Node root, int rollNo){
        if(root==null){
            return new Node(rollNo);
        }
        if(rollNo < root.rollNo){
            root.left = insert(root.left, rollNo);
        }else if(rollNo > root.rollNo){
            root.right = insert(root.right, rollNo);
        }

        return root;
    }

    public void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.println(root.rollNo+"");
            inorder(root.right);
        }
    }
}


public class StudentBSTApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BST bst = new BST();

        System.out.println("Enter the Number of Students: ");
        int n = scanner.nextInt();

        System.out.println("Enter Roll Numbers: ");
        for(int i=0; i<n; i++){
            int roll = scanner.nextInt();
            bst.root=bst.insert(bst.root, roll);
        }

        System.out.println("\nStudents Roll Numbers in Ascending Order: ");
        bst.inorder(bst.root);
    }
}

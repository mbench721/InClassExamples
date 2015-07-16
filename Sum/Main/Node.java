import java.util.Scanner;


public class Node {

	private Node left;

	private Node right;
	private int value;
	private int key;

	public Node(Node left,Node right,int key,int value){
		this.left = left;
		this.right = right;
		this.key = key;
		this.value = value;

	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Node tree = null;
		tree = addNode(tree,10,42);
		tree = addNode(tree,3,86);
		tree = addNode(tree, 17,30);
		tree = addNode(tree, 24 , 12);
		tree = addNode(tree,7,33);
		printTree(tree);
//		Node node1 = new Node(null,null,11,25);
//		Node node2 = new Node(null,null,14,24);
//		Node node3 = new Node(null,null,4,7);
//		Node node4 = new Node(node1,node2,12,76);
//		Node node5 = new Node(node3,node4,10,42);
//		printTree(node5);
		//		while(true){
		//			System.out.println("Enter key");
		//			int input = scan.nextInt();
		//			if(input == 0){
		//				break;
		//			}
		//			int value = getValue(node5,input);
		//			System.out.println(value);
		//		}
	}
	public static Node addNode(Node root ,int key,int value){
		Node refNode = root;
		if(root == null){
			refNode = new Node(null,null,key,value);
		}
		else if(key < root.getKey()){
			
			root.setLeft(addNode(root.getLeft(),key,value));
			
		}
		else if(key > root.getKey()){
			root.setRight(addNode(root.getRight(),key,value));
		}
		else{
			throw new Error("Key already exists");
		}
		return refNode;

	}
	private static void printTree(Node node) {

		if(node != null){
			printTree(node.getLeft());
			System.out.println(node.getKey());
			printTree(node.getRight());
		}



	}
	private static int getValue(Node node, int input) {
		if(node == null){
			return - 1;
		}
		if(input == node.getKey()){
			return node.getValue();
		}

		return getValue(node.getRight(),input);
	}
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}

}


public abstract class Node2 implements ENode {
	protected ENode leftChild;
	protected ENode rightChild;
	public Node2(ENode leftChild,ENode rightChild){
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}
	@Override
	public abstract int evaluate();
		
}

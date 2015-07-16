
public abstract class Node1 implements ENode {
	protected ENode child;

	public Node1(ENode child){
		this.child = child;
	}

	@Override
	public abstract int evaluate();
	
}

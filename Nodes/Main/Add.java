
public class Add extends Node2 {

	public Add(ENode leftChild, ENode rightChild) {
		super(leftChild, rightChild);
		
	}

	@Override
	public int evaluate() {
		
		return leftChild.evaluate() + rightChild.evaluate();
	}

}

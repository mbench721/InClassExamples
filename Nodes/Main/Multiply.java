
public class Multiply extends Node2{

	public Multiply(ENode leftChild, ENode rightChild) {
		super(leftChild, rightChild);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int evaluate() {
		// TODO Auto-generated method stub
		return leftChild.evaluate() * rightChild.evaluate();
	}

}

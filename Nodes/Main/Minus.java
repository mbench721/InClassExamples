
public class Minus extends Node1 {
	public Minus(ENode child){
		super(child);
	}

	@Override
	public int evaluate() {
		
		return 0 - child.evaluate();
	}

}


public class Constant implements ENode {
	private int value;
	
	public Constant(int value){
		this.value = value;
	}

	@Override
	public int evaluate() {
		// TODO Auto-generated method stub
		return value;
	}

}

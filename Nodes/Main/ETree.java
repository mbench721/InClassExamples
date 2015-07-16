
public class ETree {

	public static void main(String[] args) {
		
		ENode three = new Constant(3);
		ENode five = new Constant(5);
		ENode nine = new Constant(9);
		ENode add = new Add(three,five);
		ENode sub = new Minus(nine);
		ENode result = new Multiply(add,sub);
		System.out.println(result.evaluate());

	}

}

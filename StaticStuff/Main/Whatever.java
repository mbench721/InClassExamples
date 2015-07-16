
public class Whatever {
	
	int n = method1("non static initializer");
	static int m = method1(" static initializer"); // step 1
	static {
		System.out.println("ha ha ha");
	}
	static{
		int [] [] ray = new int[5][];
		ray[0] = new int[10];
		ray[1] = new int[5];
		ray[2] = new int[1];
//	for (int i = 0; i < ray.length; i++){
//		for (int j = 0; j < ray[i].length;j++){
//			System.out.print((ray[i][j]) + " ");
//		}
//		System.out.println();
//	}
	}
	public Whatever(){
		System.out.println("in the  constructor");
	}

	public static void main(String[] args) {
		System.out.println("Line 1 of main"); // step 2
		 method1("reg method call"); // step 3
		Ex.method2(); //step 4
		Whatever duh = new Whatever(); // step 5
	}
	public static int method1(String msg){
		System.out.println("inside method 1 :" + msg);
		return 1;
	}

}

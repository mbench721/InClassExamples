
public class Detector {
static boolean doesThrow = true;
	public static void main(String[] args) {
		try{
		System.out.println("start main");
		method1();
		System.out.println("End main");
		}catch(Throwable e){
			e.printStackTrace();
		}
	}
	public static void method1(){
		System.out.println("Before try");
		try{
			method2();
		} catch (Exception e){
			System.err.println("Message = " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("After catch");
	}
	public static void method2(){
		try{
		System.out.println("Starting method 2");	
		if(doesThrow){
			throw new Error ("This is our exception");
		}
		}
		catch(Error e){
			e.printStackTrace();
		}finally{
			System.out.println("Ending method 2");
		
	}
	}

}

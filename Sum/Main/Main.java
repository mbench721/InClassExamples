import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int userInput = scan.nextInt();
		System.out.println(Sum(userInput));

	}
	private static int Sum(int n){
//		int num = 1;
//		if(n != 1){
//			num = n + Sum(n - 1);
//		}
//		return num;
		
		return (n == 1) ? 1 : n + Sum(n-1);
	}

}

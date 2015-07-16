import java.util.Scanner;


public class Fibs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int userInput = scan.nextInt();
		System.out.println(Fibo(userInput));

	}
	private static int Fibo(int n){
		return (n < 2) ? 1 :  Fibo(n - 1) + Fibo(n - 2);
	}

}

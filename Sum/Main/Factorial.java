import java.util.Scanner;


public class Factorial {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number");
	int userInput = scan.nextInt();
	System.out.println(Factor(userInput));
}
private static int Factor(int n){
	
	return (n == 1) ? 1 : n * Factor(n-1);
}
}

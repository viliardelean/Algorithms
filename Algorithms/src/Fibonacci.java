
public class Fibonacci {

	public static void main(String[] args) {
		//a fibonacci number is defined by the sum of the 2 previous fibonacci numbers
		// 0 1 1 2 3 5 8 etc
	System.out.println(fibRecursion(3));

	}

	public static int fibRecursion(int n){
		if (n==0) {
			return 0;
		}
		else if (n==1) {
			return 1;
		}
		return fib(n-1)+fib(n-2);
	}
}

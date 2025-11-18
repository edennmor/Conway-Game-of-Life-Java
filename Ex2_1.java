
import java.util.Arrays;
//318744265

public class Ex2_1 {

	//1
	public static int[] primeDividers(int n) {

		if (n==0||n==1||n<0){
			int arr[]=new int [1];
			arr[0]=-1;
			return arr;

		}
		else {
			int size = numOfPrimes(n);
			int[] primes = new int[size];
			int primesIndex = 0;

			for (int i = 2; i <= n; i++) {
				while (n % i == 0) {
					primes[primesIndex++] = i;
					n /= i;
				}
			}

		return primes;
	}
	}

	public static int numOfPrimes(int n) {
		int num = n;
		int primesCounter = 0;
		for (int i = 2; i <= num; i++) {
			while (num % i == 0) {
				primesCounter++;
				num /= i;        //n=n/i
			}

		}
		return primesCounter;
	}




	public static void main(String[] args) {
		int[] a = primeDividers(72);
		String s = Arrays.toString(a);
		System.out.println(s);


		int[] b = primeDividers(4004);
		String s2 = Arrays.toString(b);
		System.out.println(s2);

		int[] c = primeDividers(-100);
		String s3 = Arrays.toString(c);
		System.out.println(s3);

		int[] d = primeDividers(0);
		String s4 = Arrays.toString(d);
		System.out.println(s4);

	}

}

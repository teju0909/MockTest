package JavaMockTest_1;

public class FibonacciSeries_2 {

	public static void main(String[] args) {
		int n=10;
		int firstNum=0;
		int SecondNum=1;
		System.out.println("Fibonacci Series Till Number :: "+n);
		for(int i=0; i<=n;i++) {
			System.out.print(firstNum+",");
			int nextNum=firstNum+SecondNum;
			firstNum=SecondNum;
			SecondNum=nextNum;
		}
	}

}

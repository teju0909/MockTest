package JavaMockTest_1;

public class LargeNumber {
	public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;
        int number3 = 30;

        if (number1 > number2) {
            if (number1 > number3) {
                System.out.println("The largest number is: " + number1);
            } else {
                System.out.println("The largest number is: " + number3);
            }
        } else {
            if (number2 > number3) {
                System.out.println("The largest number is: " + number2);
            } else {
                System.out.println("The largest number is: " + number3);
            }
        }
    }
}

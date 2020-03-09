import java.util.Scanner;

/**
 * Created by onur on 23.07.2017.
 */
public class Gcd {
    public static void main(String[] args) {
        System.out.printf("Enter two integers: ");
        Scanner input = new Scanner(System.in);

        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int gcd = 1;

        int smallerOne = (number1 > number2 ? number2 : number1);
        
        if (isDivisor(number1, number2) || isDivisor(number2, number1)){
            System.out.println("Greatest common divisor: " + smallerOne);
        } else{
            for (int divisor = 1; divisor <= smallerOne / 2; divisor++) {
                if (canBeDivide(number1, number2, divisor)) {
                    gcd = divisor;
                }
            }
            System.out.println("Greatest common divisor: " + gcd);
        }
    }

	private static boolean canBeDivide(int number1, int number2, int divisor) {
		return number1 % divisor == 0 && number2 % divisor == 0;
	}

    private static boolean isDivisor(int num1, int num2){
    	return (num1 >= num2 && num1 % num2 == 0);
    }
}

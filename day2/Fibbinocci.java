package week1.day2;

public class Fibbinocci {

	public static void main(String[] args) {

		int num1   = 0;
		int num2   = 1;
		int num;

		for(int i = 1; i <= 13; i++) {
			System.out.println(num1);

			num = num1 + num2;
			num1 = num2;
			num2 = num;
			
		}		

	}

}

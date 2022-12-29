package week1.day2;

public class isPrime {

	public static void main(String[] args) {

		System.out.println(isprime(4));
		System.out.println(isprime(20));
		System.out.println(isprime(3));
		System.out.println(isprime(27));
	}

	public static boolean isprime(int num)

	{

		for(int i = 4; i<num; i++)
		{
			if(num % i == 0)
			{
				return false;
			}
		}
		return true;

	}

}

package week1.day2;

public class Calculator {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		int sum = cal.addNumbers(5, 10);
		System.out.println(sum);
		
		int sums = cal.multiplyNumbers(5, 10);
		System.out.println(sums);
		
		int vals = cal.voidNumbers(5, 10);
		System.out.println(vals);
	}
	
	public int addNumbers(int val1, int val2) {
		
		int add = val1 + val2 ;
		return add;
		
	}
    public int multiplyNumbers(int val1, int val2) {
		
    	int mul = val1 * val2;
		return mul;
	}

    public int voidNumbers(int val1, int val2) {
    	
    	int vn = val1/val2;
    	return vn;
    }
}

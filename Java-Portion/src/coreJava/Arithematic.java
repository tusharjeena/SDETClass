package coreJava;

public class Arithematic {
	
	public static int add(int a, int b) { // Method to add 2 integers
	
		return a+b;
	}
	
	public static int sub(int a, int b) { // Method to subtract 2 integers
		return a-b;
	}
	
	public static int mult(int a, int b) { // Method to multiply 2 integers
		return a*b;
	}
	
	public static int divd(int a, int b) { // Method to divide 2 integers
		return a/b;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int sum1 = add(10,2);
		
		int sum2 = add(sum1,2);
		
		int subt = sub(sum2,2);
		
		int multi = mult(subt,2);
		
		int result = divd(multi,2);
		
		System.out.println("The result of the expression is: "+result);
		
	}

}

	
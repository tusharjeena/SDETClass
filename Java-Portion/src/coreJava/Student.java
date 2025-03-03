package coreJava;

public class Student {
	
	int age;
	int rollno;
	
	public void dispaly1() {
		
		System.out.println("First method called here");
	}
	
	public void display2() {
		
		System.out.println("Second method called here");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student ob1 = new Student();
		
		ob1.age = 32;
		ob1.rollno = 7;
		
		System.out.println("The student's age is: "+ob1.age);
		System.out.println("The student's roll number is: "+ob1.rollno);
		
		ob1.dispaly1();
		ob1.display2();
		
		Student ob2 = new Student();
		
		ob2.age = 29;
		ob2.rollno = 11;
		
		System.out.println("The student's age is: "+ob2.age);
		System.out.println("The student's roll number is: "+ob2.rollno);
		
		ob2.dispaly1();
		ob2.display2();
		

	}

}

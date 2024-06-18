
public class Student {
	// instance variables
	int rollNo;
	String name;
	float marks;
	Student(){
		System.out.println("I am a constructor");
		rollNo = 1001;
		name = "Kumar";
		marks = 63.54f;
	}
	void showDetails() {
		System.out.println("Roll No:" + rollNo +
						   " Name   :" + name +
					       " Marks  :" + marks) ;		
	}

}

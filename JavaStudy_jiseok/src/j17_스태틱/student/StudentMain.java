package j17_스태틱.student;

public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student("김준일", 1);
		Student s2 = new Student("김준일", 2);
		Student s3 = new Student("김준일", 3);
		Student s4 = new Student("김준일", 4);
		Student s5 = new Student("김준일", 5);
		
		s1.showInfo();
		s2.showInfo();
		s3.showInfo();
		s4.showInfo();
		s5.showInfo();
	}

}

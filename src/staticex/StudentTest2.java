package staticex;

public class StudentTest2 {

	public static void main(String[] args) {
		Student1 studentJang = new Student1();
		studentJang.setStudentName("장신웅");
		System.out.println(studentJang.serialNum);
		System.out.println(studentJang.studentName + "학번: " + studentJang.studentID);
		
		Student1 studentChoi = new Student1();
		studentChoi.setStudentName("최한결");
		System.out.println(studentChoi.serialNum);
		System.out.println(studentChoi.studentName + "학번: " + studentChoi.studentID);

	}

}

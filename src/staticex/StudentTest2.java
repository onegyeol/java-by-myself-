package staticex;

public class StudentTest2 {

	public static void main(String[] args) {
		Student1 studentJang = new Student1();
		studentJang.setStudentName("��ſ�");
		System.out.println(studentJang.serialNum);
		System.out.println(studentJang.studentName + "�й�: " + studentJang.studentID);
		
		Student1 studentChoi = new Student1();
		studentChoi.setStudentName("���Ѱ�");
		System.out.println(studentChoi.serialNum);
		System.out.println(studentChoi.studentName + "�й�: " + studentChoi.studentID);

	}

}

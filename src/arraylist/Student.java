package arraylist;
import java.util.ArrayList;

public class Student {
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>(); //ArrayList ����
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject(); //subject����
		subject.setSubjectName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		for(Subject s:subjectList) {
			total += s.getScorePoint();
			System.out.println("�л� " + studentName + "�� " + s.getSubjectName() + " ���� ������ " + s.getScorePoint() + "�Դϴ�.");
		}
		
		System.out.println("�л� " + studentName + "�� ������ " + total + "�Դϴ�.");
	}

}

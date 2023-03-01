package abstractex;

public abstract class NoteBook extends Computer {
	@Override
	public void display() {
		System.out.println("NoteBook display()");
	}
	/*추상 메서드 모두 구현하지 않고 display하나만 구현했기에 
	  NoteBook 클래스는 추상 메서드를 하나 가지고 있기에 추상클래스임*/
}

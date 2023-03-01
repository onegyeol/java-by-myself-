package abstractex;

public class MyNoteBook extends NoteBook {
	@Override
	public void typing() {
		System.out.println("MyNoteBook typing()");
	}
	//MyNoteBook은 모든 추상메서드가 구현됬기에 abstract 예약어 사용안함
}

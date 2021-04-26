package I01family;

/*
	메소드 재정의(overriding)
	부모에 정의되어 있는 메소드를 자식에서 재정의(OverRiding)
	재정의는 상속관계에 있을 때 자식 클래스에서 메소드를 교체할때 사용
 */
public class FamilyRun3 {

	public static void main(String[] args) {
		
		Parent parent = new Parent();
		Child3 child3 = new Child3();
		
		System.out.println("Parent == Child2: " + (parent == child3));
		
		System.out.println("Parent: money " + parent.money);
		System.out.println("Child: money " + child3.money);
		
		parent.print("부모");
		//parent.addStock(100); //부모는 자식필드, 메소드에 접근할 수 없다
		child3.print("자녀");
	}
}

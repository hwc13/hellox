package I01family;

/*
	부모가 가지고 있는 필드를 자식이 다시 정의할 수 있다
	부모의 메소드를 통해서 부모의 정의된 필드에 접근하게 되면
	자신 필드가 아닌 부모의 필드값을 참조하게 된다.
 */
public class FamilyRun2 {

	public static void main(String[] args) {
		
		Parent parent = new Parent();
		Child2 child2 = new Child2();
		
		System.out.println("Parent == Child2: " + (parent == child2));
		
		System.out.println("Parent: money " + parent.money);
		System.out.println("Child: money " + child2.money);
		
		parent.print("부모");
		child2.print("자녀");
	}
}

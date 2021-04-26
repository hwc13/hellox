package I02calc;
/*
	Calculator클래스가 final클래스이면 상속을 할수 없다
 */
public class CalcRum {

	public static void main(String[] args) {
		
		Calc calc = new Calc(1000);
		int sum = calc.compute(10);
		System.out.println("Calc: sum: " + sum);
		System.out.println("C2alc: sum: " + calc.getSum());
		
	}
}

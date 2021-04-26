package I02calc;

public class Calc {

	int sum;
	
	public Calc(){
		this.sum = 0;
	}
	
	public Calc(int sum){
		this.sum = sum;
	}
	
	public int compute(int x) {
		this.sum += x;
		return this.sum;
	}
	
	public int getSum() {
		return this.sum;
	}
}

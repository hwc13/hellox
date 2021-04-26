package I01family;

public class Child3 extends Parent{

	int money = 9000;
	
	void print(String title) {
		int parentMoney = super.money;
		System.out.printf("%s money = %d, %d / stock = %d \n", title, parentMoney, money, this.stock);
	}
	
	int stock = 11000;
	
	int addStock(int stock) {
		this.stock = stock;
		return this.stock;
	}
}

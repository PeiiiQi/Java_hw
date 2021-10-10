package Class;

public class Class09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCalculator obj = new CCalculator();
	}

}
class CCalculator{
	int a ;
	int b ;
	int c ;
	
	void set_value(int x,int y,int z) {
		a = x = 25 ;
		b = y = 3 ;
		c = z = 7 ;
	}
	void show() {
		System.out.println("abc");
	}
	int add() {
		return a+b+c;
	}
	int sub() {
		return a-b-c;
	}
	int mul() {
		return a*b*c;
	}
	int avg() {
		return (a+b+c)/3;
	}
	
}
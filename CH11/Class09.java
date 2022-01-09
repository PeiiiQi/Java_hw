package Class;

interface Math{
	void show();
	public void add(int a, int b);
	public void sub(int a, int b);
	public void mul(int a, int b);
	public void div(int a, int b);
}

interface AdvanceMath{
	public void mod(int a, int b);
	public void fac(int a);
	public void pow(int a, int b);
}

class Compute implements Math,AdvanceMath{
	public int ans;

	@Override
	public void mod(int a, int b) {
		// TODO Auto-generated method stub
		ans = a%b;
	}

	@Override
	public void fac(int a) {
		// TODO Auto-generated method stub
		ans = 1;
		for(int i=1; i<=a; i++) {
			ans*=i;
		}
	}

	@Override
	public void pow(int a, int b) {
		// TODO Auto-generated method stub
		ans = 1;
		for(int i=1; i<=b; i++) {
			ans*=a;
		}
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("ans = "+ans);
	}

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		ans = a+b;
	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		ans = a-b;
	}

	@Override
	public void mul(int a, int b) {
		// TODO Auto-generated method stub
		ans = a*b;
	}

	@Override
	public void div(int a, int b) {
		// TODO Auto-generated method stub
		ans = a/b;
	}
	
}

public class Class09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compute cmp = new Compute();
		cmp.mul(3, 5);
		cmp.show();
		cmp.mod(14, 5);
		cmp.show();
		cmp.fac(5);
		cmp.show();
	}

}

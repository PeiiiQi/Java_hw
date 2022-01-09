package Class;

interface Math{
	public void show();
	public void add(int a, int b);
	public void sub(int a, int b);
	public void mul(int a, int b);
	public void div(int a, int b);
}

class Compute implements Math{
	
	public int ans;
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

public class Class05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compute cmp = new Compute();
		cmp.mul(3, 5);
		cmp.show();
	}

}

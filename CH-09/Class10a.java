package Class;

class CRational {
	public int n;
	public int d;
	
	public void setND(int num, int den) {
		n = num;
		d = den;
	}
	public void show() {
		System.out.println(n + "/" + d);
	}
}
public class Class10a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CRational aaa = new CRational();
		aaa.setND(2, 5);
		aaa.show();
	}

}

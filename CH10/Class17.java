package Class;

class Car {
	protected String owner;
	protected String id;
	
	void show() {
		System.out.println("���D�m�W:" + owner);
		System.out.println("���P���X:" + id);
	}
	public Car(String own, String s){
		owner = own;
		id = s;
	}
}

class CColor extends Car{
	public String color;
	public CColor(String own, String s, String col) {
		super(own,s);
		color = col;
	}
	public void show() {
		 System.out.println("���D�m�W:"+owner);
		 System.out.println("���P���X:"+id);
	     System.out.println("�����C��:"+color);
	}
}

public class Class17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CColor mycar = new CColor("Riaan", "Al-2345", "Black");
		mycar.show();
	}

}

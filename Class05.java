package Class;

public class Class05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CBox box = new CBox();
		
		box.length = 1 ;
		box.width = 1 ;
		box.height = 1 ;
		
		System.out.println("length = " + box.length);
		System.out.println("width = " + box.width);
		System.out.println("height = " + box.height);
	}

}

class CBox {
	int length;
	int width;
	int height;
	
	int volume() {
		return length*width*height ;
	}
	int surfaceArea() {
		return (length*width*2)+(length*height*2)+(width*height*2);
	}
	void showData() {
		System.out.println("lenght = " + length);
		System.out.println("width = " + width);
		System.out.println("height = " + height);
	}
	void showAll() {
		System.out.println("lenght = " + length);
		System.out.println("width = " + width);
		System.out.println("height = " + height);
		System.out.println("surfaceArea = " + surfaceArea());
		System.out.println("volume = " + volume());
	}
}
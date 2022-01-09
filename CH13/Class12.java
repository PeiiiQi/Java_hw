package Class;

class NotTriangle extends Exception{
}
class EquilateralTriangle extends Exception{
}
class NotEquilateralTriangle extends Exception{
}

public class Class12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = 3;
		int c = 3;
		
		try {
			System.out.println("a = "+a+",b = "+b+",c = "+c);
			triangle(a,b,c);
		}
		catch(NotTriangle e) {
			System.out.println("不構成三角形");
		}
		catch(EquilateralTriangle e) {
			System.out.println("這是正三角形");
		}
		catch(NotEquilateralTriangle e) {
			System.out.println("這不是正三角形");
		}
	}
		
		public static void triangle(int a, int b, int c) throws NotTriangle,EquilateralTriangle,NotEquilateralTriangle{
			
		if((a+b)<c || (a+c)<b || (b+c)<a) {
			throw new NotTriangle();
		}
		else if (a==b && a==c && b==c) {
			throw new EquilateralTriangle();
		}
		else {
			throw new NotEquilateralTriangle();
		}
		
	}
	
}

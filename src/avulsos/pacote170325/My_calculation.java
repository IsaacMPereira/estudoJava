class Calculation{
	public int addition(int x, int y){
		int result = x + y;

		return result;
	}

	public int mult(int x, int y){
		int result = x * y;

		return result;
	}
}

public class My_calculation extends Calculation{
	public static void main (String args[]){
		//Calculation c = new Calculation();
		My_calculation c = new My_calculation();

		int add = c.addition(7, 3);
		System.out.println(add);

		int mul = c.mult(13, 8);
		System.out.println(mul);
	}
}

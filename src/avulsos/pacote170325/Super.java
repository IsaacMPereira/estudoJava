public class Super{
	public void display(){
		System.out.println("@1");
	}
}

class Sub extends Super{
	public void display(){
		System.out.println("@2");
	}

	public void method(){
		Sub s = new Sub();

		s.display();
		super.display();
	}

	public static void main(String args[]){
		Sub s = new Sub();

		s.method();
	}
}

public class Foo{
	public static void main(String[] args){
		Bar b = new Bar();
		System.out.println(b.go(7));	
	}
}

class Foo2{
	public void go(){
		System.out.println("Indo em go");
	}
}

class Bar extends Foo2{
	String go(int x){
		//System.out.println("String em Bar e " + x);
		return "String em Bar e " + x;
	}
}

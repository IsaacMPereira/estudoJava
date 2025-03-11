public class Dog2{
	String name;
	int age;
	String breed;

	public static void main(String[] args){
		Dog2 d1 = new Dog2();

		d1.name = "n1";
		d1.age = 2;
		d1.breed = "b1";

		System.out.println("Before: " + d1.name + " " + d1.age + " " + d1.breed);
		
		d1.name = "n2";
		d1.age = 3;
		d1.breed = "b2";

		System.out.println("After: " + d1.name + " " + d1.age + " " + d1.breed);
	}
}

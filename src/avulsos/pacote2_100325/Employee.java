package pacote2_100325;

public class Employee{
	String name;
	int age;
	String designation;

	public Employee(String name, int age, String designation){
		this.name = name;
		this.age = age;
		this.designation = designation;
	}

	public void printInfos(){
		System.out.println("Employee infos: " + this.name + " " + this.age + " " + this.designation);
	}

	public void counting(int z){
		for(int i=0; i<z; i++){
				System.out.print(i + " ");
		}
	}
}

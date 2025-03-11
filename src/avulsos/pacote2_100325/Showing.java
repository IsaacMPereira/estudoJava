package pacote2_100325;

//import Employee;

public class Showing{ 
	public static void main(String[] args){
		Employee e1 = new Employee("emp1", 37, "encarregadokkk");
		Employee e2 = new Employee("emp2", 26, "mestre de obras!!");

		e1.printInfos();
		e1.counting(10);
		System.out.println();
		e2.printInfos();
		e2.counting(3);
		System.out.println();
	}
}

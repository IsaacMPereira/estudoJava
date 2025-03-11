class Pessoa{
	String nome;

	Pessoa(String nome){
		this.nome = nome;
	}
}

public class Student extends Pessoa{
	int idade;
	int rollNo;

	Student(String nome, int idade, int rollNo){
		super(nome);
		this.idade = idade;
		this.rollNo = rollNo;
	}

	public void printDetails(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("RollNo: " + this.rollNo);
	}

	public static void main(String[] args){
		Student s1 = new Student("n1", 17, 37);
		Student s2 = new Student("n2", 18, 37);

		s1.printDetails();
		s2.printDetails();
	}
}

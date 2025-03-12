package pacote_110325;

public class Employee{
	private String nome;
	private int idade;
	private String job;

	public Employee(String nome, int idade, String job){
		this.nome = nome;
		this.idade = idade;
		this.job = job;
	}

	public void printInfo(){
		System.out.println("Infos: " + this.nome + " " + this.idade + " " + this.job);
	}

	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public int getIdade(){
		return idade;
	}
	public void setIdade(int idade){
		this.idade = idade;
	}
	public String getJob(){
		return job;
	}
	public void setJob(String job){
		this.job = job;
	}
}

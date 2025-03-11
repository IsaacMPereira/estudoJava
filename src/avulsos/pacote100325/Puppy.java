class Puppy{
	String nome;
	int idade;

	public void setIdade(int idade){
		this.idade = idade;
	}
	public int getIdade(){
		return this.idade;
	}

	Puppy(String nome){
		this.nome = nome;
	}

	public void print(){
		System.out.println("Infos: " + this.nome + " " + this.idade);
	}

	public static void main(String[] args){
		Puppy p = new Puppy("Py");
		p.setIdade(20);

		p.print();
	}
}

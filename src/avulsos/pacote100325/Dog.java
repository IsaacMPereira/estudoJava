class Dog{
	String nome;
	int idade;
	String cor;

	public void setNome(String nome){
		this.nome = nome;
	}
	public void setIdade(int idade){
		this.idade = idade;
	}
	public void setCor(String cor){
		this.cor = cor;
	}

	public void printar(){
		System.out.println("Informacoes: " + this.nome + " " + this.idade + " " + this.cor);
	}

	public static void main(String[] args){
		Dog d = new Dog();
		d.setNome("Bark");
		d.setIdade(3);
		d.setCor("Amarelo");

		d.printar();
	}
}

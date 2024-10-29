public class TreinoClasse{
	public static void main(String[] args){
		Animal a = new Animal();
		System.out.println("Resultado: " + a.Imprimir());
	}

	public static class Presas{
		public void Preas(){
			System.out.println("Presas");
		}
	}
	
	public static class Animal extends Presas{
		public String Imprimir(){
			return "Animal";
		}
	}
}

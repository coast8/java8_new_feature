public class Main1 {
	
	public static void main(String[] args) {
		
		
		List<Pessoa> listPessoas = Arrays.asList(
				new Pessoa("Eduardo", 29),
				new Pessoa("Luiz", 32), 
				new Pessoa("Bruna", 26));

		
		// Ordenando pessoas pelo nome
		//
		Collections.sort(listPessoas, (Pessoa pessoa1, Pessoa pessoa2)
				   -> pessoa1.getNome().compareTo(pessoa2.getNome()));
		
		List<Pessoa> ls = listPessoas;
		listPessoas.forEach(p -> System.out.println(p.getNome()));

		
		/****/
		
		
		// Ordenando pessoas pela idade
		//
		Collections.sort(listPessoas, (Pessoa p1, Pessoa p2) -> p1.getIdade().compareTo(p2.getIdade()));
		
		listPessoas.forEach(p -> System.out.println(p.getNome()));





		// maneira mais sofisticada. Ordenando pessoas pela idade
		// BUG
		// https://stackoverflow.com/questions/52919628/cannot-invoke-foreachno-type-de-on-the-primitive-type-void/52920245
		listPessoas.sort(Comparator.comparing(Pessoa::getIdade));
		
	}
	
	

}








public class Pessoa {

	private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	
	
}
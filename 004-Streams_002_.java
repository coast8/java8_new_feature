

https://www.oracle.com/br/technical-resources/articles/java-stream-api.html


// ==================
// Filter
// ==================

// Filter O método filter() é usado para filtrar elementos de uma stream de acordo com uma condição 
// (predicado). 
//

List<String> pessoas = new Pessoa().populaPessoas();
Stream<String> stream = pessoas.stream().filter(pessoa -> pessoa.getNacionalidade().equals("Brasil");




// ==================
// Map
// ==================

// é realizado um mapeamento com o intuito de obter apenas a idade das pessoas presentes no fluxo de dados.
// uso do método map().

List<String> pessoas = new Pessoa().populaPessoas();
Stream<Integer> stream = pessoas.stream().
filter(pessoa -> pessoa.getNacionalidade().equals("Brasil").
map(Pessoa::getIdade);


// Porém, nesse trecho de código podemos ter um problema com a utilização do método map(), 
// haja vista que seu retorno é do tipo Stream<Integer>. Esse fatogera oboxing dos valores inteiros, 
// isto é, a necessidade de converter o tipo primitivo retornado pelo método getIdade() em 
// seu correspondente objeto wrapper. Sendo assim, teremos um overhead indesejado, sobretudo 
// quando se tratar de listas grandes.

// Pensando nisso, a Streams API oferece implementações para os principais tipos primitivos, 
// a saber: IntStream, DoubleStream e LongStream. Em nosso exemplo, portanto, podemos usar o 
// IntStream para evitar o autoboxing e chamar o método mapToInt() ao invés do map().

// Outro ponto a observar nesse exemplo é a possibilidade de tirar proveito da sintaxe de method 
// reference, simplificando ainda mais o nosso código. Para verificar isso, note como, na linha 4, é 
// passado o método getIdade() da classe Pessoa como parâmetro.




// ==================
// Sorted
// ==================

List<String> pessoas = new Pessoa().populaPessoas();
Stream<String> stream = pessoas.stream().
filter(pessoa -> pessoa.getNacionalidade().equals("Brasil").
sorted(Comparator.comparing(Pessoa::getNome));

// BUG
// https://stackoverflow.com/questions/52919628/cannot-invoke-foreachno-type-de-on-the-primitive-type-void/52920245

pessoas.sort(Comparator.comparing(Pessoa::getIdade));






// ==================
// Distinct
// ==================

List<String> pessoas = new Pessoa().populaPessoas();  
Stream<String> stream = pessoas.stream().distinct(); 




// ==================
// Limit
// ==================

List<String> pessoas = new Pessoa().populaPessoas();   
Stream<String> stream = pessoas.stream().limit(2); 




// ==================
// Collect
// ==================


// O método collect() possibilita coletar os elementos de uma stream na forma de coleções, 
// convertendo uma stream para os tipos List, Set ou Map. Um exemplo de uso dessa operação 
// pode ser visto no trecho de código a seguir:

List<String> 
pessoas = new Pessoa().populaPessoas();
List<String>  pessoasComM = pessoas.stream()
									.filter(pessoa -> pessoa.startsWith("M"))
									.collect(Collectors.toList());







// ==================
// AllMatch
// ==================


List<String> 
pessoas = new Pessoa().populaPessoas();
boolean todosMexicanos = pessoas.stream().allMatch(pessoa -> pessoa.getNacionalidade().equals("Mexico"));




// ==================
// ForEach
// ==================

List<String> pessoas = new Pessoa().populaPessoas();   
pessoas.stream().forEach(pessoa -> System.out.println(pessoa.getNome())); 









package def.io;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {

	String id;       
    String nome;       
    String nacionalidade;   
    int idade;
    
    
    public Pessoa(){}   
    
    public Pessoa (String id, String nome, String nacionalidade, int idade){
           this.id = id;          
           this.nome = nome;          
	       this.nacionalidade = nacionalidade;         
	       this.idade = idade;       
       } 
    
    
    public List<Pessoa> populaPessoas(){          
        Pessoa pessoa1 = new Pessoa("p1" , "Matheus Henrique", "Brasil", 18);
        Pessoa pessoa2 = new Pessoa("p2" , "Hernandez Roja", "Mexico", 21);
        Pessoa pessoa3 = new Pessoa("p3" , "Mario Fernandes", "Canada", 22);
        Pessoa pessoa4 = new Pessoa("p4" , "Neymar Junior", "Brasil", 22);         
        
        List<Pessoa> list = new ArrayList<Pessoa>();          
        list.add(pessoa1);          
        list.add(pessoa2);          
        list.add(pessoa3);          
        list.add(pessoa4);          
        return list;      
     }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	
}
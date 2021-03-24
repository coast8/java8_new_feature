


/**
* Optional no Java 8
*
* A principal proposta deste recurso é encapsular o retorno de métodos 
* e informar se um valor do tipo <T> está presente ou ausente.
*
*/




/**
Uso:
	- Evitar erros NullPointerException.
	- Parar de fazer verificações de valor nulo do tipo if (cliente != null).
	- Escrever código mais limpo e elegante.
*/



// 1) empty - Retorna uma instância de Optional vazia.
 
Optional<Cliente> retorno = Optional.empty();




// 2) of​ - Retorna um Optional com o valor fornecido, mas o valor não pode ser nulo. 
// Se não tiver certeza de que o valor não é nulo use

Optional.ofNullable

Optional<Cliente> retorno = Optional.of(buscaCliente(cpf));




// 3) ofNullable​ - Se um valor estiver presente, retorna um Optional com o valor , caso contrário, 
// retorna um Optional vazio. Este é um dos métodos mais indicados para criar um Optional.

Optional<Cliente> retorno = Optional.ofNullable(buscaCliente(cpf));




// 4) filter​ - Se um valor estiver presente e o valor corresponder ao 
// predicado retorna um Optional com o valor, se não, retorna um Optional vazio.

Optional<Cliente> retorno = buscaCliente(cpf)
   .filter(cliente -> !cliente.getNome().isEmpty());




// 5) isPresent​ - Se um valor estiver presente retorna true, 
// se não, retorna false.

Optional<Cliente> retorno = Optional.ofNullable(buscaCliente(cpf));
if (retorno.isPresent()) {
   System.out.println("Cliente encontrado.");
} else {
   System.out.println("Cliente não encontrado.");
}




// 6) get​ - Se um valor estiver presente retorna o valor, caso contrário, lança NoSuchElementException. 
// Então para usar get é preciso ter certeza de que o Optional não está vazio.

Optional<Cliente> retorno = Optional.ofNullable(buscaCliente(cpf));
if (retorno.isPresent()) {
   Cliente cliente = retorno.get();
}




// 7) ifPresent​ - Se um valor estiver presente, 
// executa a ação no valor, caso contrário, não faz nada.

public void login(String cpf, String senha) {
   dao.buscaPorCPF(cpf).
      ifPresent(cliente -> cliente.realizaLogin(senha));
}




// 8) map​ - Se um valor estiver presente retorna um Optinal com o resultado da aplicação da função 
// de mapeamento no valor, caso contrário, retorna um Optional vazio.

if (optCliente.isPresent()) {
   String nome = optCliente.map(Cliente::getNome);
}




// 9) flatMap​ - Semelhante a map, se um valor estiver presente, 
// retorna o resultado da aplicação da função de mapeamento no valor, 
// caso contrário retorna um Optional vazio. A diferença é que flatMap pode se aplicado a um 
// mapeamento que também retorna um Optional.

Endereco endereco =
   buscaCliente(cpf).flatMap(Cliente::getEndereco).get();




// 10) orElse​ - Se um valor estiver presente, retorna o valor, 
// caso contrário, retorna o valor definido no parâmetro.

public String getNomePorCPF(String cpf) {
   return dao.buscaPorCPF(cpf).map(Cliente::getNome)
      .orElse("DESCONHECIDO");
}




// 11) orElseGet - Se um valor estiver presente, retorna o valor, 
// caso contrário, retorna o resultado produzido pelo parâmetro.

public String getNomePorCPF(String cpf) {
   return dao.buscaPorCPF(cpf).map(Cliente::getNome)
      .orElseGet(Constantes::getNomePadrao);
}




// 12) orElseThrow​ - Se um valor estiver presente, 
// retorna o valor, caso contrário, lança a exceção informada no parâmetro.

public String getNomePorCPF(String cpf) {
   return dao.buscaPorCPF(cpf).map(Cliente::getNome)
      .orElseThrow(IllegalArgumentException::new);
}




https://medium.com/@racc.costa/optional-no-java-8-e-no-java-9-7c52c4b797f1
https://docs.oracle.com/javase/9/docs/api/java/util/Optional.html
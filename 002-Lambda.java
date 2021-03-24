
https://www.devmedia.com.br/como-usar-funcoes-lambda-em-java/32826

// As funções lambda em Java tem a sintaxe definida 
// como (argumento) -> (corpo), como mostram alguns exemplos da Listagem 1.


(int a, int b) -> {  return a + b; }
() -> System.out.println("Hello World");
(String s) -> { System.out.println(s); }
() -> 42
() -> { return 3.1415 };
a -> a > 10




// Funções Lambda com as classes de Collections
// Ex 1

System.out.println("Imprime todos os elementos da lista!");
List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
for(Integer n: list) {
    System.out.println(n);
}

System.out.println("Imprime todos os elementos da lista!");
List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
list.forEach(n -> System.out.println(n));




// Nesse exemplo é possível verificar que dentro de uma expressão 
// lambda pode ser realizado qualquer tipo de operação.
// Ex2

System.out.println("Imprime todos os elementos pares da lista!");
List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
list.forEach(n -> {
       if (n % 2 == 0) {
             System.out.println(n);
       }                   
});



// Mais um exemplo do que pode ser feito com funções lambda, 
// são expressões matemáticas.

System.out.println("Imprime o quadrado de todos os elementos da lista!");
List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
list.forEach(n -> System.out.println(n * n));


// https://www.oracle.com/br/technical-resources/articles/java-stream-api.html

// java.util.stream
// java.util.map




# intermediate operations:

 filter(), 
 sorted() 
 map() 


 	- As operações stateless:
	 	 não armazenam o estado do elemento manipulado anteriormente ao processar um novo elemento.
	 	 
	 	filter()
	 	map()

	- operações stateful:
		incorporar o estado do elemento processado anteriormente no processamento de novos elementos.

		distinct()
		sorted(),


# terminal operation:
//ends the stream and returns a list.
collect() 
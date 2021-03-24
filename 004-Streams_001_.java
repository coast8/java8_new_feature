



https://www.oracle.com/br/technical-resources/articles/java-stream-api.html




// Criação de uma stream a partir de um List.   
//
List<String> items = new ArrayList<String>();
      items.add("um");
      items.add("dois");
      items.add("três");
    Stream<String> stream = items.stream();




// O método stream() também foi adicionado à interface java.util.map.
//
Map <String, String> map = new HashMap<String, String>();        
   map.put("key1", "abacate");     
   map.put("key2", "melancia");     
   map.put("key3", "manga");      
   Stream<String> stream = map.values().stream();



// uma stream pode ser gerada a partir de I/O, arrays e valores
//
Stream<Integer> numbersFromValues = Stream.of(1, 2, 3, 4, 5);
  IntStream numbersFromArray = Arrays.stream(new int[] {1, 2, 3, 4, 5});




/**
 * Por sua vez, para criar uma stream de linhas a partir do conteúdo 
 * de um arquivo texto (I/O), podemos chamar o método estático Files.lines(Path path). 
 * No código a seguir, por exemplo, é possível descobrir a quantidade de linhas que um arquivo possui:
*/

Stream <String> lines= Files.lines(Paths.get(“myFile.txt”),       
Charset.defaultCharset()); 
long numbersLines = lines.count();
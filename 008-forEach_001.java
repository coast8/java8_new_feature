


//
//  scenario 01
//

System.out.println("Imprime todos os elementos da lista!");
List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
list.forEach(
			n -> 
			//callS();
			System.out.println(n)
		);

private static void callS() {
	System.out.println("ret callS =====> ");
}






//
//  scenario 02
//

System.out.println("Imprime todos os elementos pares da lista!");
List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
list.forEach(n -> {
       if (n % 2 == 0) {
             System.out.println(n);
       }
});






//
//
//
System.out.println("Imprime o quadrado de todos os elementos da lista!");
List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
list.forEach(n -> System.out.println(n * n));
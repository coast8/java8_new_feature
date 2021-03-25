


Java Time, Pacote novo criado para utilização da API 8


https://cursos.alura.com.br/course/java8-lambdas/task/5244
https://www.w3schools.com/java/java_date.asp
https://docs.oracle.com/javase/8/docs/api/index.html?java/time/package-summary.html






// ###############################
//
// LocalDate
//
// ###############################



LocalDate hoje = LocalDate.now();
System.out.println(hoje); //2014-05-28




// Vamos agora calcular a diferença de anos entre essas duas datas
//
LocalDate olimpiadasRio = LocalDate.of(2016, Month.JUNE, 5);
int anos = olimpiadasRio.getYear() - hoje.getYear();
System.out.println(anos);




// Para saber a diferença entre duas datas podemos 
// utilizar seu método between, da seguinte forma:
Period periodo = Period.between(hoje, olimpiadasRio);
System.out.println(periodo); // exemplo seria: P2Y8D.

Period periodo = Period.between(hoje, olimpiadasRio);
System.out.println(periodo.getYears());
System.out.println(periodo.getMonths());
System.out.println(periodo.getDays());





// Incrementando e decrementando suas datas
//
System.out.println(hoje.minusYears(1));
System.out.println(hoje.minusMonths(4));
System.out.println(hoje.minusDays(2));

System.out.println(hoje.plusYears(1));
System.out.println(hoje.plusMonths(4));
System.out.println(hoje.plusDays(2));

LocalDate proximasOlimpiadas = olimpiadasRio.plusYears(4); // deve fazer dessa dorma, porq a API é imutável
System.out.println(proximasOlimpiadas);










// ###############################
//
// Formatando suas datas
//
// ###############################



// How to parse/format dates with LocalDateTime? (Java 8)
// https://stackoverflow.com/questions/22463062/how-to-parse-format-dates-with-localdatetime-java-8

String str = "1986-04-08 12:30";
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
LocalDateTime dateTime = LocalDateTime.parse(str, formatter);

DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
LocalDateTime dateTime = LocalDateTime.of(1986, Month.APRIL, 8, 12, 30);
String formattedDateTime = dateTime.format(formatter); // "1986-04-08 12:30"





DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
String valorFormatado = proximasOlimpiadas.format(formatador);
System.out.println(valorFormatado);






// ###############################
//
// Trabalhando com medida de tempo
//
// ###############################


LocalDateTime agora = LocalDateTime.now();
DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
LocalDateTime agora = LocalDateTime.now();
System.out.println(agora.format(formatadorComHoras));



YearMonth anoEMes = YearMonth.of(2015, Month.JANUARY);
LocalTime intervalo = LocalTime.of(12, 30);
System.out.println(intervalo);















// ###############################
//
// Trabalhando com time
//
// ###############################

https://stackoverflow.com/questions/5175728/how-to-get-the-current-date-time-in-java






// ###############################
//
// Trabalhando com time
//
// ###############################

https://www.devmedia.com.br/como-manipular-datas-com-o-java-8/34135
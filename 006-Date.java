


// Java Time java.time, New package created for the use of API 8.


// ###############################
//
// LocalDate
//
// ###############################


// displaying current date
LocalDate today = LocalDate.now();
System.out.println(today); //2014-05-28


// years difference between these two dates
LocalDate olympics = LocalDate.of(2016, Month.JUNE, 5);
int YearsDifference = today.getYear() - olympics.getYear();
System.out.println(YearsDifference);


// difference between two dates we can
Period timeCourse = Period.between(olympics, today);
System.out.println(timeCourse.getYears());
System.out.println(timeCourse.getMonths());
System.out.println(timeCourse.getDays());


// Incrementing and decrementing your dates
System.out.println(timeCourse.minusYears(1));
System.out.println(timeCourse.minusMonths(4));
System.out.println(timeCourse.minusDays(2));

System.out.println(timeCourse.plusYears(1));
System.out.println(timeCourse.plusMonths(4));
System.out.println(timeCourse.plusDays(2));


// should make this sleeper, because the API is immutable.
LocalDate olympicsNext1 = olympics.minusYears(4); 
LocalDate olympicsNext2 = olympics.plusYears(4); 
System.out.println(olympicsNext1);
System.out.println(olympicsNext2);


// difference
DateTime inicio = new DateTime(2012, 2, 28, 0, 0, 0, 0);
DateTime fim = new DateTime(2013, 8, 28, 13, 30, 0, 0);
System.out.println(Months.monthsBetween(inicio, fim).getMonths




// ###############################
//
// LocalDateTime
//
// ###############################


// How to parse/format dates with LocalDateTime? (Java 8)
//
// https://stackoverflow.com/questions/22463062/how-to-parse-format-dates-with-localdatetime-java-8
//
// https://stackoverflow.com/questions/5175728/how-to-get-the-current-date-time-in-java
//
// https://www.devmedia.com.br/como-manipular-datas-com-o-java-8/34135

String str = "1986-04-08 12:30";
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
LocalDateTime dateTime = LocalDateTime.parse(str, formatter);


DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
LocalDateTime dateTime = LocalDateTime.of(1986, Month.APRIL, 8, 12, 30);
String formattedDateTime = dateTime.format(formatter); // "1986-04-08 12:30"


DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
String valorFormatado = proximasOlimpiadas.format(formatador);
System.out.println(valorFormatado);


// working with time
LocalDateTime agora = LocalDateTime.now();
DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
LocalDateTime agora = LocalDateTime.now();
System.out.println(agora.format(formatadorComHoras));


YearMonth anoEMes = YearMonth.of(2015, Month.JANUARY);
LocalTime intervalo = LocalTime.of(12, 30);
System.out.println(intervalo);

		   
		   
// refereces:


https://www.w3schools.com/java/java_date.asp
https://docs.oracle.com/javase/8/docs/api/index.html?java/time/package-summary.html

https://www.guj.com.br/t/calcular-diferenca-de-meses-entre-duas-datas/72093/13
https://stackoverflow.com/questions/13037654/subtract-two-dates-in-java
https://stackoverflow.com/questions/1555262/calculating-the-difference-between-two-java-date-instances?noredirect=1&lq=1
https://www.joda.org/joda-time/

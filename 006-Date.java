


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


















# learn

https://www.guj.com.br/t/calcular-diferenca-de-meses-entre-duas-datas/72093/13
https://stackoverflow.com/questions/13037654/subtract-two-dates-in-java
https://stackoverflow.com/questions/1555262/calculating-the-difference-between-two-java-date-instances?noredirect=1&lq=1


https://www.joda.org/joda-time/








-- 2
--

import java.util.Date;
import java.text.SimpleDateFormat;
public class MyClass {
    public static void main(String args[]) {

        Date myDate = new Date();
        System.out.println(myDate);
        System.out.println(new SimpleDateFormat("MM-dd-yyyy").format(myDate));
        System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(myDate));
        System.out.println(myDate);
      
    }
}



# java 7 - conversao  yyyy-mm-dd
https://stackoverflow.com/questions/18480633/java-util-date-format-conversion-yyyy-mm-dd-to-mm-dd-yyyy
https://www.tutorialspoint.com/java/java_date_time.htm
https://docs.oracle.com/javase/7/docs/api/java/sql/Date.html
https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
















--
--

	/**
	 * Valida o formato da data
	 * 
	 * @param data
	 *            data informada
	 * @return true se estiver no formato correto ou false se estiver no formato incorreto
	 */
	public static boolean isValid(String data) {
		// Define a expressão regex
		StringBuilder sb = new StringBuilder();
		sb.append("^(((0[1-9]|[12]\d|3[01])\/(0[13578]");
		sb.append("|1[02])\/((1[6-9]|[2-9]\d)\d{2}))|");
		sb.append("((0[1-9]|[12]\d|30)\/(0[13456789]|");
		sb.append("1[012])\/((1[6-9]|[2-9]\d)\d{2}))|((0[1-9]|");
		sb.append("1\d|2[0-8])\/02\/((1[6-9]|[2-9]\d)\d{2}))|");
		sb.append("(29\/02\/((1[6-9]|[2-9]\d)(0[48]|");
		sb.append("[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))))$");
		String regex = sb.toString();

		// Define a string de pattern para realizar validação
		Pattern pattern = Pattern.compile(regex);
		// Passa a string para ser validada com base na sequencia definida
		Matcher matcher = pattern.matcher(data);

		// Retorna true ou false de acordo com resultado
		return matcher.find();
	}





	private static String listar(Aluno[] aluno) {
		SimpleDateFormat spf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		for (int i = 0; i < MAX; i++) {
			if (aluno[i] != null) {
				saida += "Matricula: " + aluno[i].matricula + "\nNome: "
						+ aluno[i].nome + "\nData de Nascimento: "
						+spf.format(aluno[i].dataNascimento) + "\nSexo: " + aluno[i].sexo
						+ "\n\n";
			}

		}
		return saida;
	}



















# Instantiating a GregorianCalendar

Calendar calendar = new GregorianCalendar();


# Accessing Year, Month, Day etc.

Calendar calendar = new GregorianCalendar();

int year       = calendar.get(Calendar.YEAR);
int month      = calendar.get(Calendar.MONTH); 
int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH); // Jan = 0, not 1
int dayOfWeek  = calendar.get(Calendar.DAY_OF_WEEK);
int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
int weekOfMonth= calendar.get(Calendar.WEEK_OF_MONTH);

int hour       = calendar.get(Calendar.HOUR);        // 12 hour clock
int hourOfDay  = calendar.get(Calendar.HOUR_OF_DAY); // 24 hour clock
int minute     = calendar.get(Calendar.MINUTE);
int second     = calendar.get(Calendar.SECOND);
int millisecond= calendar.get(Calendar.MILLISECOND);



Calendar calendar = new GregorianCalendar();

calendar.set(Calendar.YEAR, 2009);
calendar.set(Calendar.MONTH, 11); // 11 = december
calendar.set(Calendar.DAY_OF_MONTH, 24); // christmas eve

etc.


# Adding and Subtracting to Year, Month, Day etc.

Calendar calendar = new GregorianCalendar();

//set date to last day of 2009
calendar.set(Calendar.YEAR, 2009);
calendar.set(Calendar.MONTH, 11); // 11 = december
calendar.set(Calendar.DAY_OF_MONTH, 31); // new years eve

//add one day
calendar.add(Calendar.DAY_OF_MONTH, 1);

//date is now jan. 1st 2010
int year       = calendar.get(Calendar.YEAR);  // now 2010
int month      = calendar.get(Calendar.MONTH); // now 0 (Jan = 0)
int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH); // now 1


# To subtract from the fields call the add() method with negative values, like this:

calendar.add(Calendar.DAY_OF_MONTH, -1);



https://stackoverflow.com/questions/1555262/calculating-the-difference-between-two-java-date-instances?noredirect=1&lq=1
      Calendar calendar1 = Calendar.getInstance();
      Calendar calendar2 = Calendar.getInstance();
      calendar1.set(2012, 04, 02);
      calendar2.set(2012, 04, 04);
      long milsecs1= calendar1.getTimeInMillis();
      long milsecs2 = calendar2.getTimeInMillis();
      long diff = milsecs2 - milsecs1;
      long dsecs = diff / 1000;
      long dminutes = diff / (60 * 1000);
      long dhours = diff / (60 * 60 * 1000);
      long ddays = diff / (24 * 60 * 60 * 1000);

      System.out.println("Your Day Difference="+ddays);




http://tutorials.jenkov.com/java-date-time/java-util-calendar.html
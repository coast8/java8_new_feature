

https://www.devmedia.com.br/introducao-aos-default-methods-do-java-8/36876



public interface IAceleracao{
   default void acelerar(){
      System.out.println("Aceleração Constante");
   }

   default void desacelerar(){
      System.out.println("Desaceleração Constante");
   }
}

public abstract class Veiculo implements IAceleracao{
   Motor motor = new Motor();
}

public class Maverick extends Veiculo {
   public Maverick(){
      motor = new Motor("V8");
   }

   @Override
   public void acelerar() {
         System.out.println("Aceleração Super Rápida");
   }

   @Override
   public void desacelerar() {
         System.out.println("Desaceleração Lenta");
   }
}

public class Gol extends Veiculo {}

public class Fiesta extends Veiculo {}
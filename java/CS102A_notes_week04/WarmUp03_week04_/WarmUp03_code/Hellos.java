public class Hellos {   // Hellos.java
   public static void main (String[] args) {
      int LIMIT = Integer.parseInt( args[0] );
      
      for (int i = 1; i <= LIMIT; i++)
         System.out.println( i + orderPostfix(i) + " Hello" );
   }

   public static String orderPostfix (int n) {
      if (n%100 == 11 || n%100 == 12 || n%100 == 13) return "th";
      if (n%10 == 1) return "st";
      if (n%10 == 2) return "nd";
      if (n%10 == 3) return "rd";
      return "th";
   }
}

public class UnicodeCards {
   public static void main (String[] args) {
      char spade = '\u2660';
      String[] suits = { "\u2660", "\u2661", "\u2662", "\u2663" };
      System.out.printf( "spade = {%c}, suits ={%s}",
         spade, java.util.Arrays.toString( suits )
      );
   }
}
   
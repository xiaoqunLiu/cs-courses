public class TwelveDaysOfChristmas {
   public static void main (String[] args) {
      System.out.print( composeLyrics() );
   }

   public static String composeLyrics () {
      final String[] ORDER = { 
         "", "first", "second", "third", "forth", "fifth", "sixth",
         "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"
      };
      String lyrics = "The Twelve Days of Christmas -- Lyrics\n\n";
      for (int d = 1; d <= 12; d++ ) { 
         lyrics += "On the " + ORDER[d] + " day of Christmas,\n" +
            "my true love sent to me\n";
         switch (d) {
            case 12 : lyrics += "Twelve drummers drumming,\n"; 
            case 11 : lyrics += "Eleven pipers piping,\n"; 
            case 10 : lyrics += "Ten lords a-leaping,\n"; 
            case  9 : lyrics += "Nine ladies dancing,\n"; 
            case  8 : lyrics += "Eight maids a-milking,\n"; 
            case  7 : lyrics += "Seven swans a-swimming,\n"; 
            case  6 : lyrics += "Six geese a-laying,\n"; 
            case  5 : lyrics += "Five golden rings,\n"; 
            case  4 : lyrics += "Four calling birds,\n"; 
            case  3 : lyrics += "Three French hens,\n"; 
            case  2 : lyrics += "Two turtle doves,\n" + 
                         "And a partridge in a pear tree.\n\n"; 
                      break;
            case  1 : lyrics += "A partridge in a pear tree.\n\n"; break;
         }
      }
      return lyrics;
   }
}

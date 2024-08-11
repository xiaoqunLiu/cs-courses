/**
   Diamond.java
   @Max, 2017-03-27, 2018-04-02
   
       ( n, flash, blank )
Diamond( 6,  '*',  '.' ) 
  
.....*        <== barln(n-1, 1) = barln(5,1)
....***        || 
...*.*.*       || i = 2..5   [2..n-1]
..*..*..*      || bar(n-i,1) + bar(i-2,1) + barln(i-2,1)
.*...*...*     ||
***********   <== barln(0, 2*n-1) = barln(0,11)
.****.****     ||
..***.***      || i = 5..2   [n-1..2] (down to)
...**.**       || bar(n-i, i-1) + barln(1, i-1)
....*.*        || 
.....*        <== barln(n-1, 1) = barln(5,1)
   
*/

public class Diamond {
   public static void main (String[] args) {
      System.out.print( diamond() );
      System.out.print( diamond( 5 ) );
      System.out.print( diamond( 7, '$' ) );                           
      System.out.print( diamond( 6, '@', '.' ) );
   } 
   
   public static String diamond () {
      return diamond( 8, '*', ' ' );
   }
   public static String diamond (int n) {
      return diamond( n, '*', ' ' );
   }
   public static String diamond (int n, char flash) {
      return diamond( n, flash, ' ' );
   }

   private static char flash, blank;
   public static String diamond (int n, char flash, char blank) {
      Diamond.flash = flash;
      Diamond.blank = blank;
      String image = barln( n-1, 1 );
     
      for (int i = 2; i < n; i++) {
         image += bar( n-i, 1);
         image += bar( i-2, 1);
         image += barln( i-2, 1);
      }
     
      image += barln( 0, 2*n - 1 );
     
      for (int i = n-1; i > 1; i--) {
         image += bar( n-i, i-1 );
         image += barln( 1, i-1 );
      }

      image += barln( n-1, 1 );
      
      return image;
   }
   
   private static String bar (int nBlank, int nFlash) {
      return repeatChars( nBlank, blank ) + repeatChars( nFlash, flash );
   }
   private static String barln (int nBlank, int nFlash) {
      return bar( nBlank, nFlash ) + '\n';
   }
   private static String repeatChars (int n, char c) {
      String s = "";
      while (n-- > 0) s += c;
      return s;
   }
}


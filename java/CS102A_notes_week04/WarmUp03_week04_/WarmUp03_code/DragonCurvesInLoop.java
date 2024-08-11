public class DragonCurvesInLoop {
   public static void main (String[] args) {
      int n = Integer.parseInt( args[0] );
      
      String d = "F", r = "F";
      for (int i = 0; i <= n; i++) {
         System.out.printf( "%d : %s\n", i, d );
         String d_ = d, r_ = r;
         d = d_ + "L" + r_;
         r = d_ + "R" + r_;
      }
   }
}

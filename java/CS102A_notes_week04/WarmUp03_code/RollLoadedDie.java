import java.util.Arrays;

public class RollLoadedDie {   // RollLoadedDie.java
   public static void main (String[] args) {
      int N = Integer.parseInt( args[0] );
      int[] count = new int[6];
      for (int t = 0; t < N; t++)
         count[ rollDie()-1 ]++;
         
      double[] frenquency = new double[6];
      for (int i = 0; i < 6; i++)
         frenquency[i] = (double)count[i] / N;
      
      System.out.println( Arrays.toString(count) );
      System.out.println( Arrays.toString(frenquency) );
   }

   public static int rollDie () {
      int die = 1 + (int)(Math.random() * 8);
      if (die > 6) die = 6;
      return die;
   }
}

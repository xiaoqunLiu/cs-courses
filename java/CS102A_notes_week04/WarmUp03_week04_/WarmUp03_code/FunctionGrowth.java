public class FunctionGrowth {   // FunctionGrowth.java
   public static void main (String[] args) {
      System.out.printf( "%10s%10s%20s%10s%20s%20s\n",
         "log(n)", "n", "n*log(n)", "n^2", "n^3", "2^n" 
      );
      long n = 16;
      while (n <= 2048) {
         System.out.printf( "%10f%10d%20f%10d%20d%20e\n",
            Math.log(n), n, n*Math.log(n), n*n, n*n*n, Math.pow(2,n)
         );
         n *= 2;
      }
   }
}

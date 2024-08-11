import static java.lang.System.out;
import java.util.Arrays;
public class MyMath {
   public static int max (int... numbers) {  //  Varargs
      int max = numbers[0];
      for (int i = 1; i < numbers.length; i++)
         if (max < numbers[i]) max = numbers[i];
      return max;
   }

   public static double max (double... numbers) {  //  Varargs
      double max = numbers[0];
      for (int i = 1; i < numbers.length; i++)
         if (max < numbers[i]) max = numbers[i];
      return max;
   }

   public static int max3 (int a, int b, int c) {   // Exe 2.1.1
      return max( a, b, c ); 
   }
         
   public static double max3 (double a, double b, double c) {  // Exe 2.1.1
      return max( a, b, c ); 
   }
   
   public static boolean odd (boolean p, boolean q, boolean r) {  // Exe 2.1.2
      return p ^ q ^ r;   // Exclusive OR operator: T^T=F, F^F=F, T^F=T, F^T=T
   }
   
   public static boolean majority (boolean p, boolean q, boolean r) { // E 2.1.3
      return p&&q || q&&r || p&&r;
   }
   
   public static boolean eq (int[] a, int[] b) {  // Exe 2.1.4
      if (a.length != b.length) return false;
      for (int i = 0; i < a.length; i++)
         if (a[i] != b[i]) return false;
      return true;
   }
   
   public static boolean areTriangular (double a, double b, double c) { // E 2.1.5
      return a+b > c && b+c > a && c+a > b;
   }
   
   public static double sqrt (double a) {  // Exe 2.1.7
      double t = a, t_;
      do {
         t_ = t; 
         t = 0.5 * (t_ + a/t_);
      } while (t != t_);
      return t;
   }
   
   public static double lg (double n) {    // Exe 2.1.9
      return Math.log(n)/Math.log(2.0);
   }
   
   public static int lg (int n) {    // Exe 2.1.10
      int p = 0;
      while (n > 1) {
         p++;
         n >>= 1;
      }
      return p;
   }
   
   public static int signum (int n) {    // Exe 2.1.11
      if (n < 0) return -1;
      if (n > 0) return 1;
      return 0;
   }

   public static void main (String[] args) {
      out.println( "max(1,2,3,4,3,2,1) = " + max(1,2,3,4,3,2,1) );
      out.println( "max(1.0,2,3,4,3,2,1) = " + max(1.0,2,3,4,3,2,1) );
      out.println( "max(.99) = " + max(.99) );
      out.println( "max3(3,4,5) = " + max3(3,4,5) );
      out.println( "max3(1.0,8,9) = " + max3(1.0,8,9) );

      final boolean T = true, F = false;
      out.println( "odd(T,T,T) = " + odd(T,T,T) );
      out.println( "odd(T,T,F) = " + odd(T,T,F) );
      out.println( "odd(T,F,T) = " + odd(T,F,T) );
      out.println( "odd(T,F,F) = " + odd(T,F,F) );
      out.println( "odd(F,T,T) = " + odd(F,T,T) );
      out.println( "odd(F,T,F) = " + odd(F,T,F) );
      out.println( "odd(F,F,T) = " + odd(F,F,T) );
      out.println( "odd(F,F,F) = " + odd(F,F,F) );
      
      out.println( "majority(T,T,T) = " + majority(T,T,T) );
      out.println( "majority(T,T,F) = " + majority(T,T,F) );
      out.println( "majority(T,F,T) = " + majority(T,F,T) );
      out.println( "majority(T,F,F) = " + majority(T,F,F) );
      out.println( "majority(F,T,T) = " + majority(F,T,T) );
      out.println( "majority(F,T,F) = " + majority(F,T,F) );
      out.println( "majority(F,F,T) = " + majority(F,F,T) );
      out.println( "majority(F,F,F) = " + majority(F,F,F) );
      
      int[] a = {1,2};
      int[] b = {1,2,3};
      int[] c = {1,2,3};
      out.println( "a = " + Arrays.toString(a));
      out.println( "b = " + Arrays.toString(b));
      out.println( "c = " + Arrays.toString(c));
      out.println( "eq(a,b) = " + eq(a,b));
      out.println( "eq(b,c) = " + eq(b,c));
      
      out.println( "areTriangular(3,4,5) = " + areTriangular(3,4,5) );
      out.println( "areTriangular(3,2,5) = " + areTriangular(3,2,5) );
      out.println( "areTriangular(2,2.5,5) = " + areTriangular(2,2.5,5) );

      out.println( "sqrt(2) = " + sqrt(2) );
      out.println( "sqrt(3.0) = " + sqrt(3.0) );

      out.println( "lg(100.0) = " + lg(100.0) );
      out.println( "lg(100) = " + lg(100) );
      
      out.println( "signum(-100) = " + signum(-100) );
      out.println( "signum(0) = " + signum(0) );
      out.println( "signum(5) = " + signum(5) );
   }     
}   
   
      
   

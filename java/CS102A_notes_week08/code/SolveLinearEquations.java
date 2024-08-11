import java.util.Scanner;
public class SolveLinearEquations {   // Exercise 5, Question 3
   public static void main (String[] args) {
      double[][] a = new double[2][2];
      double[] b = new double[2];
      Scanner in = new Scanner( System.in );
      System.out.print( "Enter a00, a01, a10, a11, b0, b1: " );
      a[0][0] = in.nextDouble();  a[0][1] = in.nextDouble(); 
      a[1][0] = in.nextDouble();  a[1][1] = in.nextDouble(); 
      b[0] = in.nextDouble();  b[1] = in.nextDouble(); 
      
      double[] root = linearEquation( a, b );
      if (root != null) 
         System.out.println( "x is " + root[0] + " and y is " + root[1] );
      else 
         System.out.println( "The equation has no solution" );
   }
   
   public static double[] linearEquation (double[][] a, double[] b) {
      double temp = a[0][0]*a[1][1] - a[0][1]*a[1][0];
      if (temp == 0.0) return null;
      
      double[] root = new double[2];
      root[0] = (b[0]*a[1][1] - b[1]*a[0][1]) / temp;
      root[1] = (b[1]*a[0][0] - b[0]*a[1][0]) / temp;
      return root;
   }   
}

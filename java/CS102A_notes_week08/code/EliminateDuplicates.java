// Exe 7.15, Page 279, Liang's Book
import java.util.Arrays;
public class EliminateDuplicates {
  public static void main (String[] args) {
  	 int[] a1 = { 1, 2, 3, 2, 1, 6, 3, 4, 5, 2 };
  	 int[] a2 = eliminateDuplicates( a1 );
    System.out.println( Arrays.toString( a1 ) );
    System.out.println( Arrays.toString( a2 ) );
  }
  	
  public static int[] eliminateDuplicates (int[] list) {
  	 int[] temp = new int[ list.length ];
  	 int count = 0;
  	 for (int num : list)
  		if (!including( temp, count, num ))
  			temp[ count++ ] = num;
  	 int[] result = new int[count];
  	 System.arraycopy( temp, 0, result, 0, count );
  	 return result;
  }
  
  private static boolean including (int[] list, int limit, int n) {
  	 for (int i = 0; i < limit; i++)
  	   if (list[i] == n) return true;
  	 return false;
  }
}

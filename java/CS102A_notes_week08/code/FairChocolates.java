import java.util.Arrays;
public class FairChocolates {
  public static void main (String[] args) {
    for (int x = 1; x <= 40; x++) {
      int[] initChoc = new int[] { 12, 24, 8, 22, 15, 4, 8, 6, x };
      System.out.println( Arrays.toString( initChoc ) );
      int[] result = fairPlay( initChoc );  // return {round, owns}
      System.out.printf( 
        "After looping %d times, each kid get %d chocolates.\n\n",
        result[0], result[1]
      ); 
    }
  }
  	
  public static int[] fairPlay (int[] hold) { // return {round, owns}
  	 final int LENGTH = hold.length;
    int[] half = new int[ LENGTH ];
    int round = 0;
    while (! isEqualAll( hold )) {
   	for (int i = 0; i < LENGTH; i++)
        half[i] = hold[i] / 2;
      for (int i = 0; i < LENGTH; i++)
        hold[i] = half[i] + half[ (i-1 + LENGTH) % LENGTH ];
        // Alternative... + half[ (i==0 ? LENGTH : i) - 1 ];
      round++;
    }
    return new int[] { round, hold[0] };
  }

  private static boolean isEqualAll (int[] a) {
  	 for (int i = 1; i < a.length; i++)
  	   if (a[i] != a[0]) return false;
  	 return true;
  } 
}


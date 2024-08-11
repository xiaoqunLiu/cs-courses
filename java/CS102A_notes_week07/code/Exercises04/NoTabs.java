public class NoTabs {
	public static void main (String[] args) {
		String t = "\\tabcde\\t1234\\txyz\\tABCDEFGHIJKLMN\\tOK\\n";
      String s = "\tabcde\t1234\txyz\tABCDEFGHIJKLMN\tOK\n";
      System.out.println( t );
      System.out.print( s );
      for (int n = 2; n <= 10; n++)
         System.out.print(	noTabs(s, n) );	
   }

   public static String noTabs (String s, int position) {
  	   String result = "";
  	   for (int i = 0; i < s.length(); i++) 
  		   result += s.charAt(i) != '\t' ? s.substring(i, i+1) : 
  		             blanks( position - result.length() % position );
  	   return result;
   }
  
   public static String blanks (int n) {
  	   String s = "";
  	   while (n-- > 0) s += ".";   // use '.' instead of ' ' for clarity 
  	   return s;
   }
}

  
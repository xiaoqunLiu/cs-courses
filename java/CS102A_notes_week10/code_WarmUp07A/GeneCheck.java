public class GeneCheck {
   public static void main (String[] args) {
      System.out.println( isPotentialGene( args[0] ) );
   }
   public static boolean isPotentialGene (String dna) {
      final int LENGTH = dna.length();
      if (LENGTH%3 != 0) return false;
      if (!dna.startsWith( "ATG" )) return false;
      for (int i = 3; i < LENGTH-3; i += 3) {  
         String codon = dna.substring( i, i+3 ); 
         if (isStopCodon( codon ))  return false;
      }
      String lastCodon = dna.substring( LENGTH-3, LENGTH );
      return isStopCodon( lastCodon );
   }
   public static boolean isStopCodon (String s) {
      return "TAA".equals(s) || "TGA".equals(s) || "TAG".equals(s);
   }   
}

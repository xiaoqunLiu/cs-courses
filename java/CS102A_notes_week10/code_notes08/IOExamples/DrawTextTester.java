/******************************************************************************
 *  Compilation:  javac PlotFilter.java
 *  Execution:    java PlotFilter < input.txt
 *  Dependencies: StdDraw.java StdIn.java
 *  
 *  % java PlotFilter < USA.txt
 *
 *  Datafiles:    http://www.cs.princeton.edu/IntroProgramming/15inout/USA.txt
 *
 ******************************************************************************/
 
import java.awt.Font;
 
public class DrawTextTester { 

  public static void main(String[] args) {
    final int WIDTH = 800, HEIGHT = 800;
    StdDraw.setCanvasSize( WIDTH, HEIGHT);
    
    StdDraw.clear( StdDraw.BLUE );
    StdDraw.setPenColor( StdDraw.WHITE);
    Font font = new Font("Arial", Font.BOLD, 60);
    StdDraw.setFont(font);
    StdDraw.text( 0.5, 0.4, "Hello, World");

    font = new Font("黑体", Font.PLAIN, 80);
    StdDraw.setFont( font);
    StdDraw.setPenColor( StdDraw.MAGENTA);
    StdDraw.text( 0.5, 0.5, "中文测试");
    
    font = new Font("黑体", Font.PLAIN, 50);
    StdDraw.setFont( font);
    StdDraw.setPenColor( StdDraw.YELLOW);
    StdDraw.text( 0.5, 0.7, "汉字", 90);
    
    String s = "科技";
    int fontHeight = 90;
    font = new Font("黑体", Font.PLAIN, fontHeight);
    double x = 0.5, y = 0.8;
    /*
    StdDraw.setPenColor( StdDraw.BLACK);
    StdDraw.filledRectangle( x, y, 
      0.5 * (new FontMetrics( font).stringWidth( s)) / WIDTH, fontHeight
    );
    */
    
    StdDraw.setFont( font);
    StdDraw.setPenColor( StdDraw.YELLOW);
    StdDraw.text( x, y, s);

    StdDraw.show();

  }
}

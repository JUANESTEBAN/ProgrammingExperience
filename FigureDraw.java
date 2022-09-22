// FigureDraw.java

/**
+ A program that draws a pyramid inside slashes!
+
+ @author Juan Esteban Restrepo
+ @version
**/



class FigureDraw
{
    static void drawFigure() //This static method draws the pyramid.
    {
        final int N = 5;
        for (int line = 1; line <= N; line++) //This outer for loop goes through every line from 1 to N
        {
            for (int i = 1; i<=((N - 1)*(N - 1) - (N - 1)*(line - 1)); i = i + 1 ) //This inner for loop draws(horizontally) (N - 1)^2
            // forward slashes on first line(line = 1) and draws (N - 1)*(line - 1) fewer forward slashes for every other line.
            {
                System.out.print ("/");
            }
            for (int i = 1;  i<=2*(N - 1)*(line - 1); i = i + 1) //This inner for loop draws(horizontally) 2*(N - 1)*(line - 1) asterisks on each line.
            {
                System.out.print ("*");
            }
            for (int i = 1; i<=((N - 1)*(N - 1) - (N - 1)*(line - 1)); i = i + 1) //This inner loop draws(horizontally) (N - 1)^2 back slashes on first line(line = 1)
            // and draws (N - 1)*(line - 1) fewer back slashes for every other line.
            {
                System.out.print ("\\");
            }
            System.out.println();
        }
    }

    public static void main (String [] args)
    {
        drawFigure(); //drawFigure is summoned inside the main method to draw the pyramid.

    }
}
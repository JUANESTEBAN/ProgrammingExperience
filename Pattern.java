// Pattern.java

/**
+ A program that prints a triangle of asterisks given its height.
+
+ @author Juan Esteban Restrepo
+ @version
**/



class Pattern
{
    static void drawTriangle() //This static method draws the triangle.
    {
        final int N = 5; //N is the height of the triangle(whose base is equal to the height and starts from the base at the top).
        for (int line = 1; line <= N; line++) //This outer for loop goes through every triangle line from 1 to N
        {
            for (int i = 1; i<=(line - 1); i = i + 1) //This inner for loop draws(horizontally) line - 1 spaces for the respective line.
            {
                System.out.print (" ");
            }
            for (int i = 1;  i<=(N + 1 - line); i = i + 1) //This inner for loop draws(horizontally) N + 1 - line asterisks on each line.
            {
                System.out.print ("*");
            }

            System.out.println();
        }
    }

    public static void main(String [] args)
    {
        drawTriangle(); //This summons the drawTriangle method and the desired triangle is drawn.
    }
}
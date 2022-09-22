// Drawing.java

/**
+ A program that draws upward and downward bowls.
+
+ @author Juan Esteban Restrepo
+ @version
**/

class Drawing
{
    static void top() //This static method draws upward bowls.
    {
        System.out.println("  _______  "); //7 underscore characters are drown at the top with 2 blank spaces on the left and right
        System.out.println(" /       \\ "); //1 forward slash followed by 7 underscores and 1 back slash are drown on the middle with  1 blank space to the left and right
        System.out.println("/         \\"); //Finally, 1 forward slash followed by 9 blank spaces and 1 back slash.
    }

    static void bottom() //This static method draws downward bowls.
    {
        System.out.println("\\         /"); //1 back slash followed by 7 underscores and 1 forward slash are drown on the top
        System.out.println(" \\_______/ "); //1 back slash followed by 7 underscores and 1 forward slash  with 1 blank space right and left are drown at bottom.
    }

    public static void main(String [] args)
    {
        top(); //The following list of commands draws the figures we want.
        bottom();
        System.out.println();
        System.out.println("_\"_\'_\"_\'_\"_");
        System.out.println();
        System.out.println();
        top();
        bottom();
        System.out.println();
        System.out.println();
        System.out.println("_\"_\'_\"_\'_\"_");
        bottom();
        System.out.println();
        System.out.println();
        top();
        System.out.println("_\"_\'_\"_\'_\"_");
        bottom();
    }
}
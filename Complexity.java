// Complexity.java

/**
+ A program that prints the word Diamond by forming a diamond shape.
+
+ @author Juan Esteban Restrepo
+ @version
**/



class Complexity
{
    static void print4x() //This static method prints a phrase 4 times.
    {
        System.out.println ("Controlling complexity is the essence of programming!");
        System.out.println ("Controlling complexity is the essence of programming!");
        System.out.println ("Controlling complexity is the essence of programming!");
        System.out.println ("Controlling complexity is the essence of programming!");
    }

    static void print16x() //This method relies on the previous method by summoning the previous method 4 times. This has the result of printing the phrase 16 times.
    {
        print4x();
        print4x();
        print4x();
        print4x();
    }

    public static void main(String [] args) //To print the phrase 64 times, we summon print4x 4 times and print16x 3 times (4*4 + 3*16 = 64)
    {
        print4x();
        print4x();
        print4x();
        print4x();
        print16x();
        print16x();
        print16x();
    }

}
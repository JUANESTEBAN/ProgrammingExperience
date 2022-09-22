// DooBee.java

/**
+ A program that prints DooBee 6 times followed by a Do!
+
+ @author Juan Esteban Restrepo
+ @version
**/

class DooBee
{

    public static void main(String [] args)
    {
        int repetitions = 6; //6 repetitions are needed for this problem.
        for(int i = 1; i<=repetitions; i++) //DooBee is printed(horizontally) 6 times with no spacing.
        {
            System.out.print("DooBee");
        }
        System.out.println(" Do");//Followed by a " Do"
    }
}
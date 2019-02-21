public class Try_MultiCatch_block {
    public static void main( String args[ ] )
    {
        int x = 5 , y = 0 , z;
        String children[] = { "Child 1", "Child 2", "Child 3" };

        try
        {
            System.out.println(z = x/y);
            System.out.println(children[3]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division by zero. " + e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index problem. " + e);
        }
    }
}

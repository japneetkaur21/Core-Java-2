public class Try_Finally_block {
    public static void main(String args[])
    {
        int marks[] = { 76, 57, 83, 46, 38 };
        System.out.println("OKAY 1");

        try
        {
            System.out.println(marks[3]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error: " + e);
        }
        finally
        {
            System.out.println("OKAY 2");
        }
        System.out.println("OKAY 3");
    }
}

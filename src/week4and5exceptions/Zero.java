package week4and5exceptions;
//********************************************************************
//  Zero.java       Author: Lewis/Loftus
//
//  Demonstrates an uncaught exception.
//********************************************************************

public class Zero
{
	//-----------------------------------------------------------------
	//  Deliberately divides by zero to produce an exception.
	//-----------------------------------------------------------------
	public static void main (String[] args) throws IllegalArgumentException {
		int numerator = 10;
		int denominator = 0;

		try {
			System.out.println ("1");
			System.out.println (numerator / denominator);
			System.out.println ("2");
			System.out.println ("2");
			System.out.println ("2");
			System.out.println ("2");
			System.out.println ("2");
			System.out.println ("2");


		}
		catch (Exception ex) {
			System.out.println ("Hi");
			throw new IllegalArgumentException();
		}
		finally{
			System.out.println("score");

		}
		System.out.println ("This text will not be printed.");
	}







/*
	public class Small {
	   pubic int smallest (int a, int b) {

            if (a < b)
                return a;

            return b;
        }
}

	@Test
	public void test1 () {
	    Small s = new Small();
	    Assert.assertEquals (2, s.smallest(2, 3));
	    Assert.assertEquals (2, s.smallest (4,2));
        }

    @Test (expected = Exception.class)
    public void test2 () {
        Small s = new Small();
        s.smallest (2,2);

     */




}




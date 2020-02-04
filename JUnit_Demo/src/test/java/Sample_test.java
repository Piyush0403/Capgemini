import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Sample_test 
{
	@Test
	public void SimpletestPass()
	{
		int a=1;
		int b=2;
		assertTrue(a+b==3);
	}

	
	@Test
	public void SimpletestFail()
	{
		int a=1;
		int b=2;
		assertTrue(a+b==2);
	}
	
	
}

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class TestStack { 

	private Stack stack;
	
	@Before
	public void setUp()
	{
		stack = new Stack();
	}
	
	@Test
	public void testPush()
	{
		stack.push(10);					// Stack : 10 20 30 40 50 
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		int [] expectedArray = new int [100];
		expectedArray[0] = 10;
		expectedArray[1] = 20;
		expectedArray[2] = 30;
		expectedArray[3] = 40;
		expectedArray[4] = 50;
		for(int i=5;i<100;i++)
		{
			expectedArray[i] = 0;
		}
		assertArrayEquals(expectedArray,stack.array);
	}
	
	@Test
	public void testPushFull()			// testing for stack pull
	{
		for(int i=0;i<101;i++)
		{
			stack.push(i+1);
		}
	}
	
	@Test
	public void testPop()
	{
		stack.push(10);					// Stack : 10 20 30 40 50 
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		int expectedResult = 50;
		int result = stack.pop();
		assertEquals(expectedResult,result);
	}
	
	@Test
	public void testPopEmpty()
	{
		int result = stack.pop();

	}
	
	@Test
	public void testDisplayEmpty()
	{
		stack.display();
		boolean temp = false;
		if(stack.addPointer == 0)
		{
			temp = true;
		}
		boolean result = true;
		assertTrue(result == temp);
	}
	
	@Test
	public void testDisplay()
	{
		stack.push(10);					// Stack : 10 20 30 40 50 
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.display();
		int [] expectedArray = new int [100];
		expectedArray[0] = 10;
		expectedArray[1] = 20;
		expectedArray[2] = 30;
		expectedArray[3] = 40;
		expectedArray[4] = 50;
		for(int i=5;i<100;i++)
		{
			expectedArray[i] = 0;
		}
		assertArrayEquals(expectedArray,stack.array);
	}
}

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class TestMyStack {

	private MyStack stack;
	
	@Before
	public void setUp()
	{
		stack = new MyStack(10);
		
	}
	
	@Test
	public void testPush() throws Exception
	{
		stack.push(10);					// Stack : 10 20 30 40 50 
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		int [] expectedArray = {10,20,30,40,50,0,0,0,0,0};
		assertArrayEquals(expectedArray,stack.arraytostoreStack);
		
	}
	
	@Test
	public void testPushFull() throws Exception
	{
		try								// to test exception when stack is full
		{
			stack.push(10);
			stack.push(20);
			stack.push(30);
			stack.push(40);
			stack.push(50);
			stack.push(60);
			stack.push(70);
			stack.push(80);
			stack.push(90);
			stack.push(100);
			stack.push(2);
			
		}
		catch (Exception e) {
			System.out.println(e);
			
		}
	}
	
	@Test
	public void testTop() throws Exception
	{
		
		stack.push(10);				// Stack : 10 20 30 40 50 60
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		int expectedResult = 60;			// Get the latest added element
		int result = stack.top();
		assertEquals(expectedResult,result);
		
		
	}
	
	@Test
	public void testTopEmpty()			// to test exception when the stack is empty
	{
		try
		{
			int result = stack.top();
		}
		catch (Exception e) {
			System.out.println(e);
			
		}
	}
	
	@Test
	public void testPop() throws Exception
	{
		
		stack.push(10);				// Stack : 10 20 30 40 50 60
		stack.push(20);				// After pop : 10 20 30 40 50
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		int expectedResult = 60;
		int result = stack.pop();
		assertEquals(expectedResult,result);
		
	}
	
	@Test
	public void testPopEmpty()			// to test exception when the stack is empty
	{
		try
		{
			int result = stack.pop();
		}
		catch (Exception e) {
			System.out.println(e);
			
		}
	}
	
	@Test
	public void testSize() throws Exception
	{
		
		stack.push(10);				// Stack : 10 20 30 40 50 60
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		int expectedSize = 6;
		int result = stack.size();
		assertEquals(expectedSize,result);
		
	}
	
	@Test
	public void testSizeNotEqual() throws Exception
	{
		stack.push(10);				// Stack : 10 20 30 40 50 60
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		int expectedSize = 8;
		int result = stack.size();
		assertNotEquals(expectedSize,result);
		
	}
	
	@Test
	public void testDisplayEmpty()
	{
		stack.displayStack();
		boolean temp = false;
		if(stack.topPointer == -1)
		{
			temp = true;
		}
		boolean result = true;
		assertTrue(result == temp);
	}
	
	@Test
	public void testDisplay() throws Exception
	{
		
		stack.push(10);				// Stack : 10 20 30 40 50 60
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.displayStack();
		int [] expectedResult = {10,20,30,40,50,60,0,0,0,0};
		assertArrayEquals(expectedResult,stack.arraytostoreStack);
			
	}

}

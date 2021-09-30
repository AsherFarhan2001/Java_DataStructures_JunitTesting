import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;


public class TestQueue {

	private Queue que;
	
	@Before
	public void setUp()
	{
		que = new Queue(6);
	}
	
	@Test
	public void testEmpty()
	{ 
		boolean expectedResult = true;
		boolean result = que.empty();
		assertEquals(expectedResult,result);
	}
	
	@Test
	public void testNotEmpty() throws Exception
	{
		boolean expectedResult = false;
		que.enqueue(10);
		que.enqueue(15);
		boolean result = que.empty();
		assertTrue(expectedResult == result);
	}
	
	@Test
	public void testEnqueue() throws Exception
	{
		que.enqueue(10);
		que.enqueue(15);
		que.enqueue(20);
		que.enqueue(25);
		que.enqueue(30);
		int [] expectedResult = {10,15,20,25,30,0,0};
		assertArrayEquals(expectedResult,que.array);
	}
	
	@Test
	public void testEnqueueFull()
	{
		try
		{
			que.enqueue(10);
			que.enqueue(15);
			que.enqueue(20);
			que.enqueue(25);
			que.enqueue(30);
			que.enqueue(35);
			que.enqueue(40);
			que.enqueue(45);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	@Test
	public void testDequeueEmpty()
	{
		try
		{
			que.dequeue();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	@Test
	public void testDequeue() throws Exception
	{
		que.enqueue(10);
		que.enqueue(15);
		que.enqueue(20);
		que.enqueue(25);
		que.enqueue(30);
		que.enqueue(35);
		int result = que.dequeue();
		int expectedResult = 10;
		assertEquals(expectedResult,result);
	}
	
	@Test
	public void testSize() throws Exception
	{
		que.enqueue(10);
		que.enqueue(15);
		que.enqueue(20);
		que.enqueue(25);
		que.enqueue(30);
		que.enqueue(35);
		que.dequeue();
		int expectedSize = 5;
		int result = que.size();
		assertEquals(expectedSize,result);
	}
	
	@Test
	public void testDisplayEmpty()
	{
		que.display();
		int expectedResult = 0;
		assertEquals(expectedResult,que.sizeofQueue);
	}
	
	@Test
	public void testDisplay() throws Exception
	{ 
		que.enqueue(10);
		que.enqueue(15);
		que.enqueue(20);
		que.enqueue(25);
		que.enqueue(30);
		que.enqueue(35);
		que.display();
		int [] expectedResult = {10,15,20,25,30,35,0};
		assertArrayEquals(expectedResult,que.array);
		
	}

}

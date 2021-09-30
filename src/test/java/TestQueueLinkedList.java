import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class TestQueueLinkedList {

	private QueuesLinkedList queLL;
	
	@Before
	public void setUp()
	{
		queLL = new QueuesLinkedList();
	}
	
	@Test
	public void testEnqueue()
	{
		queLL.enqueue(14);						// queue : 14 5 16 22 19 25
		queLL.enqueue(5);
		queLL.enqueue(16);
		queLL.enqueue(22);
		queLL.enqueue(19);
		queLL.enqueue(25);
		int expectedResult = 14;
		assertEquals(expectedResult,queLL.head.key);
	}
	
	@Test
	public void testDequeueEmpty()
	{
		int result = queLL.dequeue();
		int expectedResult = -1;
		assertEquals(result,expectedResult);
	}
	
	@Test
	public void testDequeue()
	{
		queLL.enqueue(14);						// queue : 14 5 16 22 19 25
		queLL.enqueue(5);
		queLL.enqueue(16);
		queLL.enqueue(22);
		queLL.enqueue(19);
		queLL.enqueue(25);
		int result = queLL.dequeue();
		int expectedResult = 14;
		assertEquals(expectedResult,result);
	}
	
	@Test
	public void testNotDequeue()
	{
		queLL.enqueue(14);						// queue : 14 5 16 22 19 25
		queLL.enqueue(5);
		queLL.enqueue(16);
		queLL.enqueue(22);
		queLL.enqueue(19);
		queLL.enqueue(25);
		int result = queLL.dequeue();
		int expectedResult = 5;
		assertNotEquals(expectedResult,result);
	}
	
	@Test
	public void testDisplay()
	{
		queLL.enqueue(14);						// queue : 14 5 16 22 19 25
		queLL.enqueue(5);
		queLL.enqueue(16);
		queLL.enqueue(22);
		queLL.enqueue(19);
		queLL.enqueue(25);
		queLL.display();
		int expectedResult = 14;
		assertEquals(expectedResult,queLL.head.key);
	}
	
	@Test
	public void testDisplayEmpty()
	{
		queLL.display();
		boolean temp = false;
		if(queLL.head == null)
		{
			temp = true;
		}
		boolean expected = true;
		assertTrue(expected == temp);
	}
}

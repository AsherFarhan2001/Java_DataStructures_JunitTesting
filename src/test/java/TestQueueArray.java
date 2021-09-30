import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestQueueArray {

	private QueueArray quearr;
	
	@Before
	public void setUp()
	{
		quearr = new QueueArray(6);
	}
	
	@Test
	public void testEnqueue()
	{
		quearr.enqueue(10);
		quearr.enqueue(15);
		quearr.enqueue(20);
		quearr.enqueue(25);
		quearr.enqueue(30);
		int [] expectedResult = {10,15,20,25,30,0,0};
		assertArrayEquals(expectedResult,quearr.array);
	}
	
	@Test
	public void testEnqueueFull()
	{
		quearr.enqueue(10);
		quearr.enqueue(15);
		quearr.enqueue(20);
		quearr.enqueue(25);
		quearr.enqueue(30);
		quearr.enqueue(35);
		quearr.enqueue(40);
		quearr.enqueue(45);
	} 
	
	@Test
	public void testDequeueEmpty()
	{
		quearr.dequeue();
		int [] expectedArray = {0,0,0,0,0,0,0};
		assertArrayEquals(expectedArray,quearr.array);
		
	}
	
	@Test
	public void testDequeue()
	{
		quearr.enqueue(10);
		quearr.enqueue(15);
		quearr.enqueue(20);
		quearr.enqueue(25);
		quearr.enqueue(30);
		quearr.enqueue(35);
		int result = quearr.dequeue();
		int expectedResult = 10;
		assertEquals(expectedResult,result);
	}
	
	@Test
	public void testDisplayEmpty()
	{
		quearr.display();
		int expectedResult = 0;
		assertEquals(expectedResult,quearr.size);
	}
	
	@Test
	public void testDisplay() 
	{ 
		quearr.enqueue(10);
		quearr.enqueue(15);
		quearr.enqueue(20);
		quearr.enqueue(25);
		quearr.enqueue(30);
		quearr.enqueue(35);
		quearr.display();
		int [] expectedResult = {10,15,20,25,30,35,0};
		assertArrayEquals(expectedResult,quearr.array);
		
	}
}
